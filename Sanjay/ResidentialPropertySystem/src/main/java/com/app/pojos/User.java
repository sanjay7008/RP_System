package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude="password")
public class User extends BaseEntity{

	@Column(length=40)
	private String name;
	
	@Column(name="flat_no")
	private String flatNumber;
	
	@Column(unique = true, length = 20)
	private String email;
	
	@Column(name="contact_no")
	private long contactNumber;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@Column(length=20)
	private String password;
	
	
}
