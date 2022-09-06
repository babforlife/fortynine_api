package fortynine.thegame.controller;

import fortynine.thegame.models.Card;
import fortynine.thegame.repository.CardR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/carte")
public class CardC {

    @Autowired
    private CardR repository;

    @GetMapping("/{id}")
    public ResponseEntity<Card> getById(@PathVariable long id) {
        Card card = repository.findById(id).orElse(null);
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Card>> getAll() {
        List<Card> cards = repository.findAll();
        return null;
    }

}
