package com.sullygroup.presdto.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Personnage implements PersistanceEntity {

    @Id
    @GeneratedValue
    @Column
    private Long id;
    @Column
    private String role;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne personne;
}
