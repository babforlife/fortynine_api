package fortynine.thegame.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "partie_joueur")
public class PartieJoueur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_partie")
    private Partie partie;

    @ManyToOne
    @JoinColumn(name="id_joueur")
    private Joueur joueur;

    @OneToMany(mappedBy = "partieJoueur")
    private List<Points> points;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Partie getPartie() {
        return partie;
    }

    public void setPartie(Partie partie) {
        this.partie = partie;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public List<Points> getPoints() {
        return points;
    }

    public void setPoints(List<Points> points) {
        this.points = points;
    }
}
