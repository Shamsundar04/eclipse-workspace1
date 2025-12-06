package in.blc;

public class TaskManagement {

	private String title;
	private String description;
	private String priority;
	private boolean isCompleted;

	public TaskManagement(String title, String description, String priority) {
		super();
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.isCompleted=false;
	}
	
	public void updateDescription(String newDescription) {

	}

	public void updatePriority(String newPriority) {

	}

	public void markAsCompleted() {

	}

	public String getTitle() {
		return this.title;
	}

	public String getDescription() {
		
		return this.description;

	}

	public String getPriority() {
		return this.priority;

	}
	
	public boolean isCompleted() {
		return isCompleted;
	}

}
