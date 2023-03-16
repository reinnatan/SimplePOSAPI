package com.rest.pos.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rest.pos.model.Cart;
import com.rest.pos.model.Item;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import repository.CartRepository;
import repository.ItemRepository;

@Path("item")
public class ItemController {
	
	@GET
	@Path("list")
	public List<Item> getListCart() {
		ItemRepository itemRepository = new ItemRepository();
		return itemRepository.getItems();
	}

}
