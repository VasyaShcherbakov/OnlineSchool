package onLIneScool.config;

import onLIneScool.entity.Tree;
import onLIneScool.service.TreeService;

import javax.annotation.PostConstruct;
import java.util.Random;



public class DbInit {
    private final TreeService treeService;

    private Random random = new Random();

    public DbInit(final TreeService treeService) {
        this.treeService = treeService;
    }

    @PostConstruct
    private void postConstruct() {
        for (int i = 0; i < 10; i++) {
            final Tree tree = new Tree();
            tree.setAge(random.nextLong());
            tree.setName("Tree " + random.nextInt());
            tree.setIsGreen(random.nextBoolean());
            treeService.saveTree(tree);
        }

    }
}
