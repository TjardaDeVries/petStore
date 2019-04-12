package nl.ordina.petstore;

import nl.ordina.petstore.dao.PetDAO;
import nl.ordina.petstore.services.PetService;

public class App
{
    public static void main( String[] args )
    {
        PetDAO petDAO = new PetDAO();
        PetService petService = new PetService();
        petService.setPetDAO(petDAO);

        System.out.println(petService.toString());

    }
}
