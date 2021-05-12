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
@Table(name="Positions")
@NoArgsConstructor
@AllArgsConstructor
public class Position {
	@Id
    @GeneratedValue
    @Column(name="id")
	private int id;
	@Column(name="SectorId")
	private int SectorId;
	@Column(name="Position")
	private String Position;
}
