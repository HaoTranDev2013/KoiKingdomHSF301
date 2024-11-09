package koikingdom.repository;

import java.util.List;

import koikingdom.dao.BookingDAO;
import koikingdom.pojo.Booking;

public class BookingRepo implements IBookingRepo{
	private BookingDAO bookingDAO;
	
	
	
	
	public BookingRepo() {
		
		this.bookingDAO = new BookingDAO();
	}




	@Override
	public void insertBooking(Booking booking) {
		// TODO Auto-generated method stub
		bookingDAO.insertBooking(booking);
	}




	@Override
	public List<Booking> getBookingById(int id) {
		// TODO Auto-generated method stub
		return bookingDAO.getBookingById(id);
	}

}
