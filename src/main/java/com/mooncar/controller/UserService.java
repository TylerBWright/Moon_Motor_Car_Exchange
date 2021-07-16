package com.mooncar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mooncar.entity.User;

@Service
public class UserService {

	public List<User> users = new ArrayList<User>();
	{

		{
			User admin = new User();
			admin.setFname("Percy");
			admin.setLname("Benjamin");
			admin.setEmail("admin@mooncarexchange.com");
			admin.setAge("57");
			admin.setPassword("password");
			admin.setStreet("27859 Jackson St.");
			admin.setCity("St. Louis");
			admin.setState("MO");
			admin.setCountry("United States of America");
			admin.setZipCode("63116");
			admin.setBio(
					"I founded the Moon Motor Car Exchange in 2021 to connect buyers and sellers of MOON antique cars. Oftentimes people have no idea what their car is worth, and buyers are in a similar bind. Time to demistify that process! Our membership of Moon enthusiasts continues to grow by the day.");
			users.add(admin);

			User user1 = new User();
			user1.setFname("Jack");
			user1.setLname("Pullman");
			user1.setEmail("jpullman@email.com");
			user1.setAge("28");
			user1.setPassword("password");
			user1.setStreet("12 Bluebird Ln");
			user1.setCity("Dallas");
			user1.setState("TX");
			user1.setCountry("United States of America");
			user1.setZipCode("12345");
			user1.setBio("Looking to connect with other collecters. Send me an email if you'd like to chat.");
			users.add(user1);

			User user2 = new User();
			user2.setFname("Ashley");
			user2.setLname("Robinson");
			user2.setEmail("crazygurl27@email.com");
			user2.setAge("32");
			user2.setPassword("password");
			user2.setStreet("1553 Billboard Ln");
			user2.setCity("St. Louis");
			user2.setState("MO");
			user2.setCountry("United States of America");
			user2.setZipCode("63115");
			user2.setBio("I love food, wine and travel! I have a loveable fur baby named Biscuit who keeps me busy!");
			users.add(user2);

			User user3 = new User();
			user3.setFname("Tony");
			user3.setLname("Donahue");
			user3.setEmail("bigfish123@email.com");
			user3.setAge("55");
			user3.setPassword("password");
			user3.setStreet("905 Market Place Dr.");
			user3.setCity("Marquette");
			user3.setState("MI");
			user3.setCountry("United States of America");
			user3.setZipCode("75563");
			user3.setBio(
					"I've been an orthopedic surgeon for 25 years now. When I'm not fixing people, I like to go fishing. I'm a two-time Marquette fishing league champion. Looking to buy my first Moon Car soon.");
			users.add(user3);
			
			User user4 = new User();
			user4.setFname("Jonathan");
			user4.setLname("King");
			user4.setEmail("kingjohn@email.com");
			user4.setAge("33");
			user4.setPassword("password");
			user4.setStreet("12 Main St.");
			user4.setCity("Boston");
			user4.setState("MA");
			user4.setCountry("United States of America");
			user4.setZipCode("12655");
			user4.setBio(
					"I enjoy camping and the outdoors. My experience with Moon cars started when I was a kid driving around in my grandfather's 1912 model 30. This love for Moon led me to starting my own business working on classic cars.");
			users.add(user4);
			
			User user5 = new User();
			user5.setFname("Alvin");
			user5.setLname("Burrows");
			user5.setEmail("allaboutal@email.com");
			user5.setAge("29");
			user5.setPassword("password");
			user5.setStreet("");
			user5.setCity("Spokane");
			user5.setState("WA");
			user5.setCountry("USA");
			user5.setZipCode("");
			user5.setBio(
					"");
			users.add(user5);
			
			User user6 = new User();
			user6.setFname("Sally");
			user6.setLname("Shields");
			user6.setEmail("sshields@email.com");
			user6.setAge("36");
			user6.setPassword("password");
			user6.setStreet("100 Sandy Creek Dr.");
			user6.setCity("Moselle");
			user6.setState("MO");
			user6.setCountry("USA");
			user6.setZipCode("63098");
			user6.setBio(
					"I'm a biology teacher in the St. Clair County school district. My son restores classic cars and we are hoping to find an owner for our 1926 Moon Car.");
			users.add(user6);
			
			User user7 = new User();
			user7.setFname("John");
			user7.setLname("Hanson");
			user7.setEmail("oombophanson@email.com");
			user7.setAge("49");
			user7.setPassword("password");
			user7.setStreet("");
			user7.setCity("Riverside");
			user7.setState("CA");
			user7.setCountry("USA");
			user7.setZipCode("");
			user7.setBio(
					"I am currently working on my masters thesis covering the history of the St. Louis Moon Motor Car Company. I look forward to learning more about this period of early automobile history.");
			users.add(user7);
			
			User user8 = new User();
			user8.setFname("Billy");
			user8.setLname("Drew");
			user8.setEmail("billyd1254@email.com");
			user8.setAge("27");
			user8.setPassword("password");
			user8.setStreet("");
			user8.setCity("");
			user8.setState("");
			user8.setCountry("");
			user8.setZipCode("");
			user8.setBio(
					"I like bacon and cheese. Who doesn't?");
			users.add(user8);
			
			User user9 = new User();
			user9.setFname("John");
			user9.setLname("Matlock");
			user9.setEmail("matlock88@email.com");
			user9.setAge("55");
			user9.setPassword("password");
			user9.setStreet("17 Bell Blvd.");
			user9.setCity("Sprinfield");
			user9.setState("IL");
			user9.setCountry("United States of America");
			user9.setZipCode("");
			user9.setBio(
					"I have a couple of Moon Motor Cars for sale. Willing to negotiate.");
			users.add(user9);

		}
	}

	public void saveUser(User newUser) {
		users.add(newUser);

	}
	
	public boolean verifyAvailableUser(User user) {
		for (int i = 0; i < users.size(); i++) {
			User oldUser = users.get(i);
			if (user.getEmail().equals(oldUser.getEmail())) {
				return false;
			}
		}
		return true;
	}

	public User login(User logUser) {

		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			if (user.getEmail().equals(logUser.getEmail()) && (user.getPassword().equals(logUser.getPassword()))) {
				return user;
			}
		}
		return null;
	}

	public void removeUser(String email) {
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			if (user.getEmail().equals(email)) {
				users.remove(i);

			}
		}
	}
	
	public void updateUser(User updatedUser) {
		for (int i = 0; i < users.size(); i++) {
			User oldUser = users.get(i);
			if (updatedUser.getEmail().equals(oldUser.getEmail())) {
				users.set(i, updatedUser);
			}
		}
	}

	public void editAdminProfile(String email) {
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			if (user.getEmail().equals(email)) {
				users.remove(i);
			}

		}
	}
}