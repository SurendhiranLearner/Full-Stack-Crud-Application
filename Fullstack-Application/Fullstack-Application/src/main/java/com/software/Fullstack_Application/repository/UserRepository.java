package com.software.Fullstack_Application.repository;

import com.software.Fullstack_Application.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{

}
