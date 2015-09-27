package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Yuchen Wang on 8/12/15.
 */
public class Blackboard<K, V> {
    public static final String TAG = "Blackboard";

    protected Map<K, V> store;

    public Blackboard() {
        store = new HashMap<K, V>();
    }

    public void put(K key, V value) {
        store.put(key, value);
    }

    public V get(String key) {
        if (store.containsKey(key))
            return store.get(key);
        else return null;
    }

    public Set<K> getKeySet() {
        return store.keySet();
    }

    @Override
    public String toString() {
        return TAG;
    }
}
