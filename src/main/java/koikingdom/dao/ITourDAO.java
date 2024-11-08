package koikingdom.dao;

import java.util.List;


import koikingdom.pojo.Tour;

public interface ITourDAO {
	public List<Tour> getAllTour();
	public Tour findTourById(int tourID);
	public void addTour(Tour tour);
	public void update(Tour tour);
	public void deleteTour(int tourID);
}
