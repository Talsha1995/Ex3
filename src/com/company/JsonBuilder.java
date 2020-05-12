package com.company;

//import package.CharScanner ;


import java.io.File;

public class JsonBuilder extends JsonValue{
    private CharScanner sc;
    private JsonValue v;


    public JsonBuilder(File f){


    }

    public JsonValue parseValue(){
        return JsonValue;
    }

    public JsonArray parseArray(){

    }

    public JsonObject parseObject(){

    }

     public JsonString parseString(){

     }

     public JsonNumber parseNumber(){

     }


    @Override
    public JsonValue get(int i) {
        return null;
    }

    @Override
    public JsonValue get(String s){

     }

    @Override
    public String toString() {
        return "JsonBuilder{" +
                "v=" + v +
                '}';
    }
}
