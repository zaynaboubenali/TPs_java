package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping("/all")
    public List<Client> getAll() {
        return service.getAll();
    }
    @PostMapping("/create")
    public Client save(@RequestBody Client clt) {
        return service.save(clt);
    }

    @PutMapping("/update")
    public Client modify(@RequestBody Client clt){
        return service.modify(clt);
    }

    @DeleteMapping("/remove/{id}")
    public void removeById(@PathVariable("id") long idClt){
        service.delete(idClt);
    }

    @GetMapping("/{id}")
    public Client getOne(@PathVariable("id") long idClt) {
        return service.getOne(idClt);
    }

    @GetMapping("/all/{name}")
    public List<Client> getAllByMC(@PathVariable("name") String NomClient){
        return service.FindAllByName(NomClient);
    }


}
