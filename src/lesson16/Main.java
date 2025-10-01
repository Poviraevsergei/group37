package lesson16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //loadFactor - сколько % нужно заполнить чтобы массив увеличился в 2 раза
        //capacity - всего сколько ячеек
        //threshold - capacity * loadFactor
        Map<User, Integer> names = new HashMap<>(100, 0.65f);
        User user = new User("Adam");
        names.put(user, 4);
        user = new User("Eva");
    }
}

    /*
        //HashMap
        //TreeMap
        //LinkedHashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("Serg", 11); //положить эл-т в мапу
        map.putIfAbsent("Serg", 23);
        System.out.println(map);
        System.out.println(map.get("Serg")); //возвращает эл-т
        map.getOrDefault("Oksana", 0);
        map.remove("Olga");
        map.replace("Serg", 12);

        System.out.println(map.containsKey("Ilya"));
        System.out.println(map.containsValue(11));
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        Set<Map.Entry<String, Integer>> setCollection = map.entrySet();
        for (Map.Entry<String, Integer> element : setCollection) {
            System.out.println(element.getKey());
        }
        Set<String> keySet = map.keySet();
        Collection<Integer> ages = map.values();
 */
