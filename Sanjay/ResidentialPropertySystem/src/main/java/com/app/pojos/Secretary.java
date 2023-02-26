package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="secretary")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude="password")

public class Secretary extends BaseEntity{

	@Column(length=40)
	private String name;
	
	@Column(name="flat_no")
	private String flatNumber;
	
	@Column(unique = true, length = 20)
	private String email;
	
	@Column(name="contact_no")
	private long contactNumber;
	
	@Column(length=20)
	private String password;

}
