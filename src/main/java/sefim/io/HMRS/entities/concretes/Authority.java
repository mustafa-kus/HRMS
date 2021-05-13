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
@Table(name="authorities")
@NoArgsConstructor
@AllArgsConstructor
public class Authority {
	@Id
    @GeneratedValue
    @Column(name="id")
	private int id;
	@Column(name="Name")
	private String Name;
	@Column(name="Code")
	private String Code;

}
