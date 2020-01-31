package com.saravana.userApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saravana.userApp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
