package com.example.demo_project.Services;

import com.example.demo_project.Entity.GnlTpEntity;
import com.example.demo_project.Repository.GnlTpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneralTypeService {

    @Autowired
    public GnlTpRepository gnlTpRepository;
    public GnlTpEntity getGnlTpEntityByEntCodeNameAndShortCode(String entCodeName, String shrtCode){
      return gnlTpRepository.findByEntCodeNameAndShrtCode(entCodeName, shrtCode);
 }
}


