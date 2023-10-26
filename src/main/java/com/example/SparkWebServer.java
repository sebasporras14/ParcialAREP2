package com.example;

import static spark.Spark.*;
import java.util.ArrayList;

public class SparkWebServer {


    public static ArrayList<Integer> buildSecuente(int number) {
        ArrayList<Integer> secuencia = new ArrayList();
        for (int i = 0; i < number + 1; i++) {
            int numberInSec = lucasSecuence(i);
            secuencia.add(numberInSec);
        }
        return secuencia;
    }

    public static int lucasSecuence(int number) {
        if (number == 0) {
            return 2;
        } else if (number == 1) {
            return 1;
        }
        return lucasSecuence(number - 1) + lucasSecuence(number - 2);
    }


    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    
public static void main(String... args){
    port(getPort());
    staticFiles.location("/public");
    get("/hello", (req,res) -> {
        int number = Integer.parseInt(req.queryParams("name"));
        ArrayList<Integer> secuenceBuilt = buildSecuente(number);
        String response = secuenceBuilt.get(0).toString();
        for(int i = 1; i < secuenceBuilt.size(); i++){
            response += "," + secuenceBuilt.get(i).toString();
        }  
        String finalResponse = "{operation: Secuencia de Lucas,input:  " + number + ",output: "  + response+ "}"; 
        return finalResponse;
    });
    }
}