package eTicaretDemo;

import java.util.List;

import eTicaretDemo.business.concretes.UserManager;
import eTicaretDemo.core.GoogleService;
import eTicaretDemo.core.JGoogleManagerAdapter;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.dataAccess.concretes.SaveUserDao;
import eTicaretDemo.entities.concretes.User;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		UserManager userManager = new UserManager( new SaveUserDao(),new JGoogleManagerAdapter());
		
		User user = new User(1,"Taha","Can","tahacan1@gmail.com","tahacan");
		
		userManager.add(user);
		userManager.save(user);
        userManager.mailVerfication(user);
		userManager.passwordVerfication(user);
		
		userManager.google(user);
		
		
			
			
		
}
}