package cc.cai.demo.hibernate.entity.association.one2one;
/**
 * 通过 用户-身份证 模拟一对一关系
 * one to one
 * 数据库表结构:
 * table user{
 * userId primary key  int increment,
 * name varchar(32),
 * }
 * 
 * table IdCard{
 * idCardId primary key int increment,
 * carNumbe varchar(32),
 * userId forigen key reference user(userId)
 * }
 * 
 * ---------------------------------------
 * 
 * @author caitxj
 *
 */
public class User {

	private long userId;
	
	private String name;
	
	private IdCard idCard;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IdCard getIdCard() {
		return idCard;
	}

	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}
	
	
}
