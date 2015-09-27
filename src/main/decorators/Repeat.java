package main.decorators;

import main.Decorator;
import main.Task;

/**
 * Repeats the child node N times
 *
 * Created by Yuchen Wang on 8/12/15.
 */
public class Repeat extends Decorator {
    public static final String TAG = "Repeat";

    protected int count;

    private Repeat() {}

    public Repeat(Task child) {
        super(child);
        count = 1;
    }

    public Repeat(Task child, int num) {
        super(child);
        count = num > 0 ? num : 1;
    }

    @Override
    public boolean run() {
        for (int i = 0; i < count; i++) {
            child.run();
        }
        return true;
    }

    @Override
    public String toString() {
        return TAG;
    }
}
