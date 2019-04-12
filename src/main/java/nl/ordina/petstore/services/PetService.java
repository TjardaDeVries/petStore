package nl.ordina.petstore.services;

import nl.ordina.petstore.dao.PetDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PetService
{
    @Autowired
    PetDAO petDAO;

    @Override
    public String toString() {
        return "PetService [petDAO=" + petDAO + "]";
    }

}
