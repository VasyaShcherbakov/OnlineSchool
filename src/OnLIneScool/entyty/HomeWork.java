package OnLIneScool.entyty;

import java.util.Objects;

public class HomeWork {
    private Integer id;
    private Integer lectureId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomeWork homeWork = (HomeWork) o;
        return Objects.equals(id, homeWork.id) && Objects.equals(lectureId, homeWork.lectureId) && Objects.equals(task, homeWork.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lectureId, task);
    }

    public HomeWork(Integer lectureId, String task) {
        this.lectureId = lectureId;
        this.task = task;
    }
}
