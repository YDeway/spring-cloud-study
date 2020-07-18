package com.buck.producer;

public class M {
    private static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 200; i++) {
            new Thread(() -> {
                //每个线程让count自增100次
                for (int i1 = 0; i1 < 100; i1++) {
                    count++;
                }
            }).start();
        }

        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(count);
    }
}
