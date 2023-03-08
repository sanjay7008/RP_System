package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Table(name="resident_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@ToString(exclude="password")
@Entity
public class Resident extends BaseEntity {

	@Column(length=40,nullable = false)
	private String name;
	
	//@Column(name="flat_no", nullable = false)
	//private String flatNumber;
	
	@Column(unique = true, length = 20,nullable = false)
	private String email;
	
	@Column(name="contact_no",nullable = false)
	private int contactNumber;
	
	@Column(length=20, nullable = false)
	private String password;

	@ManyToOne
	@JoinColumn(name = "serviceprovider_join")
	private ServiceProvider serviceProvider;
	
 
	@OneToMany(mappedBy = "resident", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Flat> flatlist=new ArrayList<>();
	
	@OneToOne(mappedBy = "resident", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	private Admin admin;

	
	
	
	
	
	
}
