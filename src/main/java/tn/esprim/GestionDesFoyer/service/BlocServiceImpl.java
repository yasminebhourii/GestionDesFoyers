package tn.esprim.GestionDesFoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.GestionDesFoyer.repositories.BlocRepository;

@Service
public class BlocServiceImpl implements IBlocService{
    @Autowired
    private BlocRepository blocRepository;

}
