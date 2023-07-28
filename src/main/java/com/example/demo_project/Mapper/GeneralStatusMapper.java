package com.example.demo_project.Mapper;

import com.example.demo_project.DTOs.GeneralStatus;
import com.example.demo_project.Entity.GnlStEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

public interface GeneralStatusMapper {
    GeneralStatusMapper INSTANCE = Mappers.getMapper(GeneralStatusMapper.class);

//1- entity 2-dto
    @Mappings({
            @Mapping(source = "gnlStId", target = "generalStatusId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "descr", target = "description"),
            @Mapping(source = "shrtCode", target = "shortCode"),
            @Mapping(source = "entName", target = "entityName"),
            @Mapping(source = "isActv", target = "isActive")
            // @Mapping(source = "customerOrderEntityList", target = "customerOrderEntityList"),

    })


    GeneralStatus toGeneralStatus(GnlStEntity generalStatusEntityEntity);

    @InheritInverseConfiguration
    GnlStEntity toGeneralStatusEntity(GeneralStatus generalStatus);
}
