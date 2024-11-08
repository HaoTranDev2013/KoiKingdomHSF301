package koikingdom.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import koikingdom.pojo.KoiFish;
import koikingdom.util.HibernateUtil;

import java.util.List;

public class KoiDAO {

    // Thêm mới KoiFish
    public void addKoiFish(KoiFish koiFish) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(koiFish);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // Cập nhật KoiFish
    public void updateKoiFish(KoiFish koiFish) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(koiFish);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // Xóa KoiFish
    public void deleteKoiFish(int koiId) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            KoiFish koiFish = session.get(KoiFish.class, koiId);
            if (koiFish != null) {
                session.delete(koiFish);
                transaction.commit();
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    // Lấy tất cả KoiFish
    public List<KoiFish> getAllKoiFish() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<KoiFish> query = session.createQuery("FROM KoiFish", KoiFish.class);
            return query.getResultList();
        }
    }
    public KoiFish getKoiFishById(int koiId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // Sử dụng session.get() để lấy đối tượng theo ID
            return session.get(KoiFish.class, koiId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Nếu không tìm thấy đối tượng hoặc có lỗi
    }
}