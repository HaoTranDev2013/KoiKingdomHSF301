package koikingdom.pojo;

import java.sql.Timestamp;

public class Tour {
	 private Integer tourID; // Đổi từ int sang Integer
	    private String tourName;
	    private Integer duration; // Đổi từ int sang Integer
	    private String description;
	    private double tourPrice;
	    private Timestamp startDate;
	    private Timestamp endDate;
	    private String image;
	    private boolean status;
	    private String departureLocation;

	    // Constructor không tham số
	    public Tour() {
	    }

	    // Constructor có tham số
	    public Tour(Integer tourID, String tourName, Integer duration, String description, double tourPrice, 
	                Timestamp startDate, Timestamp endDate, String image, boolean status, String departureLocation) {
	        this.tourID = tourID;
	        this.tourName = tourName;
	        this.duration = duration;
	        this.description = description;
	        this.tourPrice = tourPrice;
	        this.startDate = startDate;
	        this.endDate = endDate;
	        this.image = image;
	        this.status = status;
	        this.departureLocation = departureLocation;
	    }

	    // Getters và Setters
	    public Integer getTourID() {
	        return tourID;
	    }

	    public void setTourID(Integer tourID) {
	        this.tourID = tourID;
	    }

	    public String getTourName() {
	        return tourName;
	    }

	    public void setTourName(String tourName) {
	        this.tourName = tourName;
	    }

	    public Integer getDuration() {
	        return duration;
	    }

	    public void setDuration(Integer duration) {
	        this.duration = duration;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public double getTourPrice() {
	        return tourPrice;
	    }

	    public void setTourPrice(double tourPrice) {
	        this.tourPrice = tourPrice;
	    }

	    public Timestamp getStartDate() {
	        return startDate;
	    }

	    public void setStartDate(Timestamp startDate) {
	        this.startDate = startDate;
	    }

	    public Timestamp getEndDate() {
	        return endDate;
	    }

	    public void setEndDate(Timestamp endDate) {
	        this.endDate = endDate;
	    }

	    public String getImage() {
	        return image;
	    }

	    public void setImage(String image) {
	        this.image = image;
	    }

	    public boolean isStatus() {
	        return status;
	    }

	    public void setStatus(boolean status) {
	        this.status = status;
	    }

	    public String getDepartureLocation() {
	        return departureLocation;
	    }

	    public void setDepartureLocation(String departureLocation) {
	        this.departureLocation = departureLocation;
	    }
}
