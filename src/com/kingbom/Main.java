package com.kingbom;

import java.math.BigDecimal;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
	   //string
        var message ="   Hello!! java 11   ";
        System.out.println("message repeat  : "+ message.repeat(3));
        System.out.println("message isBlank : "+ message.isBlank());
        System.out.println("message strip   : "+ message.strip()); //message.trim()

        Consumer<BigDecimal> moneyConsumer = (@Deprecated var money) -> System.out.println("i got this money : " + money);
        moneyConsumer.accept(BigDecimal.valueOf(100_000_000));
    }
}
