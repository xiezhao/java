package com.example.java.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Date;

/**
 * 原型模式，也就是java里的clone。
 * 原本java里是浅拷贝，只克隆简单对象，其他对象是clone了内存地址，这样一改全改了
 */
public class PrototypeTest implements Cloneable, Serializable {

    private String name;
    private Date date;

    public PrototypeTest(){};

    public void setName(String name){
        this.name = name;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public Date getDate(){
        return date;
    }

    public String toString(){
        return this.name + " -  " + this.date;
    }

    @Override
   public Object clone() throws CloneNotSupportedException {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(this);
            oos.close();

            //从内存中取出数据
            byte[] byteArray = out.toByteArray();

            ByteArrayInputStream in = new ByteArrayInputStream(byteArray);
            ObjectInputStream ois = new ObjectInputStream(in);
            Object clone = ois.readObject();
            ois.close();

            return clone;

        } catch (Exception e) {
            throw new RuntimeException();
        }
   }


   public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeTest prototypeTest = new PrototypeTest();
        prototypeTest.setDate(new Date(2022, 12, 12));
        prototypeTest.setName("zhangsan");


        PrototypeTest clone = (PrototypeTest)prototypeTest.clone();
        clone.getDate().setTime(0);

        System.out.println(prototypeTest);
        System.out.println(clone);

        /*
            zhangsan -  3923-01-12
            zhangsan -  1970-01-01
         */

   }




}
