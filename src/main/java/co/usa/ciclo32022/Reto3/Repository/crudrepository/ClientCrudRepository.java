package co.usa.ciclo32022.Reto3.Repository.crudrepository;

import co.usa.ciclo32022.Reto3.modelo.ClientModel;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository <ClientModel, Integer> {
}
