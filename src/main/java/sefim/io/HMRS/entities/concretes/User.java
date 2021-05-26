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
import lombok.NonNull;
import lombok.Setter;



@Data
@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
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
	
	
}
