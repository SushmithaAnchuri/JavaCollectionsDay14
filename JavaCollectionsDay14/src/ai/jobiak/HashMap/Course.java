package ai.jobiak.HashMap;

public class Course {

	private String CourseId;
	private String title;
	private double durationhours;
	private double setfees;
	public Course(String courseId, String title, double durationhours, double setfees) {
		super();
		CourseId = courseId;
		this.title = title;
		this.durationhours = durationhours;
		this.setfees = setfees;
	}
	public Course(String string, int i, String string2) {
		// TODO Auto-generated constructor stub
	}
	public String getCourseId() {
		return CourseId;
	}
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getDurationhours() {
		return durationhours;
	}
	public void setDurationhours(double durationhours) {
		this.durationhours = durationhours;
	}
	public double getSetfees() {
		return setfees;
	}
	public void setSetfees(double setfees) {
		this.setfees = setfees;
	}
	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", title=" + title + ", durationhours=" + durationhours + ", setfees="
				+ setfees + "]";
	}
	
	
}
