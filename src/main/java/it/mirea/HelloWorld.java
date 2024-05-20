package it.mirea;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(/*config*/)
                .get("/hello", ctx -> ctx.result("{ \"answer\" : \"Hello World asdasd\" }\n"))
                .start(7070);
    }
}

