package co.usa.ciclo32022.Reto3.Repository.crudrepository;

import co.usa.ciclo32022.Reto3.modelo.MessageModel;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<MessageModel, Integer> {
}
