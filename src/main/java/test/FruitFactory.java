package test;

import java.util.function.Supplier;

public abstract class FruitFactory<T extends Fruit> {   //将水果工厂抽象为抽象类，添加泛型T由子类指定水果类型
    public abstract T getFruit();  //不同的水果工厂，通过此方法生产不同的水果
}

class AppleFactory extends FruitFactory<Apple> {  //苹果工厂，直接返回Apple，一步到位
    @Override
    public Apple getFruit() {
        return new Apple();
    }
}
class TEST {
    public static void main(String[] args) {
        test(() -> new AppleFactory().getFruit());   //比如我们现在要吃一个苹果，那么就直接通过苹果工厂来获取苹果
    }

    //此方法模拟吃掉一个水果
    private static void test(Supplier<Fruit> supplier){
        System.out.println(supplier.get()+" 被吃掉了，真好吃。");
    }
}
