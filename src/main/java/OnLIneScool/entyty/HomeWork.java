package main.java.OnLIneScool.entyty;
@Entity
public class HomeWork {



    private Integer id;
    private int lectureId;
    private String task;

    public HomeWork(int id, int lectureId, String task) {
        this.id = id;
        this.lectureId = lectureId;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "HomeWork{" +
                "id=" + id +
                ", lectureId=" + lectureId +
                ", task='" + task + '\'' +
                '}';
    }
}
