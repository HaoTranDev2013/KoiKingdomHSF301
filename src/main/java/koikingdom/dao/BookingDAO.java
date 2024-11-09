package koikingdom.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import koikingdom.pojo.Booking;
import koikingdom.pojo.Tour;

public class BookingDAO implements IBoookingDAO{
	private SessionFactory sessionfactory;
	private Configuration cf;

	public BookingDAO() {
		sessionfactory = new Configuration().configure().buildSessionFactory();
	}
	@Override
	public void insertBooking(Booking booking) {
		Session session = sessionfactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.save(booking);
			t.commit();

		} catch (Exception ex) {
			t.rollback();
			System.out.println("Error" + ex.getMessage());
		} finally {
//			sessionFactory.close();
			// session.close();
		}
		
	}
	public List<Booking> getBookingById(int id) {
		 Session session = sessionfactory.openSession();
	        try {
	            // HQL query để lấy danh sách booking theo customerID
	            String hql = "FROM Booking b WHERE b.customerID = :customerId";
	            Query query = session.createQuery(hql, Booking.class);
	            query.setParameter("customerId", id);

	            // Trả về danh sách các booking thỏa mãn điều kiện
	            return ((org.hibernate.query.Query<Booking>) query).list();
	        } catch (RuntimeException ex) {
	            // Xử lý lỗi (nếu có)
	            throw ex;
	        } finally {
	            // Đóng session để tránh rò rỉ tài nguyên
	            if (session != null) {
//	                session.close();
	            }
	        }
    }
	
}
