package org.example.jpa;

import org.example.jpa.dao.UserRepository;
import org.example.jpa.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(JpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
//      Saving Single User

//		User user=new User();
//		user.setName("Zaeem");
//		user.setCity("Lahore");
//		user.setStatus("Learning");
//
//		User users = userRepository.save(user);

		// Saving multiple User
//		User user1=new User();
//		user1.setName("Zaid");
//		user1.setCity("Khanewal");
//		user1.setStatus("Devops Intern");
//
//		User user2=new User();
//		user2.setName("Umair");
//		user2.setCity("Lahore");
//		user2.setStatus("Learning Devops");
////
//		List<User> user=List.of(user2,user1);
//		Iterable<User> result= userRepository.saveAll(user);
////
//		result.forEach(user3 -> {
//			System.out.println(user3);
//		});
//
//		System.out.println("saved " + result);


		// Update User
		//find by id
//		Optional<User> optional=userRepository.findById(3);
//
//		User user=optional.get();
//		user.setName("Waseem Ishaq");
//
//		User result=userRepository.save(user);
//
//		System.out.println(result);


		// GET ALL
//		Iterable<User> itr=userRepository.findAll();
//		Iterator<User> iterator=itr.iterator();
//			while (iterator.hasNext()) {
//				User user=iterator.next();
//				System.out.println(user);
//			}

		// ITERATE ALL AND GET THEM BY LAMBDA FUNCTION
//		itr.forEach(user -> System.out.println(user));

//		userRepository.deleteById(1);

//		Iterable<User> delALL=userRepository.findAll();
//		delALL.forEach(user -> System.out.println(user));
//		userRepository.deleteAll(delALL);

		List<User> allUser=userRepository.getAllUser();

		allUser.forEach(user -> System.out.println(user));

		System.out.println("--------------------------------------------------");
		List<User> byCityUser=userRepository.getByCity("Lahore","Learning Devops");

		byCityUser.forEach(user -> System.out.println(user));
		System.out.println("done");
        }
	}

