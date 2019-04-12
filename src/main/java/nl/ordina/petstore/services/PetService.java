package nl.ordina.petstore.services;

import nl.ordina.petstore.dao.PetDAO;

public class PetService
{
    PetDAO petDAO;

    public void setPetDAO(PetDAO petDAO) {
        this.petDAO = petDAO;
    }

    @Override
    public String toString() {
        return "PetService [petDAO=" + petDAO + "]";
    }

}
