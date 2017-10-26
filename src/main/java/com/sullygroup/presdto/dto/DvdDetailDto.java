package com.sullygroup.presdto.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Builder
public class DvdDetailDto implements IndentifiableDto {
    private Long id;
    private String nom;
    private String synopsis;
    private LocalDate dateSortie;
    private Long nationalite;
    private Long realisateur;
    private Set<PersonnageDto> personnages;

    @Tolerate
    public DvdDetailDto() {
    }

}
