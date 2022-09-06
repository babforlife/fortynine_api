package fortynine.thegame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fortynine.thegame.models.Partie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface PartieR extends JpaRepository<Partie, Long> {

}
