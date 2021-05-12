package sefim.io.HMRS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@Table(name="Users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
    @GeneratedValue
    @Column(name="id")
	private int id;
	@Column(name="MemeberId")
	private int memberId;
	@Column(name="MemberType")
	private int memberType;
	@Column(name="Email")
	private String email;
	@Column(name="Password")
	private String password;
}
