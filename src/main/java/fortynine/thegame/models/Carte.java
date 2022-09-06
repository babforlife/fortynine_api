package fortynine.thegame.models;

//@Entity
//@Table(name = "carte")
public class Carte {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
	private String description;
    private Integer points;
    private String image;
    private Boolean active;
}
