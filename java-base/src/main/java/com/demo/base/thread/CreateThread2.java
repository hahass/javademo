package com.demo.base.thread;

/**
 * @author : gengdeyang
 * @date : 2020/10/12 19:56
 */
public class CreateThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("实现Runnable");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new CreateThread2());
        thread.start();
    }
}
