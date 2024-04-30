package com.org;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.org.Entity.PlayerClass;
import com.org.Repository.PlayerRepository;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		
		  ConfigurableApplicationContext context =SpringApplication.run(SpringDataJpaApplication.class, args); PlayerRepository
		  playerRepository = context.getBean(PlayerRepository.class);
		  System.out.println(playerRepository.getClass().getName());
		  
		  PlayerClass p1=new PlayerClass(101,"dhoni","india"); 
		  PlayerClass p2=new PlayerClass(102,"kohli","india"); 
		  PlayerClass p3=new PlayerClass(103,"rohit","india"); 
		  PlayerClass p4=new PlayerClass(104,"smith","aus");
		  
		  PlayerClass p5=new PlayerClass(105,"harsha","hyd");
		  
		  
		  
		  
		  playerRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
		  
		  
		  PlayerClass save = playerRepository.save(p5);
		 System.out.println(save);
		 
		 Optional<PlayerClass> findById = playerRepository.findById(105);
		 System.out.println(findById);
		
	
	}

}
