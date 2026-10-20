package tn.esprim.GestionDesFoyer.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Etudiant implements Serializable {

    @Id
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long Cin;
    private String ecole;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dateNaissance;
    @ManyToMany
    private List<Reservation> reservations;
}