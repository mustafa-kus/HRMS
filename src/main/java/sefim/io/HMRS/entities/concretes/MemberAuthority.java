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
@Table(name="MemberAuthorities")
@NoArgsConstructor
@AllArgsConstructor
public class MemberAuthority {
	@Id
    @GeneratedValue
    @Column(name="Memberid")
	private int MemberId;
	@Column(name="AuthortiyId")
	private short AuthortiyId;
}
