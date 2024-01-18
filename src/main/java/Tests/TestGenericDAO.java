package Tests;

import Controller.GenericDAO;
import Metier.Card;
import jakarta.persistence.Id;
import org.junit.Test;

import java.util.List;

public class TestGenericDAO {

//    @Test
//    public void testGenericSave() {
//        Card card = new Card("Name Card 7", 7, "Description Card 7", 1);
//        GenericDAO.save(card);
//
////         Display the newly added Person
//        System.out.println("NEW : " + GenericDAO.findById(Card.class, card.getId()));
//    }
//
//    @Test
//    public void testGenericMultiSave() {
//        for (int i = 10; i < 20; i++) {
//            Card card = new Card("Name Card " + i, i, "Description Card " + i, i);
//            GenericDAO.save(card);
//            System.out.println("Name Card "+i+"Description Card ");
//        }
//    }

    @Test
    public void testFindByIdBefore(){
    Card card = GenericDAO.findById(Card.class, 1);
        System.out.println(card);
}

    @Test
    public void testUpdate() {
        List<Card> cards = GenericDAO.findAll(Card.class);
        if (!cards.isEmpty()) {
//            int firstExistingId = GenericDAO.findAll(Card.class).get(0).getId();
            int i = 1;
            Card card = GenericDAO.findById(Card.class, i);
            //Display Before
            System.out.println(card);
            //Update
            card.setNameCard("Name Card 0");
            card.setCategory(1);
            card.setCost(0);
//            card.setId();
            card.setDescription("Description Card 0");
            GenericDAO.update(card);
            // Display After
            System.out.println(card);
        } else {
            System.out.println("La table est vide !");
        }

    }

    @Test
    public void testFindByIdAfter(){
        Card card = GenericDAO.findById(Card.class, 1);
        System.out.println(card);
    }



//    @Test
//    public void testGenericFindAll() {
//        // PERSON -------------------
//        displayAll(Card.class);
//    }
//
//    private <T> void displayAll(Class<T> varType) {
//        if(!GenericDAO.findAll(varType).isEmpty()) {
//            // Find all results for the chosen Object type
//            List<T> list = GenericDAO.findAll(varType);
//
//            // Display results
//            System.out.println("All " + varType.getSimpleName() + "s :");
//            for (T element : list) {
//                System.out.println(element);
//            }
//
//        } else {
//            System.out.println("No " +  varType.getSimpleName() + " found.");
//        }
//    }


}
