package koikingdom.service;

import koikingdom.pojo.Account;
import koikingdom.repository.AccountRepo;

public class AccountService implements IAccountService{
	private AccountRepo accountRepo;
	
	
	
	
	


	public AccountService(AccountRepo accountRepo) {
		super();
		this.accountRepo = accountRepo;
	}



	@Override
	public Account login(String email, String password) {
		// TODO Auto-generated method stub
		return accountRepo.findByEmailAndPassword(email, password);
	}



	@Override
	public void signup(Account account) {
		accountRepo.signup(account);
	}

}
