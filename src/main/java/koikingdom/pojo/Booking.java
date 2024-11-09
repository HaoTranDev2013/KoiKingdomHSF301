package koikingdom.pojo;

import javax.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "Booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingID")
    private Integer bookingID;

   
    @JoinColumn(name = "customerID", referencedColumnName = "id", nullable = false)
    private Integer customerID;

    
    @JoinColumn(name = "tourID", referencedColumnName = "tourID", nullable = false)
    private Integer tourID;

    @Column(name = "numberOfPeople", nullable = false)
    private Integer numberOfPeople;

    @Column(name = "bookingDate", nullable = false)
    private LocalDate bookingDate;

    @Column(name = "totalPrice", nullable = false)
    private Double totalPrice;

    // Getters and Setters

    public Integer getBookingID() {
        return bookingID;
    }

    public void setBookingID(Integer bookingID) {
        this.bookingID = bookingID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getTourID() {
        return tourID;
    }

    public void setTourID(Integer tourID) {
        this.tourID = tourID;
    }

    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate localDate) {
        this.bookingDate = localDate;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

