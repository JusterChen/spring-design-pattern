package com.strategy.patterns.travel;


import com.strategy.patterns.TravelResult;

/**
 * @Author: JiangChen
 * @Description:出行方式汽车
 * @Date 2018/4/20 14:55
 */
public class Car implements Trip{

    @Override
    public TravelResult play(int hour) {
        System.out.println("选择出去自驾游的方式");
        return new TravelResult(hour,"安全");
    }
}
