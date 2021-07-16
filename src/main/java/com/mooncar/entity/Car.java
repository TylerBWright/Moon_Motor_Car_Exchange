package com.mooncar.entity;

import java.time.LocalDate;

public class Car {

	private String number;
	private String seller;
	private String sellerEmail;
	private String sellerPhone;
	private String carMake;
	private String carModel;
	private String carYear;
	private double carPrice;
	private String carDescription;
	private LocalDate localDate;
	private String buyerFname;
	private String buyerLname;
	private LocalDate dateSold;
	private String discount;
	private String buyerFName;
	private String buyerLName;
	private String buyerEmail;
	private String buyerPhone;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarYear() {
		return carYear;
	}

	public void setCarYear(String carYear) {
		this.carYear = carYear;
	}

	public double getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public String getCarDescription() {
		return carDescription;
	}

	public void setCarDescription(String carDescription) {
		this.carDescription = carDescription;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getSellerPhone() {
		return sellerPhone;
	}

	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

	public String getBuyerFname() {
		return buyerFname;
	}

	public void setBuyerFname(String buyerFname) {
		this.buyerFname = buyerFname;
	}

	public String getBuyerLname() {
		return buyerLname;
	}

	public void setBuyerLname(String buyerLname) {
		this.buyerLname = buyerLname;
	}

	public LocalDate getDateSold() {
		return dateSold;
	}

	public void setDateSold(LocalDate dateSold) {
		this.dateSold = dateSold;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	public String getBuyerFName() {
		return buyerFName;
	}
	
	public void setBuyerFName(String buyerFName) {
		this.buyerFName = buyerFName;
	}
	
	public String getBuyerLName() {
		return buyerLName;
	}
	
	public void setBuyerLName(String buyerLName) {
		this.buyerLName = buyerLName;
	}
	
	public String getBuyerEmail() {
		return buyerEmail;
	}
	
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public String getBuyerPhone() {
		return buyerPhone;
	}

	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}
}
