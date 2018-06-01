package com.itheima.test1;

import com.itheima.test.Phone;

import java.util.ArrayList;

public class PhoneTest extends Phone{
    public static void main(String[] args) {
        Phone p1 =  new Phone("苹果","ios","苹果公司");
        Phone p2 =  new Phone("小米","Android","小米公司");
        Phone p3 =  new Phone("华为","Android","华为公司");
        ArrayList<Phone> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).getSystem();
            if("Android".equals(s)){
                System.out.println(list.get(i).getBrand()+"-"+s+"-"+list.get(i).getManufacturer());
            }
        }

    }
}
