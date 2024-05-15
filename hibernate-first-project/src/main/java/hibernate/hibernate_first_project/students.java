package hibernate.hibernate_first_project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class students {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "major")
	private String major;
	
	public students() {
		
	}
	
	public students(int id, String name, int age, String major) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
