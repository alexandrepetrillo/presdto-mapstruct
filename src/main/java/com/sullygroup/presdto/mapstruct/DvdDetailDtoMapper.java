package com.sullygroup.presdto.mapstruct;

import com.sullygroup.presdto.dto.DvdDetailDto;
import com.sullygroup.presdto.entity.Dvd;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

@Mapper(config = CentralConfig.class)
public abstract class DvdDetailDtoMapper {

    @Autowired
    private EntityManager em;

    @Mapping(target = "genre", ignore = true)
    public abstract Dvd toDvdAutoCompleteDto(DvdDetailDto dto);

    @InheritInverseConfiguration
    public abstract DvdDetailDto toDto(Dvd dvd);

}