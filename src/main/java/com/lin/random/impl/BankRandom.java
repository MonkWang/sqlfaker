package com.lin.random.impl;

import com.lin.random.RandomData;
import com.lin.utils.RandomUtils;

public class BankRandom implements RandomData<String> {

    @Override
    public String next() {
        return RandomUtils.selectOneInArray(bank);
    }

    private static final String[] bank = {
            "渤海银行",
            "广发银行",
            "国家开发银行",
            "恒丰银行",
            "华夏银行",
            "交通银行",
            "平安银行",
            "上海浦东发展银行",
            "兴业银行",
            "招商银行",
            "浙商银行",
            "中国工商银行",
            "中国光大银行",
            "中国建设银行",
            "中国民生银行",
            "中国农业银行",
            "中国银行",
            "中国邮政储蓄银行",
            "中信银行",
    };
}
