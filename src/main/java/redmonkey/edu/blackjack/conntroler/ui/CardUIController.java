package redmonkey.edu.blackjack.conntroler.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import redmonkey.edu.blackjack.model.Card;
import redmonkey.edu.blackjack.service.CardService;

@Controller
@RequestMapping("/ui/card")
public class CardUIController {
    @Autowired
    CardService service;
    @RequestMapping("/first")
    public String getFirstCard(Model model){
        Card firstcard = service.getFirstCard();
        model.addAttribute("firstcard", firstcard);
    return "gametable";
    }
}
