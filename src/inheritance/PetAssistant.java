package inheritance;

import java.util.ArrayList;

public class PetAssistant {

    public void feedPets(ArrayList<Pet> pets){
        for (Pet pet : pets) {
            pet.run();
            pet.feed(); // poliorfizm -> ta sama zmienna i ta sama metoda ale różne zachowanie bo różne obiekty pod spodem
        }
    }


}
