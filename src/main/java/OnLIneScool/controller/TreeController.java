package OnLIneScool.controller;

public class TreeController {
    private TreeService treeService;

    @Autowired
    public TreeController(TreeService treeService) {
        this.treeService = treeService;
    }

    @GetMapping()
    public String getHome(Model model) {
        final List<Tree> trees = treeService.getTrees();
        model.addAttribute("trees", trees);
        return "index";
    }

    @GetMapping("/trees")
    public String getBooks(Model model) {
        final List<Tree> trees = treeService.getTrees();
        model.addAttribute("trees", trees);
        return "index";
    }

    @GetMapping("/trees/{id}")
    public String getBooks(Model model, @PathVariable Long id) {
        final Optional<Tree> treeById = treeService.getTreeById(id);
        final Tree tree = treeById.orElse(null);
        model.addAttribute("tree", tree);
        model.addAttribute("id", id);
        return "tree";
    }

    @GetMapping("/tree")
    public String formForTree(Model model) {
        return "treeserv";
    }

    @PostMapping("/add")
    public String addBook(@Valid Tree tree) {
        tree.setIsGreen(true);
        treeService.saveTree(tree);
        return "redirect:/";
    }

    @PostMapping("/edit/{id}")
    public String postEditTree(@PathVariable Long id,
                               Model model,
                               Tree tree) {
        final Optional<Tree> treeById = treeService.getTreeById(id);

        if (treeById.isEmpty()) {
            throw new IllegalStateException();
        }

        final Tree tree1 = treeById.get();
        tree1.setAge(tree.getAge());
        tree1.setName(tree.getName());

        treeService.saveTree(tree1);

        return "redirect:/";
    }

    @GetMapping("/trees/delete/{id}")
    public String deleteTree(Model model, @PathVariable Long id) {
        final Optional<Tree> treeById = treeService.getTreeById(id);
        final Tree tree = treeById.orElse(null);
        treeService.deleteTree(tree);
        return "redirect:/";
    }
}
