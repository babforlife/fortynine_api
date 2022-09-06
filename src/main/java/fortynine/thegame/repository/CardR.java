package fortynine.thegame.repository;

import fortynine.thegame.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardR extends JpaRepository<Card, Long> {

}
