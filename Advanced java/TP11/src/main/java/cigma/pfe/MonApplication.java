package cigma.pfe;

import cigma.pfe.models.Client;
import cigma.pfe.controllers.ClientController;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MonApplication {
    public static void main(String[] args)
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctr= (ClientController) context.getBean("ctrl1");
        Client client1 = new Client("Omar");
        Client client2 = new Client("Said");
        Client client3 = new Client("Ahmed");
        // Test1 => save 3 Clients
        client1=ctr.save(client1);
        client2=ctr.save(client2);
        client3=ctr.save(client3);
        // Test2 => getAll Clients before modify and remove
        ctr.getAll().stream().forEach(i-> System.out.println(i));
        // Test3 => getOne Client service
        System.out.println(ctr.getOne(1));
        // Test4 => modify Client service
        client1.setName("Hassan");
        ctr.modify(client1);
        // Test5 => remove Client service
        ctr.remove(2);
        // Test getAll Client after modify and remove
        ctr.getAll().stream().forEach(i-> System.out.println(i));


    }

}

