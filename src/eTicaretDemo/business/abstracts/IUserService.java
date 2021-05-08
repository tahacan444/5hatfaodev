package eTicaretDemo.business.abstracts;

import java.util.List;

import eTicaretDemo.entities.concretes.User;

public interface IUserService {

	void add(User user);
	void save(User user);
	List<User> getAll();
	
	boolean mailVerfication(String email);
	
	boolean passwordVerfication(String password);
	
	
	void google(User user);
	boolean mailVerfication(User user);
	boolean passwordVerfication(User user);

	
	

}
