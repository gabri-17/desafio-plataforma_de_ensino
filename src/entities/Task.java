package entities;

public class Task extends Lesson {
	private String description;
	private int questionCount;

	public Task() {
		super();
	}
	
	

	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getQuestionCount() {
		return questionCount;
	}



	public void setQuestionCount(int questionCount) {
		this.questionCount = questionCount;
	}
	

	
	public Task(String title, String description, int questionCount) {
		super(title);
		this.description = description;
		this.questionCount = questionCount;
	}



	@Override
	public int duration() {
		return (5 * questionCount) * 60;
	}

}
