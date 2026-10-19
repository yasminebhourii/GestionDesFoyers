package tn.esprim.GestionDesFoyer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprim.GestionDesFoyer.repositories.ChambreRepository;
import tn.esprim.GestionDesFoyer.service.IChambreService;

@RestController
public class ChambreRestController {
    @Autowired
    private IChambreService chambreService;
}