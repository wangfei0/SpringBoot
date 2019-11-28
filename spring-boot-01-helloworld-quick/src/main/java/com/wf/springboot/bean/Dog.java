/**
 * Copyright (C), 2015-2019, 王飞
 * FileName: Dog
 * Author:   WF
 * Date:     2019/8/23 20:45
 * Description: 狗类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wf.springboot.bean;

/**
 * 〈一句话功能简述〉<br> 
 * 〈狗类〉
 *
 * @author WF
 * @create 2019/8/23
 * @since 1.0.0
 */
public class Dog {

    private  String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
