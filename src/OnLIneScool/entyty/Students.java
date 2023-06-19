package OnLIneScool.entyty;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;

public class Students implements Serializable {
    private Integer id;
    private String emal;

    public Students(Integer id, String emal) {
        this.id = id;
        this.emal = emal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmal() {
        return emal;
    }

    public void setEmal(String emal) {
        this.emal = emal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(id, students.id) && Objects.equals(emal, students.emal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, emal);
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", emal='" + emal + '\'' +
                '}';
    }
}
