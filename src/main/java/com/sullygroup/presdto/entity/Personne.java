package com.sullygroup.presdto.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@Builder
public class Personne implements PersistanceEntity {

    @Id
    @GeneratedValue
    @Column
    private Long id;
    @Column
    private String nom;
    @Column
    private String prenom;
}
