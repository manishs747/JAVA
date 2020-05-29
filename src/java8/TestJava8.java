package java8;

import collection.HashMapRef;
import strings.Str;

import java.util.HashMap;
import java.util.Map;

public class TestJava8 {


    public static void main(String[] args) {
        Map<String, Object> t = new HashMap<>();
        t.put("a","manish");
        String str = (String) t.get("a");
        System.out.println(str);
    }
}
