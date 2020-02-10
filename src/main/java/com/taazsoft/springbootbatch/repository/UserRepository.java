package com.taazsoft.springbootbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taazsoft.springbootbatch.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
