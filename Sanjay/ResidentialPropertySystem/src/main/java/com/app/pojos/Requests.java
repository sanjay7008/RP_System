
package com.app.pojos;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="requests")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Requests {

	@Enumerated(EnumType.STRING)
	private MaintenanceRequests type;
	
	private LocalDateTime dateTime;
}
