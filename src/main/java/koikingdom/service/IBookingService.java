package koikingdom.service;

import java.util.List;

import koikingdom.pojo.Booking;

public interface IBookingService {
	public void insertBooking(Booking booking);
	public List<Booking> getBookingById(int id);
}
