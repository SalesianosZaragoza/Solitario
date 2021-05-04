package Ejercicio007;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Image;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DeckTest {
	Deck deck = new Deck();

	@Test
	void testConstructor() {
		assertThrows(NullPointerException.class, () -> {new Deck(null);});
		
		Image[] cardImgs = new Image[53];
		Deck deck2 = new Deck(cardImgs );
		assertEquals(53, deck2.getMainDeck().size());
	}
	
	@Test
	void testTakeCard() {
		ArrayList<Card> mainDeck = new ArrayList<Card>();
		Card card = new Card(null, 1, 2, 3);
		mainDeck.add(card);
		deck.setMainDeck(mainDeck);
		
		Card takenCard = deck.takeCard();
		assertEquals(card,takenCard);
		assertEquals(1,takenCard.getValue());
		assertEquals(2,takenCard.getColor());
		assertEquals(3,takenCard.getSuit());
		assertSame(card,takenCard);
	}
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
