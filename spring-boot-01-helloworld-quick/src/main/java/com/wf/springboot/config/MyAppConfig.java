/**
 * Copyright (C), 2015-2019, 王飞
 * FileName: MyAppConfig
 * Author:   WF
 * Date:     2019/8/24 16:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wf.springboot.config;

import com.wf.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author WF
 * @create 2019/8/24
 * @since 1.0.0
 */

/**
 * @Configuration指明当前类是一个配置类：就是代替之前的Spring配置文件
 *
 * 在配置文件中用<bean></bean>标签添加组件
 *
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中：容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加组件了...");
        return new HelloService();
    }
}
