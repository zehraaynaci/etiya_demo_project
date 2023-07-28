package com.example.demo_project.Services;

import com.example.demo_project.Entity.GnlStEntity;
import com.example.demo_project.Repository.GnlStRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneralStatusService {

    @Autowired
    public GnlStRepository gnlStRepository;

    public GnlStEntity getGnlStEntityByEntNameAndShortCode(String entCodeName, String shrtCode){
        return gnlStRepository.findByEntNameAndShrtCode(entCodeName, shrtCode);
    }



}
