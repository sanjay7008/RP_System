package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name="flats_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Flat extends BaseEntity {
	
	@Column(name="flat_no", nullable = false)
	private int flatNumber;
	
	@Column(name="floor_no", nullable = false)
	private int floorNumber;
	
	@Column(length=5, nullable = false)
	private String wing;
	
	@ManyToOne
	@JoinColumn(name = "resident_join")
	private Resident resident;

	@Override
	public String toString() {
		return "Flat [flatNumber=" + flatNumber + ", floorNumber=" + floorNumber + ", wing=" + wing + ", resident="
				+  ", getId()=" + getId() + "]";
	}

	
}
