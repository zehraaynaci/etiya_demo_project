package com.example.demo_project.Services;

import com.example.demo_project.Entity.UserEntity;
import com.example.demo_project.Repository.UserRepository;
import com.example.demo_project.Request.CreateUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    public UserRepository userRepository;
    @Autowired
    public GeneralStatusService generalStatusService;
    /*
    @Override
    public UserEntity createUser(CreateUserRequest createUserRequest){
        UserEntity userEntity = new UserEntity();
        userEntity.setUname(createUserRequest.getName());
        userEntity.setScrName(createUserRequest.getScrName());
        userEntity.setPwd(createUserRequest.getPwd());
        //userEntity.setGnlStEntity(generalStatusService.getGnlStEntityByEntNameAndShortCode(entCodeName: "usr",shrtCode: "");
        return userRepository.save(userEntity);
    }
    @Override
    public UserEntity inquireUser(InquireUserRequest inquireUserRequest){
        UserEntity userEntity = new UserEntity();
        return userRepository.findById(userEntity.getUserId()).orElse(null);
    }

}

*/