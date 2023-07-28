package com.example.demo_project.Repository;

import com.example.demo_project.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//Kullanıcı veri tabanı etkileşimi
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    //select * from Users where uname = ? and pwd = ?;
   UserEntity  findByUnameAndPwd(String uname, String password);

}
