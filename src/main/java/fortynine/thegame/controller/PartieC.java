package fortynine.thegame.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import fortynine.thegame.models.Partie;
import fortynine.thegame.repository.PartieR;

@Controller
@RequestMapping(value = "/partie")
public class PartieC {
	
	@Autowired
	private PartieR repository;
	
    @GetMapping("/{id}")
    public ResponseEntity<PartieC> getById(@PathVariable long id) {
        Partie partie = repository.findById(id).orElse(null);
        return null;
    }
}
