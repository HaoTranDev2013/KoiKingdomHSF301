package koikingdom.service;

import java.util.List;

import koikingdom.pojo.Booking;
import koikingdom.repository.BookingRepo;

public class BookingService implements IBookingService{
	private BookingRepo bookingRepo;
	
	
	
	public BookingService() {
		bookingRepo = new BookingRepo();
	}



	public BookingService(BookingRepo bookingRepo) {
		super();
		this.bookingRepo = bookingRepo;
	}



	@Override
	public void insertBooking(Booking booking) {
		// TODO Auto-generated method stub
		bookingRepo.insertBooking(booking);
	}



	@Override
	public List<Booking> getBookingById(int id) {
		// TODO Auto-generated method stub
		return bookingRepo.getBookingById(id);
	}

}
