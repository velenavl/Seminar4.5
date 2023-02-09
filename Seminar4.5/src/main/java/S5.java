//import java.util.*;
//
//public class S5 {
//    public static void main(String[] args) {
//        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("Один", "One");
//        hashMap.putIfAbsent("Два", "Два");
//        hashMap.put("Три", "Три");
//        hashMap.putIfAbsent("4", "Четыре");
//        //System.out.println(hashMap.containsKey("1"));
//
//        Collection<String> sValues = hashMap.values();
//        Set<Map.Entry<String, String>> eSet = hashMap.entrySet();
//
//        Set<String> keySet = hashMap.keySet();
//        for (int i = 0; i < keySet.size(); i++) {
////            System.out.println(hashMap.get(keySet.toArray()[i]));
//            if (((String) keySet.toArray()[i]).length() > 3 && hashMap.get(keySet.toArray()[i]).contains("n")) {
//                hashMap.remove(keySet.toArray()[i]);
//            }
//        }
//        for (String value : hashMap.keySet()) {
//            System.out.println(value);
//        }
//
////        Iterator<String> iterator = hashMap.keySet().iterator();
////        while (iterator.hasNext()){
////            String value = iterator.next();
////            System.out.println(value);
////            if (value.equals("4")) iterator.remove();
////        }
//
//            //hashMap.compute("Один", (k, v) -> v+="!"); добавили ! в значение ключа 1
//        hashMap.compute((String)keySet.toArray()[0], (k, v) -> v = v.toLowerCase()); // значение ключа 1 с прописной буквы
//        hashMap.computeIfPresent((String)keySet.toArray()[0], (k, v) -> v = "");
////
////        hashMap.forEach((k, v) -> System.out.println(k+" "+v));
////
////        hashMap.remove(keySet.toArray()[0]);//удаление
//
//            // linked выводит попорядку. но медленнее
//            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
//            linkedHashMap.put("Один", "One");
//            linkedHashMap.putIfAbsent("Два", "Два");
//            linkedHashMap.put("Три", "Три");
//            linkedHashMap.putIfAbsent("4", "Четыре");
//            linkedHashMap.forEach((k, v) -> System.out.println(k + " " + v));
//
//            TreeMap<Integer, String> treeMap = new TreeMap<>();
//            treeMap.put(15, "zero");
//            NavigableMap<Integer, String> a = treeMap.tailMap(5, true);
//            NavigableMap<Integer, String> b = treeMap.headMap(5, false);
//
//        }
//    }
//}
