package cc.cai.demo.hibernate.entity.association.many2many;

import java.util.Set;

public class Teacher {

	private long id;
	
	private String name;
	
	private Set<Student> students;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	
	
	
}
