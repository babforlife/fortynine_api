package fortynine.thegame.controller;

import fortynine.thegame.models.Carte;
import fortynine.thegame.repository.CarteR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/carte")
public class CarteC {

    @Autowired
    private CarteR repository;

    @GetMapping("/{id}")
    public ResponseEntity<Carte> getById(@PathVariable long id) {
        Carte carte = repository.findById(id).orElse(null);
        return null;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Carte>> getAll() {
        List<Carte> cartes = repository.findAll();
        return null;
    }

}
