package com.app.pojos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="events")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Events extends BaseEntity {

	private String title;
	
	@Column(name="Date_Time")
	private LocalDateTime dateTime;
	
	@Column(length=100)
	private String description;

}
