package com.rest.pos.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

@XmlRootElement
public class Item {
	@Setter @Getter
	public String sku;
	
	@Setter @Getter
	public String name;
	
	@Setter @Getter
	public String description;
	
	@Setter @Getter
	public float price;
	
	@Setter @Getter
	public Category category;
	
}
