package controller;

import java.util.concurrent.Semaphore;

public class ThreadPiloto extends Thread {

	private int id;
	private Semaphore semaforo;
	private Semaphore semaforo1 = new Semaphore(1);
	private int tempo = 0;

	public ThreadPiloto(int id, Semaphore semaforo) {
		this.id = id;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		try {
			semaforo.acquire();
			correr();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			semaforo.release();
		}
	}

	private void correr() {
		try {
			switch (id) {
			case 1, 8:
				semaforo1.acquire();
				for (int volta = 0; volta < 3; volta++) {
					while (tempo < 500) {
						tempo = tempo + (int) ((Math.random() * 100) + 1);
					}
					System.out.println("Piloto N°" + id + " Tempo da volta " + tempo);
					tempo = 0;
				}
				semaforo1.release();
				break;
			case 2, 9:
				semaforo1.acquire();
				for (int volta = 0; volta < 3; volta++) {
					while (tempo < 500) {
						tempo = tempo + (int) ((Math.random() * 100) + 1);
					}
					System.out.println("Piloto N°" + id + " Tempo da volta " + tempo);
					tempo = 0;
				}
				semaforo1.release();
				break;
			case 3, 10:
				semaforo1.acquire();
				for (int volta = 0; volta < 3; volta++) {
					while (tempo < 500) {
						tempo = tempo + (int) ((Math.random() * 100) + 1);
					}
					System.out.println("Piloto N°" + id + " Tempo da volta " + tempo);
					tempo = 0;
				}
				semaforo1.release();
				break;
			case 4, 11:
				semaforo1.acquire();
				for (int volta = 0; volta < 3; volta++) {
					while (tempo < 500) {
						tempo = tempo + (int) ((Math.random() * 100) + 1);
					}
					System.out.println("Piloto N°" + id + " Tempo da volta " + tempo);
					tempo = 0;
				}
				semaforo1.release();
				break;
			case 5, 12:
				semaforo1.acquire();
				for (int volta = 0; volta < 3; volta++) {
					while (tempo < 500) {
						tempo = tempo + (int) ((Math.random() * 100) + 1);
					}
					System.out.println("Piloto N°" + id + " Tempo da volta " + tempo);
					tempo = 0;
				}
				semaforo1.release();
				break;
			case 6, 13:
				semaforo1.acquire();
				for (int volta = 0; volta < 3; volta++) {
					while (tempo < 500) {
						tempo = tempo + (int) ((Math.random() * 100) + 1);
					}
					System.out.println("Piloto N°" + id + " Tempo da volta " + tempo);
					tempo = 0;
				}
				semaforo1.release();
				break;
			case 7, 14:
				semaforo1.acquire();
				for (int volta = 0; volta < 3; volta++) {
					while (tempo < 500) {
						tempo = tempo + (int) ((Math.random() * 100) + 1);
					}
					System.out.println("Piloto N°" + id + " Tempo da volta " + tempo);
					tempo = 0;
				}
				semaforo1.release();
				break;
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
