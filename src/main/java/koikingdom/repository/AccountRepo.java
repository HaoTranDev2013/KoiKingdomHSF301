package koikingdom.repository;

import koikingdom.dao.AccountDAO;
import koikingdom.pojo.Account;

public class AccountRepo implements IAccountRepo{
	private AccountDAO accountDAO;
	
	
	
	public AccountRepo(AccountDAO accountDAO) {
		super();
		this.accountDAO = accountDAO;
	}



	@Override
	public Account findByEmailAndPassword(String email, String password) {
		
		return accountDAO.login(email, password);
	}



	@Override
	public void signup(Account account) {
		accountDAO.signup(account);
		
	}
	
}
