package com.itheima.shopping;

public class Customer {
    //成员变量
    /**
     * 姓名
     */
    private String name;
    /**
     * 电话号码
     */
    private String phoneNum;
    /**
     * 钱
     */
    private float money;
    /**
     * 是否购买
     */
    private boolean isBuy;
    /**
     * 商品编号
     */
    private int goodsId;

    //构造方法
    public Customer() {

    }

    public Customer(String name, String phoneNum, float money, boolean isBuy, int goodsId) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.money = money;
        this.isBuy = isBuy;
        this.goodsId = goodsId;
    }
//成员方法

    /**
     * 说出商品编号
     * @return   商品编号
     */
    public int speakGoodsId() {
        return goodsId;
    }

    /**
     * 下定决心
     * @param price
     */
    public void Decision(float price) {
        if (price > money) {
            isBuy = false;
        } else {
            isBuy = true;
        }
    }

    /**
     * 说出姓名
     * @return  姓名
     */
    public String speakName() {
        if (isBuy == true) {
            return name;
        } else {
            return "小白";
        }
    }

    /**
     * 说出电话号码
     * @return  电话号码
     */
    public String speakPhoneNum() {
        if (isBuy == true) {
            return phoneNum;
        } else {
            return "13456876598";
        }
    }


}
