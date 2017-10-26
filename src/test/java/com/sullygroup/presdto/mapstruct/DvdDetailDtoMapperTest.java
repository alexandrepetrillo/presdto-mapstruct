package com.sullygroup.presdto.mapstruct;

import com.sullygroup.presdto.dto.DvdDetailDto;
import com.sullygroup.presdto.entity.Dvd;
import com.sullygroup.presdto.entity.Pays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DvdDetailDtoMapperTest {

    @InjectMocks
    private DvdDetailDtoMapperImpl mapper;

    @Mock
    private PersistanceEntityMapper entityMapper;

    @Test
    public void toDvdAutoCompleteDto() throws Exception {
        Pays france = new Pays();
        when(entityMapper.idToEntity(50L, Pays.class)).thenReturn(france);

        DvdDetailDto dto = DvdDetailDto.builder().id(null).nom("Matrix").nationalite(50L).build();
        Dvd dvd = mapper.toDvdAutoCompleteDto(dto);
        Assert.assertEquals(france, dvd.getNationalite());
    }

}