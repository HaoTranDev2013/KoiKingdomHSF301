package koikingdom.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Farm")
public class Farm {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int farmID;
	private String farmName;
	private String location;
	private String description;
	private boolean status;
	public int getFarmID() {
		return farmID;
	}
	public void setFarmID(int farmID) {
		this.farmID = farmID;
	}
	public String getFarmName() {
		return farmName;
	}
	public void setFarmName(String farmName) {
		this.farmName = farmName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Farm() {
		super();
	}
	public Farm(int farmID, String farmName, String location, String description, boolean status) {
		super();
		this.farmID = farmID;
		this.farmName = farmName;
		this.location = location;
		this.description = description;
		this.status = status;
	}
	public Farm(String farmName, String location, String description, boolean status) {
		super();
		this.farmName = farmName;
		this.location = location;
		this.description = description;
		this.status = status;
	}
	
}
