// hello this is a comment

package com.ondoor.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class POStatus {

	@Id
	@Generated
	private Long id;
	
	// name variable
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "POStatus [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
