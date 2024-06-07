package collections;

public class Attendance {
	String name;
	String batch;
	String email;
	long phone;

	public Attendance() {
		// TODO Auto-generated constructor stub
	}

	public Attendance(String name, String batch, String email, long phone) {
		this.name = name;
		this.batch = batch;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String toString() {
	return "(Name:"+name+",Batch:"+batch+",email:"+email+",phone:"+phone+")";
	}
}
