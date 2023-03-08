package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="serviceprovider_tbl")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@ToString(exclude="password")

public class ServiceProvider extends BaseEntity{

	@Column(length=40)
	private String name;
	
	//@Column(name="flat_no")
	//private String flatNumber;
	
	@Column(unique = true, length = 20)
	private String email;
	
	@Column(name="contact_no")
	private long contactNumber;
	
	@Column(length=20)
	private String password;
	
	@OneToMany(mappedBy = "serviceProvider",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Resident>residentslist=new ArrayList<Resident>();
	
	

	@Override
	public String toString() {
		return "ServiceProvider [name=" + name + ", email=" + email + ", contactNumber=" + contactNumber + ", password="
				+ password + ", residentslist=" + residentslist + ", getId()=" + getId() + "]";
	}
	 
	

}
