package koikingdom.service;

import java.util.List;

import koikingdom.dao.KoiDAO;
import koikingdom.pojo.KoiFish;
import koikingdom.repository.KoiRepo;

public class KoiService {
private KoiRepo koiRepo;
	
	
	public KoiService(KoiRepo koiRepo) {
		super();
		this.koiRepo = koiRepo;
	}
	public void addKoiFish(KoiFish koiFish) {
        koiRepo.addKoiFish(koiFish);
    }

    // Cập nhật KoiFish
    public void updateKoiFish(KoiFish koiFish) {
       koiRepo.updateKoiFish(koiFish);
    }

    // Xóa KoiFish
    public void deleteKoiFish(int koiId) {
        koiRepo.deleteKoiFish(koiId);
    }

    // Lấy tất cả KoiFish
    public List<KoiFish> getAllKoiFish() {
        return koiRepo.getAllKoiFish();
    }
    public KoiFish getKoiFishById(int koiId) {
         // Nếu không tìm thấy đối tượng hoặc có lỗi
    	return koiRepo.getKoiFishById(koiId);
    }
}
