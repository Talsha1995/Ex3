package com.company;

import java.util.List;

public class JsonArray extends JsonValue {
    private List<JsonValue> a;

    public JsonArray(){

    }

    @Override
    public JsonValue get(int i) {
        return null;
    }

    @Override
    public JsonValue get(String s) {
        return null;
    }

    @Override
    public String toString() {
        return "JsonArray{" +
                "a=" + a +
                '}';
    }
}

