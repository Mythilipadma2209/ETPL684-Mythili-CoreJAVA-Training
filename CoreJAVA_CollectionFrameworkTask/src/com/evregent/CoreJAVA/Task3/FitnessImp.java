package com.evregent.CoreJAVA.Task3;
//implementation class of Interface
import java.util.HashSet;
import java.util.Set;

import com.evergent.CoreJAVA.Task2.Book;
public class FitnessImp implements FitnessInterface {
	Set<Workout> workoutSet;
	public FitnessImp() {
		workoutSet= new HashSet<Workout>();
	}
	@Override
	public String addWorkout(Workout w) {
		workoutSet.add(w);
		return w.getId();
	}

	@Override
	public void searchById(String id) {
		boolean found=false;
			for(Workout workout:workoutSet){
				if(workout.getId().equalsIgnoreCase(id)){
					System.out.println(workout.getId()+" "+workout.getName()+" "+workout.getDuration()+" mins ");	
					found=true;
					break;	
				}
			}
			if (!found) {
				System.out.println("The workout is not found");
			}
	}
	@Override
	public void getAllWorkouts() {
		if(workoutSet.isEmpty()) {
			System.out.println("Noworkout are available");
		}
		else {
			for (Workout workout : workoutSet) {
				System.out.println(workout.getId()+" "+workout.getName()+" "+workout.getDuration()+" mins");
			}
		}	
	}
}
