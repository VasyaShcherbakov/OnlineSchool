package OnLIneScool.service;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class FlowerService {

    private FlowerRepo flowerRepo;
    @Autowired

    public FlowerService(FlowerRepo flowerRepo) {
        this.flowerRepo = flowerRepo;
    }





    public void addFliwer() {
        final FlowerService flowerService = new FlowerService()
        student.setName("Jon");
        student.setType("Bio");
        student.setEmail("Bio@gmail.com");

        studentRepo.saveAndFlush(student);
    }

    public void save(Student student) {
        studentRepo.saveAndFlush(student);
    }


    public List<Student> findAll() {
        return studentRepo.findAll();
    }

}
