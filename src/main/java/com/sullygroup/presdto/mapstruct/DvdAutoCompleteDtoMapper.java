package com.sullygroup.presdto.mapstruct;

import com.sullygroup.presdto.dto.DvdAutoCompleteDto;
import com.sullygroup.presdto.entity.Dvd;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = CentralConfig.class)
public abstract class DvdAutoCompleteDtoMapper {

    //En java < 8 il faut utiliser le wrapper @Mapping
    @Mapping(source = "realisateur.nom", target = "realisateur")
    @Mapping(target = "anneeSortie", expression = "java(dvd.getDateSortie().getYear())")
    public abstract DvdAutoCompleteDto toDvdAutoCompleteDto(Dvd dvd);

}
