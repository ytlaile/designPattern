package test;

public class Singleton implements Cloneable{
    private Singleton() {}

    private static class Holder {   //由静态内部类持有单例对象，但是根据类加载特性，我们仅使用Singleton类时，不会对静态内部类进行初始化
        private final static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){   //只有真正使用内部类时，才会进行类初始化
        return Holder.INSTANCE;   //直接获取内部类中的
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
    }
    
}
