package com.example.demo_project.Repository;

import com.example.demo_project.Entity.CustOrdEntity;
import com.example.demo_project.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustOrdRepository extends JpaRepository<CustOrdEntity, Long> {
}
