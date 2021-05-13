package sefim.io.HMRS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Entity
@Table(name="users")

public class User {
	@Id
    @GeneratedValue
    @Column(name="id")
	private int id;
	@Column(name="memberid")
	private int memberId;
	@Column(name="membertype")
	private int memberType;
	@Column(name="memberemail")
	private String email;
	@Column(name="password")
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, int memberId, int memberType, String email, String password) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.memberType = memberType;
		this.email = email;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getMemberType() {
		return memberType;
	}
	public void setMemberType(int memberType) {
		this.memberType = memberType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
