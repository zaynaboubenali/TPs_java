package cigma.pfe;

import cigma.pfe.models.Client;
import cigma.pfe.controllers.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {
    public static void main(String[] args)
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController)context.getBean("idCtrl");
        Client clt = new Client("OMAR");
        ctrl.save(clt);

    }

}
