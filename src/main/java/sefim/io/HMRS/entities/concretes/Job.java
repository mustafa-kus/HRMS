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

@Data
@Entity
@Table(name="jobs")
@NoArgsConstructor
@AllArgsConstructor
 
public class Job {
	@Id
    @GeneratedValue
    @Column(name="id")
	private @NonNull int id;
	@Column(name="SectorId")
	private @NonNull int SectorId;
	@Column(name="CampanyId")
	private @NonNull int CampanyId;
	@Column(name="PositionId")
	private @NonNull short PositionId;
	@Column(name="Requirements")
	private @NonNull String Requirements;
	@Column(name="Need")
	private @NonNull short Need;
}
