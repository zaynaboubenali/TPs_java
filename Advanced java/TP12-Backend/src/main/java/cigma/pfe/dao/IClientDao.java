package cigma.pfe.dao;
import cigma.pfe.models.Client;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface IClientDao extends CrudRepository<Client,Long> {
    List<Client> findByName(String name);

}
