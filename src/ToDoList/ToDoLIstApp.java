package ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoLIstApp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Task> tasks = new ArrayList<>();
		int nextId = 1;
		
		while(true) {
			System.out.println("   ");
			System.out.println(" ======= To Do List ======");
			System.out.println("");
			System.out.println("1. Add Task ");
			System.out.println("2. View Tasks ");
			System.out.println("3. Mark task as completed");
			System.out.println("4. Delete task ");
			System.out.println("5. Exit ");
			System.out.println();
			System.out.println("Enter your choice : ");
			int choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1: 
				System.out.println("Enter Task : ");
				String title = scan.nextLine();
				
				Task task = new Task(nextId, title);
				
				tasks.add(task);
				nextId++;
				
				System.out.println("Task added Successfully ");
				System.out.println();
				
				break;
				
			case 2:
				if(tasks.isEmpty()) {
					System.out.println("No tasks added yet. ");
				}else {
					System.out.println("====== YOUR TASKS ======");
						
					for (Task t : tasks) {
						String status;
							
						if(t.completed) {
							status = "completed";
						}else {
							status = "pending";
						}
							
						System.out.println(t.id +". " + t.title+ ". " +"["+ status+"]" );
					}
				}
				
				break;
				
			case 3:
				if(tasks.isEmpty()) {
					System.out.println("No tasks added yet. ");
				}else {
					System.out.println("====== YOUR TASKS ======");
						
					for (Task t : tasks) {
						String status;
							
						if(t.completed) {
							status = "completed";
						}else {
							status = "pending";
						}
							
						System.out.println(t.id +". " + t.title+ ". " +"["+ status+"]" );
					}
				}
				
				System.out.println("Enter task ID to complete : ");
				int id = scan.nextInt();
				
				boolean found = false;
				
				for (Task t : tasks) {
					if(t.id == id) {
						t.completed = true;
						found = true;
						
						System.out.println("Task marked as a Completed. ");
						break;
					}
				}
				
			case 4:
				if(tasks.isEmpty()) {
					System.out.println("No tasks added yet. ");
					break;
				}
				
				System.out.println("Enter task ID to delete : ");
				int deleteId = scan.nextInt();
				
				boolean deleted = false;
				
				for(Task t : tasks) {
					if(t.id == deleteId) {
						tasks.remove(t);
						deleted = true;
						
						System.out.println("Task deleted! ");
						break;
					}
				}
				
				if(!deleted) {
					System.out.println("Task not found ");
				}
				
				break;
				
			case 5:
				System.out.println("Thank you! ");
				scan.close();
				break;
				
			default: System.out.println("InValid Choice ");
			}
		}
	}
}

