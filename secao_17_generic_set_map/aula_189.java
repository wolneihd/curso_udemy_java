package secao_17_generic_set_map;

import java.util.Map;
import java.util.TreeMap;

public class aula_189 {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username","maria");
        cookies.put("email","maria@gmail.com");
        cookies.put("phone","9.8189-1321");

        for (String key: cookies.keySet()) {
            System.out.println(cookies.get(key));
        }
    }
}
