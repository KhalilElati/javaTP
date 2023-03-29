package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Enseignant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String enseignantName;
    @ManyToMany(mappedBy = "enseignants")
    private List<Groupe> groupes;
    private Date date;
    public String getEnseignantName() {
        return enseignantName;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Long getId() {
        return id;
    }
    public void setEnseignantName(String enseignatName) {
        this.enseignantName = enseignatName;
    }
}
