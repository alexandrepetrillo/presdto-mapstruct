package com.sullygroup.presdto.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
public class Dvd implements PersistanceEntity {

    @Id
    @GeneratedValue
    @Column
    private Long id;
    @Column
    private String nom;
    @Column
    private String synopsis;
    @Column
    private LocalDate dateSortie;
    @ManyToOne(fetch = FetchType.LAZY)
    private Pays nationalite;
    @ManyToOne(fetch = FetchType.LAZY)
    private Personne realisateur;
    @OneToMany(fetch = FetchType.LAZY)
    private Set<Personnage> personnages;
    @Column
    private Genre genre;

    @Tolerate
    public Dvd() {
    }
}
