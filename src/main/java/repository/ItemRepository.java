package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.core.statement.Query;

import com.rest.pos.model.Cart;
import com.rest.pos.model.Item;

import dbconnection.DataSource;

public class ItemRepository {
	private Jdbi jdbi;

	public ItemRepository() {
		//jdbi = Jdbi.create("jdbc:mysql://localhost:3306/pos", "root", "");
		
	}
	
	public List<Item>  getItems() {
		//Query query;
		//try (Handle handle = jdbi.open()) {
		//    query =  handle.createQuery("select * from item");
		//}
		//return query.mapToMap().list();
		
		List<Item> listItem = new ArrayList<Item>();
		
		try {
			Connection con = DataSource.getConnection();
		
		        PreparedStatement pst = con.prepareStatement("select * from item");
		        ResultSet rs = pst.executeQuery();
		            
		            Item item;
		            while ( rs.next() ) {
		                item = new Item();
		                item.name = "";
		                listItem.add(item);
		            }
			} catch (Exception e) {
				System.out.println("Error "+e.getMessage());
			}
		
		return listItem;
		
	}
}
