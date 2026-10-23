package tn.esprim.GestionDesFoyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.GestionDesFoyer.repositories.ReservationRepository;

@Service
public class ReservationServiceImpl implements IReservationService{
    @Autowired
    private ReservationRepository reservationRepository;

}
