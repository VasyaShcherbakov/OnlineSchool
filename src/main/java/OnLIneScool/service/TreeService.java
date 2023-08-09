package OnLIneScool.service;
@Service
public class TreeService {
    private TreeRepo treeRepo;

    @Autowired
    public TreeService(TreeRepo treeRepo) {
        this.treeRepo = treeRepo;
    }

    public void saveTree(final Tree tree) {
        treeRepo.save(tree);
    }

    public List<Tree> getTrees() {
        return treeRepo.findAll();
    }

    public Optional<Tree> getTreeById(final long id) {
        return treeRepo.findById(id);
    }

    public void deleteTree(final Tree tree) {
        treeRepo.delete(tree);
    }

}
