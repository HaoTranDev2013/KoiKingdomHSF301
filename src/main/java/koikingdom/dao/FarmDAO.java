package koikingdom.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import koikingdom.pojo.Farm;
import koikingdom.util.HibernateUtil;
import java.util.List;

public class FarmDAO {

    // Thêm mới Farm
    public void addFarm(Farm farm) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(farm);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // Cập nhật Farm
    public void updateFarm(Farm farm) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(farm);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // Xóa Farm
    public void deleteFarm(int farmID) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Farm farm = session.get(Farm.class, farmID);
            if (farm != null) {
                session.delete(farm);
                transaction.commit();
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // Lấy thông tin Farm theo ID
    public Farm getFarmById(int farmID) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Farm.class, farmID);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Lấy tất cả các Farm
    public List<Farm> getAllFarms() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Farm", Farm.class).list();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
