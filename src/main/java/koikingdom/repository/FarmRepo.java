package koikingdom.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import koikingdom.dao.FarmDAO;
import koikingdom.pojo.Farm;
import koikingdom.util.HibernateUtil;

public class FarmRepo {
	FarmDAO farmDAO;
	
	public FarmRepo(FarmDAO dao) {
		this.farmDAO = dao;
	}
	
	// Thêm mới Farm
    public void addFarm(Farm farm) {
        farmDAO.addFarm(farm);
    }

    // Cập nhật Farm
    public void updateFarm(Farm farm) {
        farmDAO.updateFarm(farm);
    }

    // Xóa Farm
    public void deleteFarm(int farmID) {
        farmDAO.deleteFarm(farmID);
    }

    // Lấy thông tin Farm theo ID
    public Farm getFarmById(int farmID) {
       return farmDAO.getFarmById(farmID);
    }

    // Lấy tất cả các Farm
    public List<Farm> getAllFarms() {
       return farmDAO.getAllFarms();
    }
}
