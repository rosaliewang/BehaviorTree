package main;

/**
 * Created by Yuchen Wang on 8/12/15.
 */
public class BehaviorTree extends Task {
    private Task root;
    private String goal;

    public BehaviorTree() {
        this(null, "");
    }

    public BehaviorTree(Task root) {
        this(root, "");
    }

    public BehaviorTree(Task root, String goal) {
        this.root = root;
        this.goal = goal;
    }

    public void setRoot(Task root) {
        this.root = root;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    @Override
    public boolean run() {
        return root.run();
    }

    public Task getRoot() {
        return root;
    }

    public String getGoal() {
        return goal;
    }
}
