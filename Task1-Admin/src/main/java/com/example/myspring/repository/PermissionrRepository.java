package com.example.myspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myspring.model.Permission;

public interface PermissionrRepository extends JpaRepository<Permission, String> {

}
