package com.rest.pos.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

@XmlRootElement
public class Category {
	
	@Setter @Getter
	private String catId;
	
	@Setter @Getter
	private String catName;


}
