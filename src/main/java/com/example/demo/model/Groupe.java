package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Groupe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String groupName;
    @Enumerated(EnumType.STRING)
    private Speciality speciality;
    @ManyToMany
    
    private List<Enseignant> enseignants;
    @OneToMany(mappedBy = "groupe")
    private List<Etudiant> etudiants;
    public Speciality getSpeciality() {
        return speciality;
    }
    public String getGroupName() {
        return groupName;
    }
    public Long getId() {
        return id;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void setSpeciality(Speciality speciality) {
     this.speciality = speciality;
     }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public List<Enseignant> getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(List<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }
}
