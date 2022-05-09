import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAndMap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);
        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","10");
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            String b = Integer.toString(a);
            if (!map.containsValue(b)){
                result.add(a);
            }
        }
        System.out.println(result);
    }
}
