
package com.app.pojos;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="requests_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Requests extends BaseEntity{

	@Enumerated(EnumType.STRING)
	private MaintenanceRequests type;
	
	private LocalDateTime dateTime;
	
	@Column(length=150)
	private String status;
	

	@ManyToMany
	@JoinTable(name="requests_flats",
	joinColumns = @JoinColumn(name="flat_id"),
	inverseJoinColumns = @JoinColumn(name="request_id"))
	private Set<Flat>flatset=new HashSet<Flat>();


	@Override
	public String toString() {
		return "Requests [type=" + type + ", dateTime=" + dateTime + ", status=" + status + ", flatset=" + flatset
				+ ", getId()=" + getId() + "]";
	}


	
	
	
}
