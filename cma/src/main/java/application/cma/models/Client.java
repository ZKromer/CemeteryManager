package application.cma.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long clientId;
	private String firstName;
	private String lastName;
	private boolean alive;
	private LocalDate dob;
	private LocalDate dod;
	
	public Client() {}
	
	public Client(String fName, String lName, LocalDate dob, LocalDate dod) {
		this.firstName = fName;
		this.lastName = lName;
		this.dob = dob;
		this.dod = dod;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getDod() {
		return dod;
	}
	public void setDod(LocalDate dod) {
		this.dod = dod;
	}
	
}
