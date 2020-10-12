package com.demo.base.file;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author : gengdeyang
 * @date : 2020/9/25 13:49
 */
public class ReadFile {

    public static void main(String[] args) throws IOException {
        File file = new File("E://message_allot_zh.properties");
        List<String> contexts = FileUtils.readLines(file, StandardCharsets.UTF_8);
        contexts.parallelStream().forEach(s -> System.out.println(s));

    }
}
