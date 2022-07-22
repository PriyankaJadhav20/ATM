package com.example.UserService.Repository;

import com.example.UserService.Entitiy.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Users, Long> {

    Users findByUserId(Long userId) ;

}
