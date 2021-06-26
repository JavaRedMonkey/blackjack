package redmonkey.edu.blackjack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redmonkey.edu.blackjack.data.Deck;
import redmonkey.edu.blackjack.model.Card;

@Service
public class CardService {
@Autowired
    Deck deck;
public Card getFirstCard(){
   return deck.getDeck().get(4);
}
}
