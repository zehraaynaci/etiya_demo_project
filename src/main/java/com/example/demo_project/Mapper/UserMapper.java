package com.example.demo_project.Mapper;

// dto ile entity arası bağlantı

import com.example.demo_project.DTOs.User;
import com.example.demo_project.Entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

//Mapper - Model ve Request/Response Dönüşümü
@Mapper(uses = {GeneralTypeMapper.class,GeneralStatusMapper.class,CustomerOrderMapper.class})
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
// 1-entity  2-dto
    @Mappings({
            @Mapping(source = "userId", target = "userId"),
            @Mapping(source = "scrName", target = "screenName"),
            @Mapping(source = "uname", target = "userName"),
            @Mapping(source = "pwd", target = "password"),
            @Mapping(source = "userTpId", target = "userType"),
            @Mapping(source = "gnlStId.gnlStId", target = "statusId")
           // @Mapping(source = "customerOrderEntityList", target = "customerOrderEntityList"),

    })
    User toUser(UserEntity userEntity);

    @InheritInverseConfiguration
    UserEntity toUserEntity(User user);

}

