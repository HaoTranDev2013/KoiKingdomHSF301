package koikingdom.service;

import koikingdom.pojo.Account;

public interface IAccountService {
	public Account login(String email, String password);
	public void signup(Account account);
}
