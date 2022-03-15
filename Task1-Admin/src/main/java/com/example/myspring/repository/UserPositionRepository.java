package com.example.myspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.myspring.model.UserPosition;

public interface UserPositionRepository extends JpaRepository<UserPosition, String> {

}
