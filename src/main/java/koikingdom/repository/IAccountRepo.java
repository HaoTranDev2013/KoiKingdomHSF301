package koikingdom.repository;



import koikingdom.pojo.Account;

public interface IAccountRepo {
	public Account findByEmailAndPassword(String email, String password);
	public void signup(Account account);
	
}
