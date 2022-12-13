package model;

import java.util.ArrayList;

public class User {
	private String firstName;
	private String lastName;
	private ArrayList<Integer> favoritNumbers;
	private String email;
	private int randomNumber;
	private Car car;
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String welcomeMessage() {
		return  "Hello Mr." + this.firstName + " " + this.lastName;
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
	public ArrayList<Integer> getFavoritNumbers() {
		return favoritNumbers;
	}
	public void setFavoritNumbers(ArrayList<Integer> favoritNumbers) {
		this.favoritNumbers = favoritNumbers;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRandomNumber() {
		return randomNumber;
	}
	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}
	
	
	

}
