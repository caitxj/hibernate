package cc.cai.demo.hibernate.entity.one2many;

public class CredCard {

	private long id;
	
	private String credCardNumber;
	
	private Person person;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCredCardNumber() {
		return credCardNumber;
	}

	public void setCredCardNumber(String credCardNumber) {
		this.credCardNumber = credCardNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
