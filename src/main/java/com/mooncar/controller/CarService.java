package com.mooncar.controller;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.mooncar.entity.Car;

@Service
public class CarService {
	
	List<Car> cars = new ArrayList<Car>();
	List<Car> carsPending = new ArrayList<Car>();
	List<Car> carsSold = new ArrayList<Car>();
	double discountedPrice;

	{
		Car car1 = new Car();
		car1.setNumber(numberGenerator());
		car1.setSeller("Jonathan King");
		car1.setSellerEmail("kingjohn@email.com");
		car1.setSellerPhone("555-555-5555");
		car1.setCarMake("Moon");
		car1.setCarModel("30");
		car1.setCarYear("1912");
		car1.setCarPrice(35000.00);
		car1.setDiscount("");
		car1.setCarDescription(
				"This car has a history of winning races back in the roaring 20's, until it was eventually retired. Still in remarkable condition. I would hang onto it, but we are looking to downsize and it could use a good home. Drop me a line if interested!");
		car1.setLocalDate(LocalDate.of(2021, 7, 10));
		cars.add(car1);

		Car car2 = new Car();
		car2.setNumber(numberGenerator());
		car2.setSeller("Alvin Burrows");
		car2.setSellerEmail("allaboutal@email.com");
		car2.setSellerPhone("555-555-5555");
		car2.setCarMake("Moon");
		car2.setCarModel("6-40");
		car2.setCarYear("1921");
		car2.setCarPrice(7865.00);
		car2.setDiscount("");
		car2.setCarDescription("1921 Moon Roadster 6-40 Moon Motor Car Co., St. Louis, MO. Blue finish. Needs some work.");
		car2.setLocalDate(LocalDate.of(2021, 5, 3));
		cars.add(car2);

		Car car3 = new Car();
		car3.setNumber(numberGenerator());
		car3.setSeller("Ashley Robinson");
		car3.setSellerEmail("crazygurl27@email.com");
		car3.setSellerPhone("555-555-5555");
		car3.setCarMake("Moon");
		car3.setCarModel("6-40");
		car3.setCarYear("1922");
		car3.setCarPrice(16700.00);
		car3.setDiscount("");
		car3.setCarDescription(
				"Hubby passed away last year, and I had to make some hard decisions, including parting with this beauty. New tubes and top. Email me if interested.");
		car3.setLocalDate(LocalDate.of(2019, 6, 2));
		cars.add(car3);

		Car car4 = new Car();
		car4.setNumber(numberGenerator());
		car4.setSeller("Billy Drew");
		car4.setSellerEmail("billyd1254@email.com");
		car4.setSellerPhone("555-555-5555");
		car4.setCarMake("Moon");
		car4.setCarModel("A");
		car4.setCarYear("1924");
		car4.setCarPrice(23000.00);
		car4.setDiscount("");
		car4.setCarDescription(
				"37,000 miles. Bought this in an auction back in 2012 and hardly drove it. Rich blue cloth upholstery and interior trim. Runs like a champ! Buyer must be willing to pick-up in Spokane, WA. Email me for details.");
		car4.setLocalDate(LocalDate.of(2020, 2, 1));
		cars.add(car4);

		Car car5 = new Car();
		car5.setNumber(numberGenerator());
		car5.setSeller("Percy Benjamin");
		car5.setSellerEmail("admin@mooncarexchange.com");
		car5.setSellerPhone("555-555-5555");
		car5.setCarMake("Moon");
		car5.setCarModel("Newport");
		car5.setCarYear("1925");
		car5.setCarPrice(32000.00);
		car5.setDiscount("");
		car5.setCarDescription(
				"Brilliant white finish, all new leather interior--restored to perfection! This is the renamed 6-40 for 1925 and is extremely rare. Serious buyers only, please.");
		car5.setLocalDate(LocalDate.of(2021, 1, 1));
		cars.add(car5);

		Car car6 = new Car();
		car6.setNumber(numberGenerator());
		car6.setSeller("Percy Benjamin");
		car6.setSellerEmail("admin@mooncarexchange.com");
		car6.setSellerPhone("555-555-5555");
		car6.setCarMake("Moon");
		car6.setCarModel("6-60");
		car6.setCarYear("1927");
		car6.setCarPrice(6350.00);
		car6.setDiscount("");
		car6.setCarDescription("Car is in OK shape.. lots of potential for the right person. Replaced ignition coil, spark plugs, and distributor a couple of years back.");
		car6.setLocalDate(LocalDate.of(2021, 6, 3));
		cars.add(car6);

		Car car7 = new Car();
		car7.setNumber(numberGenerator());
		car7.setSeller("John Matlock");
		car7.setSellerEmail("matlock88@email.com");
		car7.setSellerPhone("555-555-5555");
		car7.setCarMake("Moon");
		car7.setCarModel("6-48");
		car7.setCarYear("1922");
		car7.setCarPrice(12450.00);
		car7.setDiscount("");
		car7.setCarDescription(
				"Great car! This model has that distinctive heavy front fender and a radiator shell resembling the Rolls-Royce. Unfortunately this car has a missing top, but it still runs fine. This baby has had a full life. Let me know if you're interested.");
		car7.setLocalDate(LocalDate.of(2021, 6, 12));
		cars.add(car7);

		Car car8 = new Car();
		car8.setNumber(numberGenerator());
		car8.setSeller("Percy Benjamin");
		car8.setSellerEmail("admin@mooncarexchange.com");
		car8.setSellerPhone("555-555-5555");
		car8.setCarMake("Moon");
		car8.setCarModel("6-72");
		car8.setCarYear("1928");
		car8.setCarPrice(29900.00);
		car8.setDiscount("");
		car8.setCarDescription(
				"Acquired some years back and now I bring it to you Moon Motor enthusiasts. Fully restored with an emerald green coat of paint. Just take one look at this beauty and try to tell me you don't want it!");
		car8.setLocalDate(LocalDate.of(2020, 10, 9));
		cars.add(car8);

		Car car9 = new Car();
		car9.setNumber(numberGenerator());
		car9.setSeller("Sally Shields");
		car9.setSellerEmail("sshields@email.com");
		car9.setSellerPhone("555-555-5555");
		car9.setCarMake("Moon");
		car9.setCarModel("C");
		car9.setCarYear("");
		car9.setCarPrice(23000.00);
		car9.setDiscount("");
		car9.setCarDescription("Please email for details. Willing to drop off at your location.");
		car9.setLocalDate(LocalDate.of(2021, 4, 12));
		cars.add(car9);
		
		Car car10 = new Car();
		car10.setNumber(numberGenerator());
		car10.setSeller("Alvin Burrows");
		car10.setSellerEmail("allaboutal@email.com");
		car10.setSellerPhone("555-555-5555");
		car10.setCarMake("Moon");
		car10.setCarModel("6-46");
		car10.setCarYear("1919");
		car10.setCarPrice(16750.00);
		car10.setDiscount("");
		car10.setCarDescription("A 1919 6-46 Moon Victory Touring Car with wire wheels instead of the more common wood spoke wheels. Split windshield and headlights restored to their former glory. A true diamond for any serious collector of antique cars.");
		car10.setLocalDate(LocalDate.of(2021, 5, 17));
		cars.add(car10);
		
		Car carSold = new Car();
		carSold.setNumber(numberGenerator());
		carSold.setSeller("Tony Donahue");
		carSold.setSellerEmail("bigfish123@email.com");
		carSold.setSellerPhone("555-555-5555");
		carSold.setCarMake("Moon");
		carSold.setCarModel("A");
		carSold.setCarYear("1913");
		carSold.setCarPrice(3875.00);
		carSold.setDiscount("");
		carSold.setCarDescription("Six-cylindar engine with 5-litre Continental power units. Rolls-Royce-style radiator. It can be yours today for a bargain!");
		carSold.setLocalDate(LocalDate.of(2021, 7, 1));
		carSold.setDateSold(LocalDate.of(2021, 6, 3));
		carSold.setBuyerFName("John");
		carSold.setBuyerLName("Matlock");
		carSold.setBuyerPhone("555-555-5555");
		carSold.setBuyerEmail("matlock88@email.com");
		carsSold.add(carSold);

	}

	public void saveCar(Car newCar) {
		cars.add(newCar);

	}

	public String numberGenerator() {
		return UUID.randomUUID().toString();
	}

	public void removeCar(String number) {
		for (int i = 0; i < cars.size(); i++) {
			Car car = cars.get(i);
			if (car.getNumber().equals(number)) {
				cars.remove(i);
			}
		}
	}

	public void buyCar(String number) {
		for (int i = 0; i < cars.size(); i++) {
			Car car = cars.get(i);
			if (car.getNumber().equals(number)) {
				carsPending.add(car);
				cars.remove(i);
			}
		}

	}
	
	public void updateCar(Car updatedCar) {
		for (int i = 0; i < cars.size(); i++) {
			Car oldCar = cars.get(i);
			if (updatedCar.getNumber().equals(oldCar.getNumber())) {
				oldCar.setBuyerFName(updatedCar.getBuyerFName());
				oldCar.setBuyerLName(updatedCar.getBuyerLName());
				oldCar.setBuyerPhone(updatedCar.getBuyerPhone());
				oldCar.setBuyerEmail(updatedCar.getBuyerEmail());
				cars.set(i, oldCar);
			}
		}
	}

	public void discountCar() {
		for (int i = 0; i < cars.size(); i++) {
			Car car = cars.get(i);
			if (ChronoUnit.DAYS.between(car.getLocalDate(), LocalDate.now()) > 120) {
				discountedPrice = (car.getCarPrice() * .90);
				String discountedPriceb = String.valueOf(discountedPrice);
				car.setDiscount("$ " + discountedPriceb + " (10% discount)");
			}
			continue;
		}
	}

	public void approveCar(String number) {
		for (int i = 0; i < carsPending.size(); i++) {
			Car car = carsPending.get(i);
			if (car.getNumber().equals(number)) {
				car.setDateSold(LocalDate.now());
				carsSold.add(car);
				carsPending.remove(i);
			}

		}

	}

	public void denyCar(String number) {
		for (int i = 0; i < carsPending.size(); i++) {
			Car car = carsPending.get(i);
			if (car.getNumber().equals(number)) {
				cars.add(car);
				carsPending.remove(i);
			}

		}
	}

	public void removePast(String number) {
		for (int i = 0; i < carsSold.size(); i++) {
			Car car = carsSold.get(i);
			if (car.getNumber().equals(number)) {
				carsSold.remove(i);
			}

		}
	}

	public List<Car> filterByModel(String carModel) {
		if (carModel == null || carModel.equals("")) {
			return cars;
		}
		List<Car> filteredCars = new ArrayList<Car>();
		for (int i = 0; i < cars.size(); i++) {
			Car car = cars.get(i);
			if (car.getCarModel().equalsIgnoreCase(carModel)) {
				filteredCars.add(car);
			}

		}
		return filteredCars;
	}
	
	public List<Car> filterBySellerEmail(String sellerEmail) {
		List<Car> filteredCars = new ArrayList<Car>();
		for (int i = 0; i < carsPending.size(); i++) {
			Car car = carsPending.get(i);
			if (car.getSellerEmail().equals(sellerEmail)) {
				filteredCars.add(car);
			}
		}
		return filteredCars;
	}
	
	public List<Car> transactionHistorySellFilter(String sellerEmail) {
		List<Car> filteredCars = new ArrayList<Car>();
		for (int i = 0; i < carsSold.size(); i++) {
			Car car = carsSold.get(i);
			if (car.getSellerEmail().equals(sellerEmail)) {
				filteredCars.add(car);
			}
		}
		return filteredCars;
	}
	
	public List<Car> filterByBuyerEmail(String buyerEmail) {
		List<Car> filteredCars = new ArrayList<Car>();
		for (int i = 0; i < carsPending.size(); i++) {
			Car car = carsPending.get(i);
			if (car.getBuyerEmail().equals(buyerEmail)) {
				filteredCars.add(car);
			}
		}
		return filteredCars;
	}
	
	public List<Car> transactionHistoryBuyFilter(String buyerEmail) {
		List<Car> filteredCars = new ArrayList<Car>();
		for (int i = 0; i < carsSold.size(); i++) {
			Car car = carsSold.get(i);
			if (car.getBuyerEmail().equals(buyerEmail)) {
				filteredCars.add(car);
			}
		}
		return filteredCars;
	}

	public void removeBuy(String number) {
		for (int i = 0; i < cars.size(); i++) {
			Car car = cars.get(i);
			if (car.getNumber().equals(number)) {
				cars.remove(i);
			}

		}
	}
}
