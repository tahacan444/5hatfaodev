package eTicaretDemo.business.concretes;


import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretDemo.business.abstracts.IUserService;
import eTicaretDemo.core.GoogleService;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public  class UserManager implements IUserService {

	
	private UserDao userDao;
	private GoogleService googleService;
	
	
	
	public UserManager(UserDao userDao, GoogleService googleService) {
		super();
		this.userDao = userDao;
		this.googleService = googleService;
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
		userDao.add(user);
		
		
		
		
		
	}
    

	public void save(User user) {
		String getLastName = "Taha";
		String getFirstName = "Can";
		
		// TODO Auto-generated method stub
    	if(getFirstName.length() > 2 && getLastName.length() > 2) {
    		
    		System.out.println("Geçerli ad soyad");
    	}
    	else {
    		System.out.println("Geçersiz ad soyad");
    	}
    	
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean mailVerfication(User user) {
		// TODO Auto-generated method stub
		final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    System.out.println(user.getEmail());
		return EMAIL_REGEX.matcher(user.getEmail()).matches();
        
		
	}

	
	@Override
	public boolean passwordVerfication(User user) {
		 String getPassword = "tahac";
		if(getPassword .length() < 6) {
			 System.out.println("Doğru : " + user.getPassword());
			return false;
		 }
		 else {
			System.out.println("Yanlış ");
			 return true; 
		 }
		
		// TODO Auto-generated method stub
		
		
		
	}

	
	public void google(User user) {
		// TODO Auto-generated method stub
		System.out.println("Google ile eklendi ");
		 googleService.googleRecord(user);
	}

	@Override
	public boolean mailVerfication(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean passwordVerfication(String password) {
		// TODO Auto-generated method stub
		return false;
	}



	
	

}
