package OnLIneScool.service;

import OnLIneScool.entyty.Flower;
import OnLIneScool.repo.FlowerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class FlowerService {
    @Autowired
    private FlowerRepo flowerRepo;

    public void addUser() {
        final Flower flower = new Flower();
        flower.setName("Jon");
        flower.setType("Bio");
        flower.setEmail("Bio@gmail.com");

        flowerRepo.saveAndFlush(flower);
    }

    public void save(Flower flower) {
        flowerRepo.saveAndFlush(flower);
    }


    public List<Flower> findAll() {
        return flowerRepo.findAll();
    }

}
