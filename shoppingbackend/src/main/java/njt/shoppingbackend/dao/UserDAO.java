package njt.shoppingbackend.dao;

import java.util.List;

import njt.shoppingbackend.dto.Address;
import njt.shoppingbackend.dto.User;

public interface UserDAO {

	
	User getByEmail(String email);
	User get(int id);

	boolean add(User user);
	
	Address getAddress(int addressId);
	boolean addAddress(Address address);
	boolean updateAddress(Address address);
	Address getBillingAddress(int userId);
	List<Address> listShippingAddresses(int userId);
	

	
}
