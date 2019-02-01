//
//package com.rocket.rocket.entity.rocketMq;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 红包分配规则
// *
// * @author houzh
// *
// */
//public class RedPacketUtils {
//    // 最小红包额度
//    private static final double MINMONEY = 0.01;
//    // 最大红包额度
//    private static final double MAXMONEY = 1000;
//    // 每个红包最大是平均值的倍数
//    private static final double TIMES = 2.1;
//
//    /**
//     * @param money
//     * @param count
//     * @return
//     * @Author:houzhenghai
//     * @Description: 拆分红包（随机）
//     */
//    public static List<BigDecimal> splitRedPackets(BigDecimal money, int count) {
//
//        if (!isRight(money, count)) {
//            return null;
//        }
//        List<BigDecimal> list = new ArrayList<BigDecimal>();
//        // 红包最大金额为平均金额的TIMES倍
//        BigDecimal max =money.multiply(BigDecimal.valueOf(TIMES).divide(BigDecimal.valueOf(count)));
//        max = max > MAXMONEY ? MAXMONEY : max;
//        for (int i = 0; i < count; i++) {
//            int one = random(money, MINMONEY, max, count - i);
//            list.add(one);
//            money -= one;
//        }
//        return list;
//    }
//
//
//    /**
//     * @param money
//     * @param minS
//     * @param maxS
//     * @param count
//     * @return
//     * @Author:houzhenghai
//     * @Description: 随机红包额度
//     */
//    private static BigDecimal random(BigDecimal money, BigDecimal minS, BigDecimal maxS, int count) {
//        // 红包数量为1，直接返回金额
//        if (count == 1) {
//            return money;
//        }
//        // 如果最大金额和最小金额相等，直接返回金额
//        if (minS .compareTo(maxS)==1 ) {
//            return minS;
//        }
//        BigDecimal max = maxS.compareTo(money)<1 ? money : maxS;
//        // 随机产生一个红包
//        BigDecimal one = ((int) Math.rint(Math.random() * (max - minS) + minS)) % max + 1;
//        int money1 = money - one;
//        // 判断该种分配方案是否正确
//        if (isRight(money1, count - 1)) {
//            return one;
//        } else {
//            double avg = money1 / (count - 1);
//            if (avg < MINMONEY) {
//                // 递归调用，修改红包最大金额
//                return random(money, minS, one, count);
//            } else if (avg > MAXMONEY) {
//                // 递归调用，修改红包最小金额
//                return random(money, one, maxS, count);
//            }
//        }
//        return one;
//    }
//
//    /**
//     * @param money
//     * @param count
//     * @return
//     * @Author:houzhenghai
//     * @Description: 此种红包是否合法
//     */
//    private static boolean isRight(BigDecimal money, int count) {
//        BigDecimal avg = money.divide(BigDecimal.valueOf(count)) ;
//        if (avg.compareTo(BigDecimal.valueOf(MINMONEY))<1  ) {
//            return false;
//        }
//        if (avg.compareTo(BigDecimal.valueOf(MAXMONEY))>1 ) {
//            return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//       }
//}
//
//
