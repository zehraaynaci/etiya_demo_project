package com.example.demo_project.Repository;

import com.example.demo_project.Entity.ProdOfrEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOfferRepository extends JpaRepository<ProdOfrEntity, Long> {
}
