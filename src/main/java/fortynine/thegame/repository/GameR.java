package fortynine.thegame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fortynine.thegame.models.Game;

public interface GameR extends JpaRepository<Game, Long> {

}
