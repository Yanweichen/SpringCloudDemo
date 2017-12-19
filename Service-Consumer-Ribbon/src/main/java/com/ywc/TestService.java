package com.ywc;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://YANWEICHEN/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return name + "Sorry,服务器错误！";
    }
}
