package service;

import dao.LoginDAO;
import model.User;
import validacija.ValidacijaLogin;

public class LoginService {
	
	
	LoginDAO dao = new LoginDAO();
	ValidacijaLogin validacija= new ValidacijaLogin();
	

	public User vratiUseraLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return dao.vratiUseraLogIn( userName, password);
	}

	public boolean daLiJeAdmin(User loginUser) {
validacija.daLiJeAdmin(loginUser);

		return false;
	}

}
