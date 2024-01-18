package Tests;

import Controller.CardDAO;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import Metier.Card;

public class Tests {

    @Test
    public void testSaveCard(){
        Card card = new Card("Name Card 2", 2, "Description Card 2", 2);
        CardDAO.save(card);
    }
}
