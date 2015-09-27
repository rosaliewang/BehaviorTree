package main.composites;

import main.Composite;
import main.Task;

import java.util.List;

/**
 * {@code main.main.composites.Selector}
 * executes all its children in sequence until one succeeds, then return success. If
 * all of them fail, return failure.
 *
 * Created by Yuchen Wang on 8/12/15.
 */
public class Selector extends Composite {
    public static final String TAG = "Selector";

    public Selector() {
        super();
    }

    public Selector(List<Task> children) {
        super(children);
    }

    @Override
    public boolean run() {
        for (int i = 0; i < children.size() - 1; i++) {
            if (children.get(i).run())
                return true;
        }
        return false;
    }

    public int getChildrenCount() {
        return super.getChildrenCount();
    }
}
