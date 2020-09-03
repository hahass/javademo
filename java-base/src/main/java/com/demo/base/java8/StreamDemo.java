package com.demo.base.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author : gengdeyang
 * @date : 2020/9/3 15:31
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = null;

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);

        list1.stream().map((s) -> s.equals(3)).collect(Collectors.toList());

        Optional.ofNullable(list).orElse(Collections.emptyList()).stream().map((s) -> s.equals(3)).collect(Collectors.toList());
    }
}
