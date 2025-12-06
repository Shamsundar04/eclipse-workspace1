package in.elc;

import in.blc.TaskManagement;

public class TaskManagementElc {

	public static void main(String[] args) {
		
		TaskManagement taskMgmt=new TaskManagement("Complete Project", "Finish the Java project by Friday", "High");
		
		System.out.println(taskMgmt.getTitle());
		System.out.println(taskMgmt.getDescription());
		System.out.println(taskMgmt.getPriority());
		System.out.println(taskMgmt.isCompleted());
	}

}
