package me.ewriter.chapter12.adapter;

/**
 * Created by Zubin on 2016/11/11.
 */

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
