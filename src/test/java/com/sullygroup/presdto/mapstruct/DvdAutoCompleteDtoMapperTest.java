package com.sullygroup.presdto.mapstruct;

import com.sullygroup.presdto.dto.DvdAutoCompleteDto;
import com.sullygroup.presdto.entity.Dvd;
import com.sullygroup.presdto.entity.Personne;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class DvdAutoCompleteDtoMapperTest {

    public static final java.time.LocalDate JANV_1_99 = LocalDate.of(1999, 01, 01);

    // Attention ça n'inject pas les dépendances spring du mapper, utiliser spring ou @InjectMocks
    //en v1.3, l'injection se faisant par constructor il sera facile de donner les dépendances
    public static final DvdAutoCompleteDtoMapper MAPPER = Mappers.getMapper(DvdAutoCompleteDtoMapper.class);

    @Test
    public void toDvdAutoCompleteDto() throws Exception {
        Personne real = Personne.builder().nom("Wachowski").build();
        Dvd dvd = Dvd.builder().id(1L).nom("Matrix").realisateur(real).dateSortie(JANV_1_99).build();
        DvdAutoCompleteDto dto = MAPPER.toDvdAutoCompleteDto(dvd);
        assertEquals(1L, (long) dto.getId());
        assertEquals("Matrix", dto.getNom());
        assertEquals("Wachowski", dto.getRealisateur());
        assertEquals(1999, (int) dto.getAnneeSortie());
    }

//    @Test
//    public void localDateToAnnee() throws Exception {
//        assertEquals(1999, (int) MAPPER.localDateToAnnee(JANV_1_99));
//    }

}