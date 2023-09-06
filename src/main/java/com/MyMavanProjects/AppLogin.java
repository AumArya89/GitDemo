package com.MyMavanProjects;

import java.util.ResourceBundle;

public class AppLogin {
	
	
	public int userlogin(String user, String pswd)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String userName=rb.getString("username");
		String passWord=rb.getString("password");
		
		if (user.equals(userName) && pswd.equals(passWord))
		 return 1;
		 else
	     return 0;
	}

			

}
