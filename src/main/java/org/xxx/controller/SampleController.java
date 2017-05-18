package org.xxx.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Prject: authentication-center
 * @Package: org.xxx.controller
 * @Description: TODO
 * @author: wuyujia
 * @Date: 2017/5/18 15:48
 * @version: V1.0
 */
@RestController
public class SampleController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
