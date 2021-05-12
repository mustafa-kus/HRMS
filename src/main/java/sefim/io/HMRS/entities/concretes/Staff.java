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
@Table(name="Staffs")
@NoArgsConstructor
@AllArgsConstructor
public class Staff extends User
{
	@Id
    @GeneratedValue
    @Column(name="StaffId")
	private int StaffId;
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="LastName")
	private String LastName;
	@Column(name="Rate")
	private short Rate;
	@Column(name="IsActive")
	private boolean IsActive;
	
}
