package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "admins_tbl")
@Data
public class Admin extends BaseEntity {
@Column(name = "first_name", length = 20, nullable = false)
	private String firstName;
@Column(name = "last_name", length = 20)
	private String lastName;
@Column(name = "contact_no")
	private int contactNo;
@Column(name = "email",length = 50, nullable = false, unique = true)
	private String email;
@Column(name = "password", nullable = false)
	private String password;
	
@OneToOne
@JoinColumn(name = "resident_join")
@MapsId
private Resident resident;


@OneToMany(mappedBy = "admin", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true )
private List<Events> eventsList=new ArrayList<Events>();




}
