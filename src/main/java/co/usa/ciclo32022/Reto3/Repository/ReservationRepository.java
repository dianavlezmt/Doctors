package co.usa.ciclo32022.Reto3.Repository;

import co.usa.ciclo32022.Reto3.Repository.crudrepository.ReservationCrudRepository;
import co.usa.ciclo32022.Reto3.modelo.ReservationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<ReservationModel> getAllReservations() {
        return (List<ReservationModel>) reservationCrudRepository.findAll();
    }

    public Optional<ReservationModel> getReservation(Integer idReservation) {
        return reservationCrudRepository.findById(idReservation);
    }

    public ReservationModel saveReservation(ReservationModel reservationModel ){

        return reservationCrudRepository.save(reservationModel);
    }

    public boolean deleteReservation(Integer idReservation){
        reservationCrudRepository.deleteById(idReservation);
        return true;
    }

    public ReservationModel updateReservation (ReservationModel reservationModel ){
        return reservationCrudRepository.save(reservationModel);
    }
}
