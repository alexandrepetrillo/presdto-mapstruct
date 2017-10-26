package com.sullygroup.presdto.dto;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

@Data
@Builder
public class DvdAutoCompleteDto implements IndentifiableDto {
    private Long id;
    private String nom;
    private String realisateur;
    private Integer anneeSortie;

    @Tolerate
    public DvdAutoCompleteDto() {
    }

}
