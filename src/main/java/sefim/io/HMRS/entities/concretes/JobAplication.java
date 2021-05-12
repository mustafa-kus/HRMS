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
@Table(name="JobAplications")
@NoArgsConstructor
@AllArgsConstructor
public class JobAplication {
	@Id
    @GeneratedValue
    @Column(name="id")
	private int id;
	@Column(name="UserId")
	private int UserId;
	@Column(name="JobId")
	private int JobId;

}
