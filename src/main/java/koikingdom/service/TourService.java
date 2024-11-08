package koikingdom.service;

import java.util.List;

import koikingdom.pojo.Tour;
import koikingdom.repository.ITourRepo;
import koikingdom.repository.TourRepo;

public class TourService implements ITourService{
	private ITourRepo tourRepo;
	
	
	
	
	


	public TourService() {
		
		this.tourRepo = new TourRepo();
	}


	@Override
	public List<Tour> getAllTour() {
		// TODO Auto-generated method stub
		return tourRepo.getAllTour();
	}


	@Override
	public Tour findTourById(int tourID) {
		// TODO Auto-generated method stub
		return tourRepo.findTourById(tourID);
	}


	@Override
	public void addTour(Tour tour) {
		// TODO Auto-generated method stub
		tourRepo.addTour(tour);
	}


	@Override
	public void update(Tour tour) {
		// TODO Auto-generated method stub
		tourRepo.update(tour);
	}


	@Override
	public void deleteTour(int tourID) {
		// TODO Auto-generated method stub
		tourRepo.deleteTour(tourID);
	}

}
