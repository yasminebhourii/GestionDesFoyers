package tn.esprim.GestionDesFoyer.entities;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Reservation implements Serializable{
    @Id
    private String idReservation;
    private Date anneeUniversitaire;
    private Boolean estValide;
    @ManyToOne
    private Chambre chambre;
    @ManyToMany(mappedBy = "reservations")
    private List<Etudiant> etudiants;
}
