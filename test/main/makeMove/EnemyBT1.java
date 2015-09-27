package main.makeMove;

import main.BehaviorTree;
import main.Task;
import main.composites.Sequence;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yuchen Wang on 8/12/15.
 */
public class EnemyBT1 extends BehaviorTree {
    private static EnemyBT1 instance = null;
    public static final String TAG = "EnemyBT1";
    private Task root;

    protected EnemyBT1() {
        super();
        List<Task> c = new ArrayList<Task>();
        c.add(new IsPlayerNear());
        c.add(new MoveRight());
        setRoot(new Sequence(c));
    }

    public static EnemyBT1 getInstance() {
        if (instance == null) instance = new EnemyBT1();
        return instance;
    }

    @Override
    public String toString() {
        return TAG;
    }
}
