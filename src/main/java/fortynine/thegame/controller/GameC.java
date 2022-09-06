package fortynine.thegame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fortynine.thegame.models.Game;
import fortynine.thegame.repository.GameR;

@Controller
@RequestMapping(value = "/game")
public class GameC {

    @Autowired
    private GameR repository;

    @GetMapping("/{id}")
    public ResponseEntity<GameC> getById(@PathVariable long id) {
        Game game = repository.findById(id).orElse(null);
        return null;
    }
}
