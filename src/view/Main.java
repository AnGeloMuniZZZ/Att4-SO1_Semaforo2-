package view;

import java.util.concurrent.Semaphore;

import controller.ThreadPiloto;

public class Main {

	public static void main(String[] args) {
		
		Semaphore semaforo = new Semaphore(5);
		for(int id = 1; id<15;id++) {
			Thread f1 = new ThreadPiloto(id,semaforo);
			f1.start();
		}
		
	}

}
