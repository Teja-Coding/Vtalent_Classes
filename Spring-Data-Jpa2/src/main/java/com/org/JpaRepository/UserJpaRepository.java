package com.org.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.Entity.UserClass;

public interface UserJpaRepository extends JpaRepository<UserClass, Integer> {

}
