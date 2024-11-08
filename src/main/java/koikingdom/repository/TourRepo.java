package koikingdom.repository;

import java.util.List;

import koikingdom.dao.ITourDAO;
import koikingdom.dao.TourDAO;
import koikingdom.pojo.Tour;

public class TourRepo implements ITourRepo{
	private ITourDAO tourDAO;

	public TourRepo() {
		this.tourDAO = new TourDAO();
	}

	@Override
	public List<Tour> getAllTour() {
		// TODO Auto-generated method stub
		return tourDAO.getAllTour();
	}

	@Override
	public Tour findTourById(int tourID) {
		// TODO Auto-generated method stub
		return tourDAO.findTourById(tourID);
	}

	@Override
	public void addTour(Tour tour) {
		// TODO Auto-generated method stub
		tourDAO.addTour(tour);
		
	}

	@Override
	public void update(Tour tour) {
		// TODO Auto-generated method stub
		tourDAO.update(tour);
	}

	@Override
	public void deleteTour(int tourID) {
		// TODO Auto-generated method stub
		tourDAO.deleteTour(tourID);
	}
	
	
	
	
}
