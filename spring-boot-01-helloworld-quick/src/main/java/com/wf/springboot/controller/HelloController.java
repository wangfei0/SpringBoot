/**
 * Copyright (C), 2015-2019, 王飞
 * FileName: HelloController
 * Author:   WF
 * Date:     2019/8/23 19:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wf.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author WF
 * @create 2019/8/23
 * @since 1.0.0
 */
//这个类的所有方法返回的数值直接写给浏览器（如果是对象转为json数据）
//@ResponseBody
//@Controller
@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {

        return "hello world quick";
    }

    @RequestMapping("/sayhello")
    public String sayHello() {

        return "hello:"+name;
    }

}
