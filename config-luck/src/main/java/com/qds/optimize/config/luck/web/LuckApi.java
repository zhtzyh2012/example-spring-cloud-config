package com.qds.optimize.config.luck.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用对外的服务
 *
 * @author neutron
 */
@RestController
public class LuckApi {

    @Value("${hello.name}")
    private String luck;

    @RequestMapping(value = "/luck")
    public String luck() {
        return luck;
    }
}
