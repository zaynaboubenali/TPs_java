package cigma.pfe.dao;
import cigma.pfe.models.Client;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IClientDao extends CrudRepository<Client,Long> {
    Client save(Client c);
    Client update(Client c);
    void deleteById(long id);
}
