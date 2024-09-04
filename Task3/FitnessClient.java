package com.evregent.CoreJAVA.Task3;
import java.util.Scanner;
public class FitnessClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FitnessInterface fitnessManager = new FitnessImp();
		
		while(true) {
			System.out.println("\n1. Add Workout \n2. Serach by ID \n3.Display All \n4. Exit");
			System.out.println(" Enter your choice (1,2,3,4):");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the ID :");
				String id = sc.next();
				System.out.println("Enter the name :");
				String name = sc.next();
				System.out.println("Enter the duration :");
				int duration = sc.nextInt();
				//sc.nextLine();
				
				Workout workout = new Workout();
				workout.setId(id);
				workout.setName(name);
				workout.setDuration(duration);
				String msg = fitnessManager.addWorkout(workout);
				System.out.println(msg);
				break;
			case 2:
			    System.out.println("Enter the ID:");
			    String searchId = sc.next();
			    fitnessManager.getAllWorkouts();
			    break;
			case 3:
				fitnessManager.getAllWorkouts();
				break;
			case 4:
				sc.close();
				System.exit(0);
			}
		}

	}

}
