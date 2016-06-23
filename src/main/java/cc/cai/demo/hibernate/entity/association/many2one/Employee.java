package cc.cai.demo.hibernate.entity.association.many2one;

import java.util.Set;

public class Employee {

	private long id;
	
	private String name;
	
	private Set<Address> address;

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

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	
	
}
