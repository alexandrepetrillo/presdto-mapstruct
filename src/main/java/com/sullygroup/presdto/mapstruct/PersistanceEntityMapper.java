package com.sullygroup.presdto.mapstruct;

import com.sullygroup.presdto.dto.IndentifiableDto;
import com.sullygroup.presdto.entity.PersistanceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ObjectFactory;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.TargetType;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.io.Serializable;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR, componentModel = "spring")
public class PersistanceEntityMapper {

    @Autowired
    private EntityManager entityManager;

    public <T extends PersistanceEntity> T idToEntity(Serializable id, @TargetType Class<T> entityClass) {
        return id != null ? entityManager.find(entityClass, id) : null;
    }

    public <T extends PersistanceEntity> Long toId(T obj) {
        return obj.getId();
    }

    @ObjectFactory
    public <T extends PersistanceEntity> T entityFactory(IndentifiableDto dto, @TargetType Class<T> entityClass) {
        if (dto.getId() == null) {
            try {
                return entityClass.newInstance();
            } catch (InstantiationException | IllegalAccessException e) {
                throw new RuntimeException("Class " + entityClass + " instanciation error", e);
            }
        } else {
            return idToEntity(dto.getId(), entityClass);
        }
    }

}
