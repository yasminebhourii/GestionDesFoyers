package tn.esprim.GestionDesFoyer.service;

import tn.esprim.GestionDesFoyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre C);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);

}
