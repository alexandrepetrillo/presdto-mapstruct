package com.sullygroup.presdto.mapstruct;

import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

@MapperConfig(
        uses = PersistanceEntityMapper.class,
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        componentModel = "spring"
        //injectionStrategy = InjectionStrategy.CONSTRUCTOR => mapstruct v1.3
)
public class CentralConfig {
}
