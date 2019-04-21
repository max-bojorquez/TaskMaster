package TaskMaster;


public class Task {
	private String description;
	private int priority;
	private int month, day, year;
	private String status;
	
	
	public Task()
	{
		
	}
	
	public Task(String description, int prioirty, int month, int day, int year, String status)
	{
		this.description = description;
		this.priority = priority;
		this.month = month;
		this.day = day;
		this.year = year;
		this.status = status;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getPriority() {
		return priority;
	}


	public void setPriority(int priority) {
		this.priority = priority;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	

}
