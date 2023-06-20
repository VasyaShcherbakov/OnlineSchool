package OnLIneScool.entyty;

import java.util.Date;
import java.util.Objects;

public class Lectures {
   private int id;
   private String teacher;

    public Lectures(int id, String teacher) {
        this.id = id;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Lectures{" +
                "id=" + id +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lectures lectures = (Lectures) o;
        return id == lectures.id && Objects.equals(teacher, lectures.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teacher);
    }
}
