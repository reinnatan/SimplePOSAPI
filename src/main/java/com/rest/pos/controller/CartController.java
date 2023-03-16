package com.rest.pos.controller;

import java.util.List;

import com.rest.pos.model.Cart;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import repository.CartRepository;

@Path("cart")
public class CartController {
	
	
	@Path("list")
	@GET
	public List<Cart> getListCart() {
		
		return null;
	}
	
	@Path("add")
	@POST
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void addCart(Cart cart) {
		
	}
	
	@Path("edit")
	@PUT
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void editCart(Cart cart) {
		
	}
	
	@Path("delete")
	@DELETE
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public void deleteCart(int id) {
		
	}
	

}
