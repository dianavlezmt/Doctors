package co.usa.ciclo32022.Reto3.Repository;

import co.usa.ciclo32022.Reto3.Repository.crudrepository.SpecialtyCrudRepository;
import co.usa.ciclo32022.Reto3.modelo.SpecialtyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SpecialtyRepository {

    @Autowired
    private SpecialtyCrudRepository specialtyCrudRepository;

    public List<SpecialtyModel> getAllSpecialties() {
        return (List<SpecialtyModel>) specialtyCrudRepository.findAll();
    }

    public Optional<SpecialtyModel> getSpecialty(Integer id) {
        return specialtyCrudRepository.findById(id);
    }
    public SpecialtyModel saveSpecialty (SpecialtyModel specialtyModel){
        return specialtyCrudRepository.save(specialtyModel);
    }

    public boolean deleteSpecialty(Integer id){
        specialtyCrudRepository.deleteById(id);
        return true;
    }
    public SpecialtyModel updateSpecialty (SpecialtyModel specialtyModel){
        return specialtyCrudRepository.save(specialtyModel);
    }
}
