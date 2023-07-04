package OnLIneScool.entyty;
import lombok.Data;
public class Laptop {
    private Integer id;

    private String name;

    private Boolean isAvailable;

    private String description;

    public Laptop() {
    }

    public Laptop(Integer id, String name, Boolean isAvailable, String description) {
        this.id = id;
        this.name = name;
        this.isAvailable = isAvailable;
        this.description = description;
    }

}
