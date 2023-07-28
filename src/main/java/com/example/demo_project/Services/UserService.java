package com.example.demo_project.Services;

import com.example.demo_project.DTOs.User;
import com.example.demo_project.Entity.UserEntity;
import com.example.demo_project.Mapper.UserMapper;
import com.example.demo_project.Repository.UserRepository;
import com.example.demo_project.Request.CreateUserRequest;
import com.example.demo_project.Request.InquireUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//Service - İş Mantığının Uygulandığı Katman
//@Component
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GeneralStatusService generalStatusService;

    public User inquireUser(InquireUserRequest inquireUserRequest){
        return UserMapper.INSTANCE.toUser(userRepository.findByUnameAndPwd(inquireUserRequest.getUname(), inquireUserRequest.getPwd()));
    }


    public User createUser(CreateUserRequest createUserRequest) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUname(createUserRequest.getName());
        userEntity.setScrName(createUserRequest.getName());
        userEntity.setPwd(createUserRequest.getPwd());
        userEntity.setGnlStId(generalStatusService.getGnlStEntityByEntNameAndShortCode("usr", "actv"));
        return UserMapper.INSTANCE.toUser(userRepository.save(userEntity));
    }

}
