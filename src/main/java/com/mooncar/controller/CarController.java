package com.mooncar.controller;

import java.time.LocalDate;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mooncar.entity.Car;
import com.mooncar.entity.User;

@Controller
public class CarController {

	@Autowired
	UserService userService;

	@Autowired
	CarService carService;

	@GetMapping("/sell")
	public ModelAndView sell(Model model, HttpSession session) {
		if (session.getAttribute("loginUser") == null) {
			return new ModelAndView("index");
		}
		return new ModelAndView("sell", "car", new Car());
	}

	@PostMapping("/sell")
	public ModelAndView handleCarSell(Model model, @ModelAttribute("car") Car car, HttpSession session) {
		car.setNumber(carService.numberGenerator());
		carService.saveCar(car);
		car.setLocalDate(LocalDate.now());
		car.setDiscount("");
		model.addAttribute("newCar", car);
		session.setAttribute("newCar", car);
		model.addAttribute("success", "Moon Motor Car listing added. Check your pending transactions page periodically to review the status of this listing. Good luck!");
		return new ModelAndView("sell", "cars", carService.cars);

	}

	@GetMapping("/adminsell")
	public ModelAndView adminsell(Model model, HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			return new ModelAndView("adminsell", "car", new Car());
		}
		return new ModelAndView("home", "car", new Car());
	}

	@PostMapping("/adminsell")
	public ModelAndView handleAdminCarSell(Model model, @ModelAttribute("car") Car car, HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			car.setNumber(carService.numberGenerator());
			carService.saveCar(car);
			car.setLocalDate(LocalDate.now());
			car.setDiscount("");
			model.addAttribute("newCar", car);
			session.setAttribute("newCar", car);
			model.addAttribute("success", "Moon Motor Car listing added. Check your pending sales page periodically to review the status of this listing. Good luck!");
			return new ModelAndView("adminsell", "cars", carService.cars);

		}
		return new ModelAndView("home");

	}

	@GetMapping("/buy")
	public ModelAndView buyFilter(Model model, @RequestParam(required = false) String carModel,
			@ModelAttribute("car") Car car, HttpSession session) {
		if (session.getAttribute("loginUser") == null) {
			return new ModelAndView("index");
		}
		List<Car> filteredCars = carService.filterByModel(carModel);
		carService.discountCar();
		return new ModelAndView("buy", "cars", filteredCars);
	}

	@PostMapping("/buy")
	public ModelAndView buy(Model model, @RequestParam String number, @ModelAttribute("car") Car car,
			HttpSession session) {
		carService.updateCar(car);
		carService.buyCar(number);
		model.addAttribute("newCar", number);
		session.setAttribute("newCar", number);
		model.addAttribute("success1", "Item Pending Sale");
		model.addAttribute("success2",
				"Congratulations on taking the first step in owning a piece of MOON history! This listing is no longer visible to other buyers. Be sure to contact the seller to arrange payment and receipt of your Moon Motor Car. Seller contact informaton may be found in your pending transactions page.");
		return new ModelAndView("buy", "cars", carService.cars);

	}

	@PostMapping("/removebuy")
	public ModelAndView handleRemoveBuy(Model model, @RequestParam String number, @ModelAttribute("car") Car car,
			HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			carService.removeBuy(number);
			model.addAttribute("success", "Car listing removed.");
			return new ModelAndView("adminbuy", "cars", carService.cars);
		}
		return new ModelAndView("home", "users", userService.users);
	}

	@GetMapping("/adminbuy")
	public ModelAndView adminbuy(Model model, @RequestParam(required = false) String carModel,
			@ModelAttribute("car") Car car, HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			List<Car> filteredCars = carService.filterByModel(carModel);
			carService.discountCar();
			return new ModelAndView("adminbuy", "cars", filteredCars);
		}
		return new ModelAndView("home", "cars", carService.cars);
	}

	@PostMapping("/adminbuy")
	public ModelAndView handleAdminCarBuy(Model model, @RequestParam String number, @ModelAttribute("car") Car car,
			HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			carService.updateCar(car);
			carService.buyCar(number);
			model.addAttribute("newCar", number);
			session.setAttribute("newCar", number);
			model.addAttribute("success1", "Item Pending Sale");
			model.addAttribute("success2",
					"Congratulations on taking the first step in owning a piece of MOON history! This listing is no longer visible to other buyers. Be sure to contact the seller to arrange payment and receipt of your Moon Motor Car. Seller contact informaton may be found in your pending sales page.");
			return new ModelAndView("adminbuy", "cars", carService.cars);
		}
		return new ModelAndView("home");
	}

	@GetMapping("/pending")
	public ModelAndView pending(Model model, HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			return new ModelAndView("pending", "carsPending", carService.carsPending);
		}
		return new ModelAndView("home", "users", userService.users);
	}

	@PostMapping("/pending")
	public ModelAndView pendingApprove(Model model, @RequestParam String number, HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			carService.approveCar(number);
			model.addAttribute("success", "Sale approved and added to the transaction log.");
			return new ModelAndView("pending", "carsPending", carService.carsPending);
		}
		return new ModelAndView("home", "users", userService.users);
	}
	
	
	@GetMapping("/pendingtransactions")
	public ModelAndView pendingtrans(Model model, HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			return new ModelAndView("pending");
		}
		return new ModelAndView("pendingtransactions");
	}
	
	@GetMapping("/pendingtransseller")
	public ModelAndView pendingtransseller(Model model, @RequestParam(required = false) String sellerEmail,
			@ModelAttribute("carsPending") Car carsPending, HttpSession session) {
		if (session.getAttribute("loginUser") == null) {
			return new ModelAndView("index");
		}
		List<Car> filteredCars = carService.filterBySellerEmail(sellerEmail);
		return new ModelAndView("pendingtransactions", "carsPending", filteredCars);
	}
	
	@GetMapping("/pendingtransbuyer")
	public ModelAndView pendingtransbuyer(Model model, @RequestParam(required = false) String buyerEmail,
			@ModelAttribute("carsPending") Car carsPending, HttpSession session) {
		if (session.getAttribute("loginUser") == null) {
			return new ModelAndView("index");
		}
		List<Car> filteredCars = carService.filterByBuyerEmail(buyerEmail);
		return new ModelAndView("pendingtransactions", "carsPending", filteredCars);
	}
	
	@GetMapping("/transactionhistory")
	public ModelAndView transactionhistory(Model model, HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			return new ModelAndView("past");
		}
		return new ModelAndView("transactionhistory");
	}
	
	@GetMapping("/transactionhistorysell")
	public ModelAndView transactionhistorysell(Model model, @RequestParam(required = false) String sellerEmail,
			@ModelAttribute("carsSold") Car carsSold, HttpSession session) {
		if (session.getAttribute("loginUser") == null) {
			return new ModelAndView("index");
		}
		List<Car> filteredCars = carService.transactionHistorySellFilter(sellerEmail);
		return new ModelAndView("transactionhistory", "carsSold", filteredCars);
	}
	
	@GetMapping("/transactionhistorybuy")
	public ModelAndView transactionhistorybuy(Model model, @RequestParam(required = false) String buyerEmail,
			@ModelAttribute("carsSold") Car carsSold, HttpSession session) {
		if (session.getAttribute("loginUser") == null) {
			return new ModelAndView("index");
		}
		List<Car> filteredCars = carService.transactionHistoryBuyFilter(buyerEmail);
		return new ModelAndView("transactionhistory", "carsSold", filteredCars);
	}

	@PostMapping("/cancelCar")
	public ModelAndView pendingCancel(Model model, @RequestParam String number, HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			carService.denyCar(number);
			model.addAttribute("success", "Sale cancelled. Added back to listings.");
			return new ModelAndView("pending", "carsPending", carService.carsPending);
		}
		carService.denyCar(number);
		model.addAttribute("success", "Sale cancelled. Added back to listings.");
		return new ModelAndView("pendingtransactions");
	}

	@PostMapping("/denyCar")
	public ModelAndView pendingDeny(Model model, @RequestParam String number, HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			carService.denyCar(number);
			model.addAttribute("success", "Sale cancelled. Added back to listings.");
			return new ModelAndView("pending", "carsPending", carService.carsPending);
		}
		return new ModelAndView("home", "users", userService.users);
	}

	@GetMapping("/past")
	public ModelAndView past(Model model, HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			return new ModelAndView("past", "carsSold", carService.carsSold);
		}
		return new ModelAndView("home", "users", userService.users);
	}

	@PostMapping("/past")
	public ModelAndView handlePast(Model model, @RequestParam String number, HttpSession session) {
		session.getAttribute("loginUser");
		if (((User) session.getAttribute("loginUser")).getEmail().equals("admin@mooncarexchange.com")) {
			carService.removePast(number);
			model.addAttribute("success", "Past sale removed from the transaction log.");
			return new ModelAndView("past", "carsSold", carService.carsSold);
		}
		return new ModelAndView("home", "users", userService.users);
	}

}
