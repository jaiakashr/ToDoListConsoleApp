package ToDoList;

public class Task {
	
	private int id;
	private String title;
	private boolean completed;
	
	public Task(int id, String title ) {
		this.id = id;
		this.title = title;
		this.completed = false;
	}

	public int getId(){
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public boolean getCompleted() {
		return completed;
	}
	
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		
		String status;
		if(completed) {
			status = "completed";
		}else {
			status = "pending";
		}
		
		return getId() +". " + getTitle()+ ". " +"["+ status+"]";
//		return "Task [id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}

	

	
}