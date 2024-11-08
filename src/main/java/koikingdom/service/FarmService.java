package koikingdom.service;

import java.util.List;

import koikingdom.dao.FarmDAO;
import koikingdom.pojo.Farm;
import koikingdom.repository.FarmRepo;

public class FarmService {
FarmRepo farmRepo;
	
	public FarmService(FarmRepo dao) {
		this.farmRepo = dao;
	}
	
	// Thêm mới Farm
    public void addFarm(Farm farm) {
        farmRepo.addFarm(farm);
    }

    // Cập nhật Farm
    public void updateFarm(Farm farm) {
        farmRepo.updateFarm(farm);
    }

    // Xóa Farm
    public void deleteFarm(int farmID) {
        farmRepo.deleteFarm(farmID);
    }

    // Lấy thông tin Farm theo ID
    public Farm getFarmById(int farmID) {
       return farmRepo.getFarmById(farmID);
    }

    // Lấy tất cả các Farm
    public List<Farm> getAllFarms() {
       return farmRepo.getAllFarms();
    }
}
