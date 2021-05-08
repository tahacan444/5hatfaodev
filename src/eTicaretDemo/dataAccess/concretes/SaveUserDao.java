package eTicaretDemo.dataAccess.concretes;



import java.util.List;

import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class SaveUserDao implements UserDao {

	
	
	
	
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullanıcı eklendi :" + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullanıcı güncellendi :" + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		System.out.println("Kullanıcı silindi :" + user.getFirstName());
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

	
}
