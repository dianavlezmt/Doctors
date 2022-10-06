package co.usa.ciclo32022.Reto3.Controller;


import co.usa.ciclo32022.Reto3.Service.ReservationService;
import co.usa.ciclo32022.Reto3.modelo.ReservationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<ReservationModel> getAllReservations(){
        return reservationService.getAllReservations();
    }

    @PostMapping("/all")
    @ResponseStatus(HttpStatus.CREATED)
    public List<ReservationModel> getAllReservations2(){
        return reservationService.getAllReservations();
    }

    @GetMapping("/{idReservation}")
    public Optional<ReservationModel> getReservation(@PathVariable Integer idReservation){
        return reservationService.getReservation(idReservation);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public ReservationModel saveReservation(@RequestBody ReservationModel reservationModel){
        return reservationService.saveReservation(reservationModel);
    }
    @DeleteMapping("/delete/{idReservation}")
    public boolean deleteReservation(@PathVariable Integer idReservation){
        return reservationService.deleteReservation(idReservation);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public ReservationModel updateReservation(@RequestBody ReservationModel reservationModel){
        return reservationService.updateReservation(reservationModel);
    }
}
