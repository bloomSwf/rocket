
package com.rocket.rocket.entity.rocketMq;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 红包分配规则
 *
 * @author houzh
 *
 */
public class RedPacketUtils {
    //需要设置的参数
    private static  double MIN_MONEY = 0.1; //用户获得的最小金额
    private static  double MAX_MONEY = 10; //用户获得的最大金额（可能存在误差。主要用于计算倍数，值为0则使用默认倍数）
    private static  double TOTAL_MONEY=100;//总金额
    private static  int TOTAL_COUNT = 50;//总份数
    private static  boolean IS_UPSET = true;//结果是否需要打乱
    private static double times = 2;//倍数（用户获得的最大金额=当前平均值*倍数，当前平均值=剩余金额/剩余份数）（若最大金额不为0则会被重新赋值）

    private static double leftMoney = TOTAL_MONEY; //剩余金额
    private static int leftCount = TOTAL_COUNT;//剩余份数

    private static int runCount = 0;//运行次数
    private static int minCount = 0;//算法中获得的最小金额的个数
    private static double maxValue, minValue; //算法中获得的最大值和最小值

    public static List<BigDecimal> splitRedPackets(RedPacket redPacket){
        TOTAL_MONEY= redPacket.getAmount().doubleValue();
        MAX_MONEY =redPacket.getAmount().doubleValue()-1;
        TOTAL_COUNT=redPacket.getNum();
        leftCount = TOTAL_COUNT;
        if(!isRight(TOTAL_MONEY, TOTAL_COUNT)) { //如果设置金额和份数不合法则报错
            JOptionPane.showMessageDialog(null, "平均值为小于最小金额", "出错啦", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        List<BigDecimal> list = new ArrayList<>(); //用于存储金额列表
        double total = 0;//用于存储金额列表的总值
        int size = TOTAL_COUNT;
        for(int i = 0; i < size; size--) {
            double money = getRandomMoney();
            if(size<12){
                System.out.println(1);
            }
            BigDecimal temp = BigDecimal.valueOf(money);
            list.add(temp);
            total += money;

            if(Double.doubleToLongBits(money) == Double.doubleToLongBits(MIN_MONEY)){
                minCount ++;}
        }

        return list;


    }

    /**
     * 随机算法
     * @return 随机金额
     */
    public static double getRandomMoney() {
        runCount ++;
        if (leftCount == 1) {
            return (double) Math.round(leftMoney * 100) /100;
        }
        Random r = new Random();
        double max = leftMoney / leftCount * times;
        double money = r.nextDouble() * max;
        money = money <= MIN_MONEY ? MIN_MONEY : money;
        money = Math.floor(money * 100) / 100;
        if(isRight(leftMoney - money, leftCount - 1)) {
            leftMoney -= money;
            leftCount--;
            return money;
        } else {//如果不合法则递归调用随机算法，直到合法
            return getRandomMoney();
        }
    }

    /**
     * 判断金额和份数是否合法，平均值小于最小金额则视为不合法
     * @param money 金额
     * @param count 份数
     * @return 合法性
     */
    private static boolean isRight(double money, int count) {
        return money / count >= MIN_MONEY;
    }

    /**
     * 设置倍数（仅当设置了最大金额才有效，否则为默认倍数）
     * @return 倍数
     */
    private static double setTimes() {
        if(MAX_MONEY != 0) {
            times = MAX_MONEY / (TOTAL_MONEY / TOTAL_COUNT);
        }
        return times;
    }
    public static void main(String[] args) {
        RedPacket redPacket= new RedPacket();
        redPacket.setAmount(BigDecimal.valueOf(50));
        redPacket.setNum(100);
       List<BigDecimal> a= splitRedPackets(redPacket);
       System.out.println(a.size());
    }
}


