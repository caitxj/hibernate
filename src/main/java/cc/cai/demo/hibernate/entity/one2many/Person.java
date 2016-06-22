package cc.cai.demo.hibernate.entity.one2many;

import java.util.List;
import java.util.Set;
/**
 * 实例：一个人具有多张银行卡
 * one-to-many
 * @author caitxj
 *
 */
public class Person {

	private long id;
	
	private String name;
	
	private Set<CredCard> cards;

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

	public Set<CredCard> getCards() {
		return cards;
	}

	public void setCards(Set<CredCard> cards) {
		this.cards = cards;
	}

	
	
	
}
