package cigma.pfe.dao;

import cigma.pfe.models.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MockClients implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(MockClients.class);

    @Autowired
    private IClientDao clientRepository;

    @Override
    public void run(String... args) throws Exception {
        clientRepository.save(new Client("Omar"));
        clientRepository.save(new Client("Said"));
        clientRepository.save(new Client("Ahmed"));
        clientRepository.save(new Client("Farah"));
        clientRepository.findAll().forEach( c -> System.out.println(c) );
    }
}
