package main.java.OnLIneScool.entyty;
@Entity
@Getter
@Setter
@ToString
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "parent",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @ToString.Exclude
    private List<Child> children = new ArrayList<>();

    public Parent() {
    }
}
