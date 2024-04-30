package com.org.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.org.Entity.UserClass;

public interface UserRepository extends CrudRepository<UserClass, Integer> {
	
	
	 public List<UserClass> findByLocation(String location);
	 
	 public  List<UserClass> findByAge(int age);
	 
	 public List<UserClass> findByNameIsStartingWith(String name);
	 
	 public List<UserClass> findByLocationIn(List<String> places);
	 
	 
	 		@Query(value =" from UserClass")
	 		public List<UserClass> retriveData();
	 		
	 		
	 		@Query(value=" select * from user_table" , nativeQuery = true)
	 		public List<UserClass> getAllUserSql();
	 		
	 		
	 		@Query(value = "from UserClass where location=:area")
	 		public List<UserClass> getAllUserByLocation(String area);
	 		
	 	   @Query(value="from UserClass where location=:cname and age=:age")
	 	   public List<UserClass> getAllUserByCountryAndAge(String cname,Integer age);

		


	 	
}
