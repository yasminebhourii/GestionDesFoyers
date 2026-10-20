package tn.esprim.GestionDesFoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprim.GestionDesFoyer.repositories.UniversiteRepository;
import tn.esprim.GestionDesFoyer.service.IUniversiteService;

@RestController
public class UniversiteRestController {
    @Autowired
    private IUniversiteService universiteService;
}