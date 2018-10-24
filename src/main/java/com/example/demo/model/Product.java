package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;



@Entity
@Table(name= "product")
public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, unique = true)
	private int id ; 
	
	@NotEmpty
	@Length(max = 50)
	@Column(name ="name",nullable = false)
	private String name;
	
	
	@NotEmpty
	@Length(max = 1000)
	@Column(name="description", nullable= false)
	private String description;
	
	
	@Column(name = "image", nullable = true)
	private String image;
	
	@NotEmpty
	@Max(value= 100)
	@Min(value=10000)
	private Integer price;

	public Product() {
		super();
		this.image = null;
	}

	
	public Product(int id, @NotEmpty @Length(max = 50) String name, @NotEmpty @Length(max = 1000) String description,
			String image, @NotEmpty @Max(100) @Min(10000) Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.price = price;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	

}
