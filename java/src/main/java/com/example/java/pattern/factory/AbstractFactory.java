package com.example.java.pattern.factory;

/**
 * 当数量越来越多的时候就要用   抽象工厂 了

    当有多个产品等级的时候，可以使用一个抽象工厂就可以实现了

    产品簇：
        产品簇中的产品有内在的联系

    缺点：
        1. 当产品等级发生变化时（增加产品等级，删除产品等级），都要引起所有以前工厂代码的修改
        违反了"开闭原则"

 *
 */
public class AbstractFactory {


    interface Drink {
        void drink();
    }

    interface Food {
        void eat();
    }

    class Cola implements Drink {
        @Override
        public void drink() {}
    }

    class IceNoodle implements Food {
        @Override
        public void eat() {}
    }

    interface Factory {
        Drink geDrink();
        Food geFood();
    }

    class KFCFactory implements Factory {
        @Override
        public Drink geDrink() {
            return new Cola();
        }

        @Override
        public Food geFood() {
            return new IceNoodle();
        }
    }


    public static class Business {
        public static void createScrew(Factory factory) {
            Drink drink = factory.geDrink();
            Food food = factory.geFood();
        }
    }


}
