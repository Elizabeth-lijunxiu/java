package com.itheima.shopping;

public class Seller {
    /**
     * 商品
     */
    String[] goods = {"铅笔","钢笔","毛笔","圆珠笔"};
    /**
     * 商品价格
     */
    float[] prices = {1.5f,36.9f,69.9f,3.9f};

    /**
     * 报价
     * @param goodsId
     * @return
     */
    public float speakPrice(int goodsId){
        if(goodsId<0||goodsId>goods.length){
            System.out.println("没有这商品");
            return 100120.9f;
        }else{
            return prices[goodsId];
    }
    }

    /**
     * 要求填写电话号码和姓名
     */
    public void message(){
        System.out.println("请填写电话号码和姓名:");
    }
}
