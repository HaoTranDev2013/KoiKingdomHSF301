package koikingdom.repository;

import java.util.List;

import koikingdom.pojo.Booking;

public interface IBookingRepo {
	public void insertBooking(Booking booking);
	public List<Booking> getBookingById(int id);
}
