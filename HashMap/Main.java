import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();

//        PUT
        map.put("Apple", 20.25);
        map.put("Orange", 52.6);
        map.put("Banana", 10.8);
        System.out.println(map);

//        REMOVE
        map.remove("Apple");
        System.out.println(map);

//        GET
        System.out.println(map.get("Orange"));

//        EXIST
        System.out.println(map.containsKey("Apple"));
        System.out.println(map.containsValue(10.8));

//        SIZE
        System.out.println(map.size());

//        Iterate
        for (String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }
    }
}
