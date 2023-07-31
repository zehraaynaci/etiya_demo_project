package com.example.demo_project.Services;

import com.example.demo_project.DTOs.User;
import com.example.demo_project.Entity.UserEntity;
import com.example.demo_project.Exceptions.BusinessValidationException;
import com.example.demo_project.Mapper.UserMapper;
import com.example.demo_project.Repository.UserRepository;
import com.example.demo_project.Request.CreateUserRequest;
import com.example.demo_project.Request.InquireUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Service - İş Mantığının Uygulandığı Katman
//@Component
@Service
public class UserService {

    private final UserRepository userRepository;
    private final GeneralStatusService generalStatusService;

    private final GeneralTypeService generalTypeService;


    @Autowired
    public UserService(UserRepository userRepository, GeneralStatusService generalStatusService, GeneralTypeService generalTypeService) {
        this.userRepository = userRepository;
        this.generalStatusService = generalStatusService;
        this.generalTypeService = generalTypeService;

    }

    public User inquireUser(InquireUserRequest inquireUserRequest){
        return UserMapper.INSTANCE.toUser(userRepository.findByUnameAndPwd(inquireUserRequest.getUname(), inquireUserRequest.getPwd()));
    }


    public User createUser(CreateUserRequest createUserRequest) throws BusinessValidationException {
        UserEntity userEntity = new UserEntity();
        userEntity.setUname(createUserRequest.getName());
        userEntity.setScrName(createUserRequest.getName());
        userEntity.setPwd(createUserRequest.getPwd());
        userEntity.setGnlStId(generalStatusService.getGnlStEntityByEntNameAndShortCode("usr", "actv"));
        userEntity.setUserTpId(generalTypeService.getGnlTpEntityByEntCodeNameAndShortCode("usr", "actv"));
        return UserMapper.INSTANCE.toUser(userRepository.save(userEntity));
    }
    //AOP

  /*
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long userId) {
        User user = Service.getUser(userId);
        if (user == null) {
            throw new UserNotFoundException("User not found, UserId: " + UserId);
        }
        return user;
    }

*/
}
