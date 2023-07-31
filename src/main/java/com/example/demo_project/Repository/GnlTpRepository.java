package com.example.demo_project.Repository;

import com.example.demo_project.Entity.GnlStEntity;
import com.example.demo_project.Entity.GnlTpEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GnlTpRepository extends JpaRepository<GnlTpEntity, Long> {

    GnlTpEntity findByEntCodeNameAndShrtCode(String entcodeName, String shrtCode);
}
