package co.usa.ciclo32022.Reto3.Controller;

import co.usa.ciclo32022.Reto3.Model.ReservationModel;
import co.usa.ciclo32022.Reto3.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("api/reservation")
@CrossOrigin(origins = "*")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<ReservationModel> getAllReservation(){
        return reservationService.getAllReservation();
    }

    @GetMapping("/{id}")
    public Optional <ReservationModel> getReservation(@PathVariable Integer id){
        return reservationService.getReservation(id);
    }
    @PostMapping("/save")
    public ReservationModel saveReservation(@RequestBody ReservationModel reservationModel){
        return reservationService.saveReservation(reservationModel);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteReservation(@PathVariable Integer id){
        return reservationService.deleteReservation(id);
    }
    @PutMapping("/update")
    public ReservationModel updateReservation(@RequestBody ReservationModel reservationModel){
        return reservationService.updateReservation(reservationModel);
    }
}

