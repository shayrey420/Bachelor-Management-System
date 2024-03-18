package com.bechalor.sealthedeal.Repository;

import com.bechalor.sealthedeal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User findByEmail(String email);

}
