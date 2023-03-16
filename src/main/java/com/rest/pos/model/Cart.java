package com.rest.pos.model;

import java.util.List;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

@XmlRootElement
public class Cart {
	
	@Setter @Getter
	private int id;
	
	@Setter @Getter
	private List<TempItem> items;
}
