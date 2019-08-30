package com.jpa.dao;

import com.jpa.domain.User1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User1, Long> {


}
