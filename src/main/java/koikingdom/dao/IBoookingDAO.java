package koikingdom.dao;

import java.util.List;

import koikingdom.pojo.Booking;
import koikingdom.pojo.Tour;


public interface IBoookingDAO {
	public void insertBooking(Booking booking);
	public List<Booking> getBookingById(int id);
}
