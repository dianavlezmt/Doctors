package co.usa.ciclo32022.Reto3.Service;

import co.usa.ciclo32022.Reto3.Repository.SpecialtyRepository;
import co.usa.ciclo32022.Reto3.modelo.SpecialtyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    public List<SpecialtyModel> getAllSpecialties(){
        return specialtyRepository.getAllSpecialties();
    }

    public Optional<SpecialtyModel> getSpecialty(Integer id){
        return specialtyRepository.getSpecialty(id);
    }

    public SpecialtyModel saveSpecialty(SpecialtyModel specialtyModel){
        return specialtyRepository.saveSpecialty(specialtyModel);
    }

    public boolean deleteSpecialty (Integer id){
        return specialtyRepository.deleteSpecialty(id);
    }

    public SpecialtyModel updateSpecialty(SpecialtyModel specialtyModel){
        return specialtyRepository.updateSpecialty(specialtyModel);
    }
}
