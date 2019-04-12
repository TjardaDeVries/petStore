package nl.ordina.petstore.services;

import nl.ordina.petstore.dao.PetDAO;

public class PetService
{
    private final PetDAO petDAO;

    public PetService(PetDAO petDAO) {
        this.petDAO = petDAO;
    }

    @Override
    public String toString() {
        return "PetService [petDAO=" + petDAO + "]";
    }

}
