package com.lin.random.impl;

import com.lin.random.RandomData;
import com.lin.utils.RandomUtils;

public class DomainRandom implements RandomData<String> {
    @Override
    public String next() {
        return RandomUtils.selectOneInArray(domain);
    }

    private static final String[] domain = {
            "gmail.com", "yahoo.com", "hotmail.com", "126.com", "163.com", "qq.com", "sohu.com", "sina.com"
    };

}
