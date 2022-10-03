package co.usa.ciclo32022.Reto3.Controller;

import co.usa.ciclo32022.Reto3.Service.SpecialtyService;
import co.usa.ciclo32022.Reto3.modelo.SpecialtyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Specialty")
@CrossOrigin(origins = "*")
public class SpecialtyController {

    @Autowired
    private SpecialtyService specialtyService;

    @GetMapping("/all")
    public List<SpecialtyModel> getAllSpecialties(){
        return specialtyService.getAllSpecialties();
    }
    @GetMapping("/{id}")
    public Optional<SpecialtyModel> getSpecialty(@PathVariable Integer id){
        return specialtyService.getSpecialty(id);
    }

    @PostMapping("/save")
    public SpecialtyModel saveSpecialty(@RequestBody SpecialtyModel specialtyModel){
        return specialtyService.saveSpecialty(specialtyModel);
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteSpecialty(@PathVariable Integer id){
        return specialtyService.deleteSpecialty(id);
    }
    @PutMapping("/update")
    public SpecialtyModel updateSpecialty(@RequestBody SpecialtyModel specialtyModel){
        return specialtyService.updateSpecialty(specialtyModel);
    }
}
