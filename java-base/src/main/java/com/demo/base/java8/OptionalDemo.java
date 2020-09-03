package com.demo.base.java8;

import com.demo.base.bean.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author : gengdeyang
 * @date : 2020/9/3 14:34
 */
public class OptionalDemo {
    public static void main(String[] args) {

        User user = null;

        User user1 = new User();

        //1. Optional.empty()  返回一个空Optional

        //2.Optional.of(user) 如果值为空，则抛出NPE,否则返回 Optional
        Optional<User> user2 = Optional.of(user1);

        //3.Optional.ofNullable(user) 值为空则返回空的Optional
        Optional<User> user3 = Optional.ofNullable(user);

        //4.isPresent() 判断当前对象是否是null
        System.out.println(Optional.ofNullable(user).isPresent());
        System.out.println(Optional.ofNullable(user1).isPresent());

        //5.ifPresent() 如果当前对象不为空，则执行对应的操作
        Optional.ofNullable(user1).ifPresent((s) -> s.setAge(0));
        System.out.println(user1);


        //集合操作--------------------------------------------------------------------
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "张三", 10));
        userList.add(new User(0, null, 10));
        userList.add(new User(1, "张三", null));
        userList.add(new User(null, "张三", 10));
        userList.add(new User());

        Optional.ofNullable(userList).ifPresent((s) -> s.get(0).setAge(0));
        System.out.println(userList);

        System.out.println(Optional.ofNullable(userList).map((s) -> s.get(0).getAge()).orElse(4));

    }
}
