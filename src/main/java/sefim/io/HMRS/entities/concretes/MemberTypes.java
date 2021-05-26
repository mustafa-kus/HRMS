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
@Table(name="membertypes")
@NoArgsConstructor
@AllArgsConstructor
public class MemberTypes {
	@Id
    @GeneratedValue
    @Column(name="id")
	private int id;
	@Column(name="membertype")
	private String memberType;
	
	
}
