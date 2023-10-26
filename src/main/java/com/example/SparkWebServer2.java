package com.example;

import static spark.Spark.*;
import java.util.ArrayList;

public class SparkWebServer2 {

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4568;
    }

    
public static void main(String... args){
    HttpConnectionExample httpConnectionExample = new HttpConnectionExample();
    port(getPort());
    }
}