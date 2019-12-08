package singleton.lazy;

public class LazyInnerClassSingleton {
    private static LazyInnerClassSingleton lazySingleton = null;
    private LazyInnerClassSingleton() {
        if(LazyHolder.lazySingleton != null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {

        return LazyHolder.lazySingleton;
    }
    private static class LazyHolder{
        private static final LazyInnerClassSingleton lazySingleton = new LazyInnerClassSingleton();
    }
}
