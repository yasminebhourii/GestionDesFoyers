package tn.esprim.GestionDesFoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.GestionDesFoyer.repositories.UniversiteRepository;

@Service
public class UniversiteServiceImpl implements IUniversiteService{
    @Autowired
    private UniversiteRepository universiteRepository;

}
