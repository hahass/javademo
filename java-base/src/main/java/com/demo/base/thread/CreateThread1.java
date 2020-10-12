package com.demo.base.thread;

/**
 * @author : gengdeyang
 * @date : 2020/10/12 19:54
 */
public class CreateThread1 extends Thread {

    public static void main(String[] args) {
        Thread thread = new CreateThread1();
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("继承Thread 执行");
    }
}
