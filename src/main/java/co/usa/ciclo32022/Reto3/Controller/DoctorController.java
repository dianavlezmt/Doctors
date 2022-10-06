package co.usa.ciclo32022.Reto3.Controller;

import co.usa.ciclo32022.Reto3.Service.DoctorService;
import co.usa.ciclo32022.Reto3.modelo.DoctorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Doctor")
@CrossOrigin(origins = "*")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/all")
    public List<DoctorModel> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @PostMapping("/all")
    @ResponseStatus(HttpStatus.CREATED)
    public List<DoctorModel> getAllDoctors2(){
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public Optional <DoctorModel> getDoctor(@PathVariable Integer id){
        return doctorService.getDoctor(id);
    }

    @PostMapping("/save")
    public DoctorModel saveDoctor(@RequestBody DoctorModel doctorModel){
        return doctorService.saveDoctor(doctorModel);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteDoctor(@PathVariable Integer id){
        return doctorService.deleteDoctor(id);
    }
    @PutMapping("/update")
    public DoctorModel updateDoctor(@RequestBody DoctorModel doctorModel){
        return doctorService.updateDoctor(doctorModel);
    }
}
