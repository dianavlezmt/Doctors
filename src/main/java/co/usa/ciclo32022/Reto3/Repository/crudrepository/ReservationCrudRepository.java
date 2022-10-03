package co.usa.ciclo32022.Reto3.Repository.crudrepository;

import co.usa.ciclo32022.Reto3.modelo.ReservationModel;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<ReservationModel, Integer> {
}
