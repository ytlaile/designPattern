package test;

public class Fruit {
    private final String name;

    public Fruit(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name+"@"+hashCode();   //打印一下当前水果名称，还有对象的hashCode
    }
}

class Apple extends Fruit{   //苹果，继承自水果

    public Apple() {
        super("苹果");
    }
}

class Orange extends Fruit{  //橘子，也是继承自水果
    public Orange() {
        super("橘子");
    }
}

class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple);
    }
}
