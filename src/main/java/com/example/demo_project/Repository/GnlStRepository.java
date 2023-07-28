package com.example.demo_project.Repository;

import com.example.demo_project.Entity.GnlStEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GnlStRepository extends JpaRepository<GnlStEntity, Long> {
    GnlStEntity findByEntNameAndShrtCode(String entcodeName, String shrtCode);
}
