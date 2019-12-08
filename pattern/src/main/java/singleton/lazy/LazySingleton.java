package singleton.lazy;

import singleton.hungry.HungrySingleton;

public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
