package koikingdom.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import koikingdom.pojo.Tour;

public class TourDAO implements ITourDAO {
	private SessionFactory sessionfactory;
	private Configuration cf;

	public TourDAO() {
		sessionfactory = new Configuration().configure().buildSessionFactory();
	}

	@Override
	public List<Tour> getAllTour() {
		List<Tour> tour = null;
		Session session = sessionfactory.openSession();
		try {
			tour = session.createQuery("from Tour", Tour.class).list();

		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());

		} finally {
//			sessionFactory.close();
		}
		return tour;
	}

	@Override
	public Tour findTourById(int tourID) {
		Session session = sessionfactory.openSession();

		try {

			return (Tour) session.get(Tour.class, tourID);

		} catch (RuntimeException ex) {

			throw ex;
		} finally {

			// session.close();
		}
	}

	@Override
	public void addTour(Tour tour) {
		Session session = sessionfactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.save(tour);
			t.commit();

		} catch (Exception ex) {
			t.rollback();
			System.out.println("Error" + ex.getMessage());
		} finally {
//			sessionFactory.close();
			// session.close();
		}

	}

	@Override
	public void update(Tour tour) {
		Session session = sessionfactory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.update(tour);
			t.commit();

		} catch (Exception ex) {
			t.rollback();
			System.out.println("Error" + ex.getMessage());
		} finally {
			// sessionFactory.close();
			// session.close();
		}
	}

	@Override
	public void deleteTour(int tourID) {
		Session session = sessionfactory.openSession();
		Transaction t = session.getTransaction();
		try {
			t = session.beginTransaction();
			Tour tour = (Tour) session.get(Tour.class, tourID);
			tour.setStatus(false);
			session.update(tour);
			t.commit();
		} catch (RuntimeException ex) {
			if (t != null)
				t.rollback();
			throw ex;
		} finally {
//			session.close();
		}
	}

}
