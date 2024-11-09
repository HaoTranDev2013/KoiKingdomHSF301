package koikingdom.dao;


import koikingdom.pojo.Account;

public interface IAccountDAO {
	public Account login(String email, String password);
	public void signup(Account account);
}
