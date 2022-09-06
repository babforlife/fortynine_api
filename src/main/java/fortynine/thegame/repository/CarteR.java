package fortynine.thegame.repository;

import fortynine.thegame.models.Carte;
import fortynine.thegame.models.Partie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteR extends JpaRepository<Carte, Long> {

}
