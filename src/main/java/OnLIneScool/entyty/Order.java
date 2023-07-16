package main.java.OnLIneScool.entyty;
import lombok.Data;

@Entity
@Data
@Table(name = "pizza")
import javax.persistence.*;

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String description;

    @Embedded
    private ContactPerson contactPerson;

    public Order() {
    }
}
