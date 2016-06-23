package cc.cai.demo.hibernate.entity.association.one2one;

public class IdCard {

	private long idCardId;
	
	private String cardNum;
	
	private User user;

	public long getIdCardId() {
		return idCardId;
	}

	public void setIdCardId(long idCardId) {
		this.idCardId = idCardId;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
