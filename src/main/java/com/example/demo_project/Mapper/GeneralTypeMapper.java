package com.example.demo_project.Mapper;

import com.example.demo_project.DTOs.GeneralStatus;
import com.example.demo_project.DTOs.GeneralType;
import com.example.demo_project.DTOs.User;
import com.example.demo_project.Entity.GnlStEntity;
import com.example.demo_project.Entity.GnlTpEntity;
import com.example.demo_project.Entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GeneralTypeMapper {

    GeneralTypeMapper INSTANCE = Mappers.getMapper(GeneralTypeMapper.class);


    @Mappings({
            @Mapping(source = "gnlTpId", target = "generalTypeId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "descr", target = "description"),
            @Mapping(source = "shrtCode", target = "shortCode"),
            @Mapping(source = "endCodeName", target = "entityCodeName"),
            @Mapping(source = "isActv", target = "active")
            // @Mapping(source = "customerOrderEntityList", target = "customerOrderEntityList"),

    })

    GeneralType toGeneralType(GnlTpEntity gnlTpEntity);

    @InheritInverseConfiguration
    GnlStEntity toGnlStEntity(GeneralStatus generalStatus);

}
