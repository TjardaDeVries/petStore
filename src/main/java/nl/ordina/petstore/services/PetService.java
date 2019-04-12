package nl.ordina.petstore.services;

import nl.ordina.petstore.dao.PetDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService
{
    private final PetDAO petDAO;

    @Autowired
    public PetService(PetDAO petDAO) {
        this.petDAO = petDAO;
    }

    @Override
    public String toString() {
        return "PetService [petDAO=" + petDAO + "]";
    }

}
