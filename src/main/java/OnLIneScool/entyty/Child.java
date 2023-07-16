package main.java.OnLIneScool.entyty;
@Entity
@Getter
@Setter
@ToString
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    @ToString.Exclude
    private Parent parent;

    public Child() {
    }
}
