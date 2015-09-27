package main.composites;

import main.Composite;
import main.Task;

import java.util.List;

/**
 * {@code main.main.composites.Sequence}
 * executes all its children in sequence, if any fail, return failure, if all succeed,
 * return success
 *
 * Created by Yuchen Wang on 8/12/15.
 */
public class Sequence extends Composite {
    public static final String TAG = "Sequence";

    public Sequence() {
        super();
    }

    public Sequence(List<Task> children) {
        super(children);
    }

    @Override
    public boolean run() {
        for (int i = 0; i < children.size() - 1; i++) {
            if (!children.get(i).run())
                return false;
        }
        Task task = children.get(children.size() - 1);
        return children.get(children.size() - 1).run();
//        return true;
    }

    public int getChildrenCount() {
        return super.getChildrenCount();
    }

    @Override
    public String toString() {
        return "Sequence";
    }
}
