package com.ywc;

import org.springframework.stereotype.Component;

/**
 * @author yanwe
 * createTime 2017-12-2017/12/19 14:53
 */
@Component
public class TestServiceErrorImpl implements TestService {
    @Override
    public String sayHiFromClientOne(String name) {
        return name+",Sorry,服务器错误！";
    }
}
