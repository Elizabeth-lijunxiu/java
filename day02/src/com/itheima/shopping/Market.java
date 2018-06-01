package com.itheima.shopping;

import java.sql.SQLOutput;

public class Market {
    public static void main(String[] args) {
        //创建一个顾客对象
        Customer cs = new Customer("李磊","13128766908",
                34.5f,true,3);
        //创建一个卖家对象
        Seller s = new Seller();
        //顾客说出商品编号
        int id = cs.speakGoodsId();
        System.out.println("顾客想买的商品编号是:"+id);
        //卖家根据顾客说出的商品编号 报价
        float price = s.speakPrice(id);
        System.out.println("卖家报出的商品价格是:"+price);
        //顾客根据价格做决定
        cs.Decision(price);
        System.out.println("顾客做好决定");
        //卖家要求顾客填写信息
        s.message();
        //顾客填写姓名和电话号码
        String name = cs.speakName();
        String phoneNum = cs.speakPhoneNum();
        System.out.println("顾客给的名字是:"+name);
        System.out.println("顾客给的号码是:"+phoneNum);

    }


}
