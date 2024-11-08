package koikingdom.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import koikingdom.pojo.Account;

public class AccountDAO implements IAccountDAO{
	private SessionFactory sessionfactory;
	private Configuration cf;
	
	 public AccountDAO() {
	        sessionfactory = new Configuration().configure().buildSessionFactory();
	    }
	@Override
	public Account login(String email, String password) {
		Account account =  null;
		Session session = sessionfactory.openSession();
		try {
			String hql = "FROM Account WHERE email = :email AND password = :password AND status = true"; 
			 Query<Account> query = session.createQuery(hql, Account.class); // tạo ra đối tượng truy vấn kiểu Account trong 1 phiên session.
	            query.setParameter("email", email);
	            query.setParameter("password", password);
	            List<Account> results = query.getResultList();
	            
	            if (!results.isEmpty()) {
	                account = results.get(0);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return account;
		
	}
	@Override
	public void signup(Account account) {
		try (Session session = sessionfactory.openSession()) {
            session.beginTransaction();
            session.save(account);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
