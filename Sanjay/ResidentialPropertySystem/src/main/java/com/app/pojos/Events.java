package com.app.pojos;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="events")
@Data
public class Events extends BaseEntity {

	private String title;
	
	@Column(name="Date_Time")
	private LocalDateTime dateTime;
	
	@Column(length=100)
	private String description;

	@ManyToOne
	@JoinColumn(name = "admin_join")
	private Admin admin;
	
	
	
	

	
}
