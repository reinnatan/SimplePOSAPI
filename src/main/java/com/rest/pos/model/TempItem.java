package com.rest.pos.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

@XmlRootElement
public class TempItem {
	
	@Setter @Getter
	private Item item;
	
	@Setter @Getter
	private int count;
	
	@Setter @Getter
	private float totalPrice;
}
