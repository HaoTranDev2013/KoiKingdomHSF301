package koikingdom.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import koikingdom.dao.AccountDAO;
import koikingdom.dao.KoiDAO;
import koikingdom.pojo.KoiFish;
import koikingdom.util.HibernateUtil;

public class KoiRepo {
	private KoiDAO koiDAO;
	
	
	public KoiRepo(KoiDAO koiDAO) {
		super();
		this.koiDAO = koiDAO;
	}
	public void addKoiFish(KoiFish koiFish) {
        koiDAO.addKoiFish(koiFish);
    }

    // Cập nhật KoiFish
    public void updateKoiFish(KoiFish koiFish) {
       koiDAO.updateKoiFish(koiFish);
    }

    // Xóa KoiFish
    public void deleteKoiFish(int koiId) {
        koiDAO.deleteKoiFish(koiId);
    }

    // Lấy tất cả KoiFish
    public List<KoiFish> getAllKoiFish() {
        return koiDAO.getAllKoiFish();
    }
    public KoiFish getKoiFishById(int koiId) {
         // Nếu không tìm thấy đối tượng hoặc có lỗi
    	return koiDAO.getKoiFishById(koiId);
    }
	
}
