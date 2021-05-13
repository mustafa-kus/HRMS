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

@Table(name="employers")
@NoArgsConstructor
@AllArgsConstructor
public class Employer extends User
{
	@Id
    @GeneratedValue
    @Column(name="CampanyId")
	private int CampanyId;
	@Column(name="SectorId")
	private int SectorId;
	@Column(name="CampanyName")
	private String CampanyName;
	@Column(name="Url")
	private String Url;
	@Column(name="Phone")
	private String Phone;
	@Column(name="Rate")
	private short Rate;
	@Column(name="IsVerified")
	private boolean IsVerified;
	@Column(name="VerificationCode")
	private String VerificationCode;
}
