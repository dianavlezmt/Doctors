package co.usa.ciclo32022.Reto3.Service;

import co.usa.ciclo32022.Reto3.Repository.ReservationRepository;
import co.usa.ciclo32022.Reto3.modelo.ReservationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<ReservationModel> getAllReservations(){
        return reservationRepository.getAllReservations();
    }

    public Optional<ReservationModel> getReservation(Integer idReservation){
        return reservationRepository.getReservation(idReservation);
    }

    public ReservationModel saveReservation(ReservationModel reservationModel){
        return reservationRepository.saveReservation(reservationModel);
    }

    public boolean deleteReservation (Integer idReservation){
        return reservationRepository.deleteReservation(idReservation);
    }

    public ReservationModel updateReservation(ReservationModel reservationModel){
        return reservationRepository.updateReservation(reservationModel);
    }

}
