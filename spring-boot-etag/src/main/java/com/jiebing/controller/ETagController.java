package com.jiebing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ETagController
 * @Description: ETag测试控制层
 * @author libb
 * @date 2019年2月14日
 */
@RestController
public class ETagController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello etag Header 1";
    }
}
