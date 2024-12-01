package com.techprudent.springbootrestcrud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author tech prudent
 *
 *         customer entity, created automatically for us
 */
@Entity
@Table(name = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="Customer entity", description="customer data can be entered")
public class Customer {

	@Id
	@GeneratedValue
	private long id;

	@ApiModelProperty(value="provide first name")
	private String name;
	
	@ApiModelProperty(value="provide primary contact number")
	private String contact;
	
	@ApiModelProperty(value="provide just the gender")
	private String gender;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


// getters setters - avoided since we have used lombok, for more info
	// https://www.youtube.com/watch?v=lPhSOEh35i8&t=281s

}
