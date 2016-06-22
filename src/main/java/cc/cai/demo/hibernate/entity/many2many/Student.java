package cc.cai.demo.hibernate.entity.many2many;

import java.util.Set;

public class Student {

	private long id;
	
	private String name;
	
	private Set<Teacher> teachers;

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

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	
}
