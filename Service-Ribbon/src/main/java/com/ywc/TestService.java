package com.ywc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author yanwe
 * createTime 2017-12-2017/12/19 9:52
 */
@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://YANWEICHEN/hi?name="+name,String.class);
    }
}
