package redmonkey.edu.blackjack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import redmonkey.edu.blackjack.data.Deck;
import redmonkey.edu.blackjack.model.Card;

import javax.annotation.PostConstruct;
import java.util.Deque;
import java.util.LinkedList;

@Service
public class CardService {
@Autowired
    Deck deck;
Deque deque;
@PostConstruct
        void init(){
    deque = new LinkedList(deck.getDeck());
}
Card empty = new Card(null ,null, 0 , "/image/back.png");
public Card getFirstCard(){
   return deck.getDeck().get(0);
}

    public Card emptyCard() {
    return empty;
    }

    public Card getNextCard() {
 return (Card) deque.poll();
}
}
