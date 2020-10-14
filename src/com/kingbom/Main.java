package com.kingbom;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException, ScriptException {
        string();
        consumer();
        httpClient();
        unicode10();
        javaScripEngine();
    }

    private static void consumer() {
        Consumer<BigDecimal> moneyConsumer = (@Deprecated var money) -> System.out.println("i got this money : " + money);
        moneyConsumer.accept(BigDecimal.valueOf(100_000_000));
    }

    private static void string() {
        var message ="   Hello!! java 11   ";
        System.out.println("message repeat  : "+ message.repeat(3));
        System.out.println("message isBlank : "+ message.isBlank());
        System.out.println("message strip   : "+ message.strip()); //message.trim()
    }

    private static void httpClient() throws java.io.IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://www.google.com"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

    private static void unicode10() {
        //unicode 10
        System.out.println("\u20BF");
    }

    private static void javaScripEngine() throws ScriptException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        engine.eval("print('help, i am dying');");
    }
}
