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
@Table(name="candidates")
@NoArgsConstructor
@AllArgsConstructor
public class Candidate extends User {
	@Id
    @GeneratedValue
    @Column(name="UserId")
	private int userId;
	@Column(name="FirstName")
	private String firstName;
	@Column(name="LastName")
	private String lastName;
	@Column(name="NationalId")
	private String nationalId;
	@Column(name="Rate")
	private short rate;
	@Column(name="VerificationCode")
	private String verificationCode;
	@Column(name="YearOfBird")
	private int YearOfBird;
}
