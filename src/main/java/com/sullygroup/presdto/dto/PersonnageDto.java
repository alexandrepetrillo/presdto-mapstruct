package com.sullygroup.presdto.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

@Getter
@Setter
@Builder
public class PersonnageDto implements IndentifiableDto {
    private Long id;
    private String role;
    private Long personne;

    @Tolerate
    public PersonnageDto() {
    }
}
