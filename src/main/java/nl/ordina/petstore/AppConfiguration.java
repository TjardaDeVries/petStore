package nl.ordina.petstore;

import nl.ordina.petstore.dao.PetDAO;
import nl.ordina.petstore.services.PetService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public PetDAO petDAO() { return new PetDAO();}

    @Bean
    public PetService petService()
    {
        return new PetService(petDAO());
    }
}
