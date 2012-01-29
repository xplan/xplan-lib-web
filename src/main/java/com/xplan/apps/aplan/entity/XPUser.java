package com.xplan.apps.aplan.entity;  

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
 /**
  * 
  *    
  * XPUser   
  *    
  * Chivalrous   
  * Chivalrous   
  * 2011-12-23 上午11:58:20   
  * 采用hibernate注解的方式来生成映射
  * 可以参考完成其它的生成
  * @version 1.0.0   
  *
  */
@Entity
@Table(name="xp_user",catalog="xplan")
public class XPUser implements java.io.Serializable{
	
	private static final long serialVersionUID = -8781039312224414923L;

	private Integer id;
	
	private String username;
	
	private String password;
	
	private String sex;
	
	
	
	
	public XPUser(Integer id, String username, String password, String sex) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
	}
	
	
	

	public XPUser() {
		 
	}



	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "username", unique = true, nullable = false, length = 32)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name = "password", unique = true, nullable = false, length = 32)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "sex", unique = true, nullable = false, length = 10)
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}




	@Override
	public String toString() {
		return "XPUser [id=" + id + ", username=" + username + ", password="
				+ password + ", sex=" + sex + "]";
	}
	
	
	
	
}
