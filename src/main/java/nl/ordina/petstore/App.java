package nl.ordina.petstore;

import nl.ordina.petstore.services.PetService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);;

        PetService petService = (PetService) context.getBean("petService");

        System.out.println(petService.toString());

    }
}
