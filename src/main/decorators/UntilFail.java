package main.decorators;

import main.Decorator;
import main.Task;

/**
 * Repeats the child until it fails
 *
 * Created by Yuchen Wang on 8/12/15.
 */
public class UntilFail extends Decorator {
    public static final String TAG = "UntilFail";

    private UntilFail() {}

    public UntilFail(Task child) {
        super(child);
    }

    @Override
    public boolean run() {
        while (child.run()) {}
        return true;
    }

    @Override
    public String toString() {
        return TAG;
    }
}
