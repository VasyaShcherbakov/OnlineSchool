package main.java.OnLIneScool.entyty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class AdditiveMaterials {
    @Autowired
    @Scope("AdditiveMaterials")
    @Bean
    public UserRepository userRepository(){
        return new UserRepository();
    }

    private int id;
    private String name;
    private int lectureId;
    public ResourceTye resourceType;


    public enum ResourceTye {
        URL,
        VIDEO,
        BOOK
    }

    public AdditiveMaterials(int id, String name, int lectureId, ResourceTye resourceType) {
        this.id = id;
        this.name = name;
        this.lectureId = lectureId;
        this.resourceType = resourceType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public ResourceTye getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTye resourceType) {
        this.resourceType = resourceType;
    }

    @Override
    public String toString() {
        return "AdditiveMaterials{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lectureId=" + lectureId +
                ", resourceType=" + resourceType +
                '}';
    }
}
