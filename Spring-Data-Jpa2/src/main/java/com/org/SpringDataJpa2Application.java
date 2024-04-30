package com.org;

import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.org.Entity.UserClass;
import com.org.JpaRepository.UserJpaRepository;

@SpringBootApplication
public class SpringDataJpa2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpa2Application.class, args);
		UserJpaRepository bean = context.getBean(UserJpaRepository.class);
		System.out.println(bean.getClass().getName());
		
		List<UserClass> findAll = bean.findAll(Sort.by("id").descending());
		findAll.forEach(user->System.out.println(user));
		

		
		/*
		 * UserClass u1 = new UserClass(101, "manikanta", 24, "male", "hyd"); UserClass
		 * u2 = new UserClass(102, "mani", 24, "male", "hyd"); UserClass u3 = new
		 * UserClass(103, "sri", 23, "male", "chenni"); UserClass u4 = new
		 * UserClass(104, "teja", 24, "male", "kakinada"); UserClass u5 = new
		 * UserClass(105, "naveen", 20, "male", "kakinada"); UserClass u6 = new
		 * UserClass(106, "yuva", 22, "male", "hyd"); UserClass u7 = new UserClass(107,
		 * "chitty", 19, "famale", "hyd"); UserClass u8 = new UserClass(108, "yuva", 24,
		 * "male", "hyd");
		 * 
		 * Iterable<UserClass> saveAll = userRepository.saveAll(Arrays.asList(u1, u2,
		 * u3, u4, u5, u6, u7, u8));
		 * 
		 * System.out.println(saveAll);
		 * 
		 * List<UserClass> findbyLocation = userRepository.findByLocation("kakinada");
		 * findbyLocation.forEach(user -> System.out.println(user));
		 * 
		 * List<UserClass> findByAge = userRepository.findByAge(22);
		 * findByAge.forEach(user -> System.out.println(user));
		 * 
		 * List<UserClass> u = userRepository.findByNameIsStartingWith("m");
		 * u.forEach(user -> System.out.println(user));
		 * 
		 * List<UserClass> findByLocationIn =
		 * userRepository.findByLocationIn(Arrays.asList("hyd", "kakinada"));
		 * findByLocationIn.forEach(user -> System.out.println(user));
		 * 
		 * List<UserClass> myQueary = userRepository.retriveData();
		 * myQueary.forEach(user -> System.out.println(user));
		 * 
		 * System.out.println(
		 * "----------------------------------------------------------");
		 * 
		 * List<UserClass> allUserSql = userRepository.getAllUserSql();
		 * allUserSql.forEach(user -> System.out.println(user));
		 * 
		 * System.out.println(
		 * "----------------------------------------------------------");
		 * 
		 * List<UserClass> allUserByLocation =
		 * userRepository.getAllUserByLocation("hyd"); allUserByLocation.forEach(user ->
		 * System.out.println(user));
		 * 
		 * System.out.println(
		 * "-----------------------------------------------------------------------");
		 * 
		 * List<UserClass> allUserByCountryAndAge =
		 * userRepository.getAllUserByCountryAndAge("hyd", 22);
		 * allUserByCountryAndAge.forEach(System.out::println);
		 */

	}

}
