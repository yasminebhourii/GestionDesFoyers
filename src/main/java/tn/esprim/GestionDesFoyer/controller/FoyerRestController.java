package tn.esprim.GestionDesFoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprim.GestionDesFoyer.repositories.FoyerRepository;
import tn.esprim.GestionDesFoyer.service.IFoyerService;

@RestController
public class FoyerRestController {
    @Autowired
    private IFoyerService foyerService;
}