package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String firstname;
    private String lastname;
    @ManyToOne
    private Groupe groupe;
    // default conatructor
    public Etudiant() {
    }
    public Groupe getGroupe() {
        return groupe;
    }
    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

}