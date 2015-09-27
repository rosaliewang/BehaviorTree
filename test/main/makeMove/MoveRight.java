package main.makeMove;

import main.*;

/**
 * Created by Yuchen Wang on 8/12/15.
 */
public class MoveRight extends Task {
    public static final String TAG = "MoveRight";

    @Override
    public boolean run() {
        System.out.println("Move Right.");
        return true;
    }

    @Override
    public String toString() {
        return TAG;
    }
}
