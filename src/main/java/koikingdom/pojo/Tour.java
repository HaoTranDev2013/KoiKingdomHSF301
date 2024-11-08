package koikingdom.pojo;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "Tour") // Tên bảng trong CSDL
public class Tour {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Tự động tăng cho khóa chính
    @Column(name = "tourID") // Tên cột trong CSDL
    private Integer tourID; 

    @Column(name = "tourName", nullable = false, length = 100)
    private String tourName;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "tourPrice", precision = 10, scale = 2)
    private double tourPrice;

    @Column(name = "startDate")
    private LocalDate startDate;

    @Column(name = "endDate")
    private LocalDate endDate;

    @Column(name = "image", length = 255)
    private String image;

    @Column(name = "status", nullable = false)
    private boolean status;

    @Column(name = "departureLocation", length = 100)
    private String departureLocation;

    // Constructor không tham số
    public Tour() {
    }

    // Constructor có tham số
    public Tour(Integer tourID, String tourName, Integer duration, String description, double tourPrice, 
                LocalDate startDate, LocalDate endDate, String image, boolean status, String departureLocation) {
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
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
