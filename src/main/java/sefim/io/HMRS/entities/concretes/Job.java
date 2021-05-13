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
@Table(name="jobs")
@NoArgsConstructor
@AllArgsConstructor
public class Job {
	@Id
    @GeneratedValue
    @Column(name="id")
	private int id;
	@Column(name="SectorId")
	private int SectorId;
	@Column(name="CampanyId")
	private int CampanyId;
	@Column(name="PositionId")
	private short PositionId;
	@Column(name="Requirements")
	private String Requirements;
	@Column(name="Need")
	private short Need;
}
