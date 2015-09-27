package main.makeMove;

import main.Task;

/**
 * Created by Yuchen Wang on 8/12/15.
 */
public class IsPlayerNear extends Task {
    public static final String TAG = "IsPlayerNear";

    @Override
    public boolean run() {
        System.out.println("Is player near?");
        return (int)(Math.random()*10) < 5;
    }

    @Override
    public String toString() {
        return TAG;
    }
}
