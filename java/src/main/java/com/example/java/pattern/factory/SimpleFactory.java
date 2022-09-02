package com.example.java.pattern.factory;

/**
    制作一个抽象产品：螺丝
    制作2个具体产品：8mm螺丝 和 6mm螺丝
    使用简单工厂来实现这个场景，并且让客户端通过简单工厂来获取具体产品

    然后扩展一个7mm螺丝，你会发现这要修改简单工厂的代码，进而就违反了开闭原则

     所以再使用工厂方法来重构一遍代码，保证7mm螺丝可以被顺利的扩展进来

 */
public class SimpleFactory {



    interface Screw {
        Integer getLength();
    }

    static class Screw8 implements Screw {
        @Override
        public Integer getLength() {
            return 8;
        }
    }

    static class Screw6 implements Screw {
        @Override
        public Integer getLength() {
            return 6;
        }
    }

    /*
        简单工厂
     */
    static class ScrewFactory1 {
        public static Screw getScrew(Integer length){
            Screw screw = null;
            switch (length) {
                case 8:
                    screw =  new Screw8();
                    break;
                case 6:
                    screw =  new Screw6();
                    break;
            }
            return screw;
        }
    }


    public static class Business {
        public static void createScrew(Screw screw) {
            System.out.println("生产螺丝：长度为：" + screw.getLength());
        }
    }


    /* --------------- */


    /*
        工厂方法
     */
    interface ScrewFactory {
        Screw getScrew();
    }

    static class Screw6Factory implements ScrewFactory {
        @Override
        public Screw getScrew() {
            return new Screw6();
        }
    }

    static class Screw8Factory implements ScrewFactory {
        @Override
        public Screw getScrew() {
            return new Screw8();
        }
    }

    static class Screw7 implements Screw {
        @Override
        public Integer getLength() {
            return 7;
        }
    }

    static class Screw7Factory implements ScrewFactory {
        @Override
        public Screw getScrew() {
            return new Screw7();
        }
    }

    static class Business2 {
        static void createScrew(ScrewFactory screwFactory) {
            System.out.println("生产螺丝：长度为：" + screwFactory.getScrew().getLength());
        }
    }


    public static void main(String[] args) {
        Screw screw8 = ScrewFactory1.getScrew(8);
        Business.createScrew(screw8);
        //现在想生产7mm螺丝。因为Screw从ScrewFactory1中来，factory中没有对应7mm螺丝的编号，此时就没有办法扩展了


        //使用了工厂方法后
        //现在想生产7号的螺丝
        //此时，客户端就可以扩展了
        ScrewFactory screwFactory = new Screw7Factory();
        Business2.createScrew(screwFactory);

    }





}
