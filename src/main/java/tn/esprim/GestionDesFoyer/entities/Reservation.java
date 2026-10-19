package tn.esprim.GestionDesFoyer.entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idReservation;
    private Date anneeUniversitaire;
    private Boolean estValide;
    @ManyToOne
    private Chambre chambre;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Etudiant> etudiants;
}
