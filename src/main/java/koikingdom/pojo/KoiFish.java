package koikingdom.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="KOI")
public class KoiFish {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int koiId;
	private String name;
	private int age;
	  
	private double length;  
	private double weight;   
	private double price;
	public int getKoiId() {
		return koiId;
	}
	public void setKoiId(int koiId) {
		this.koiId = koiId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public KoiFish(int koiId, String name, int age, double length, double weight, double price) {
		super();
		this.koiId = koiId;
		this.name = name;
		this.age = age;
		
		this.length = length;
		this.weight = weight;
		this.price = price;
	}
	public KoiFish(String name, int age, double length, double weight, double price) {
		super();
		this.name = name;
		this.age = age;
		
		this.length = length;
		this.weight = weight;
		this.price = price;
	}
	public KoiFish() {
		super();
	}   
	  
	  
	
}
