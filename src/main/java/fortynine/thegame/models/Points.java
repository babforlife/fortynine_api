package fortynine.thegame.models;

import javax.persistence.*;

@Entity
@Table(name = "points")
public class Points {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@ManyToOne
	@JoinColumn(name="id_partie_joueur")
    private PartieJoueur partieJoueur;

	private Integer point;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public PartieJoueur getPartieJoueur() {
		return partieJoueur;
	}

	public void setPartieJoueur(PartieJoueur partieJoueur) {
		this.partieJoueur = partieJoueur;
	}
}
