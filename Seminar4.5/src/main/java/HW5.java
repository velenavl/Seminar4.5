import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HW5 {
    public static void main(String[] args) {
        // 1. Создать словарь HashMap. Обобщение <Integer, String>.
        Map<String, String> hashMap = new HashMap<>();
        System.out.println(
                "Задание №1\nИнициализируем словарь");
        System.out.println();

        System.out.println("Задание №2\nЗаполняем словарь пятью ключами (индекс, ФИО+Возраст+Пол \"Иванов Иван Иванович 28 м\")):");
        hashMap.put("1", "Андреев" + " Алексей" + " Васильевич" + " 42" + " м");
        hashMap.put("2", "Базбетова" + " Алёна" + " Васильевна" + " 36" + " ж");
        hashMap.put("3", "Диденко" + " Анастасия" + " Сергеевна" + " 17" + " ж");
        hashMap.put("4", "Кочетков" + " Максим" + " Васильевич" + " 18" + " м");
        hashMap.put("5", "Коржова" + " Анна" + " Владимировна" + " 69" + " ж");
        hashMap.forEach((a, b) -> System.out.println("Индекс: " + a + ". ФИО+Возраст+Пол: " + b));
        System.out.println();

        System.out.println("Задание №3\nИзменение значения, сделав пол большой буквы:");
        Collection<String> sValues = hashMap.values();
        Set<Map.Entry<String, String>> eSet = hashMap.entrySet();

        Set<String> keySet = hashMap.keySet();

        hashMap.compute((String)keySet.toArray()[0], (a, b) -> b = "Андреев" + " Алексей" + " Васильевич" + " 42" + " м".toUpperCase()); // значение ключа 1 с прописной буквы
        hashMap.compute((String)keySet.toArray()[1], (a, b) -> b = "Базбетова" + " Алёна" + " Васильевна" + " 36" + " ж".toUpperCase());
        hashMap.compute((String)keySet.toArray()[2], (a, b) -> b = "Диденко" + " Анастасия" + " Сергеевна" + " 17" + " ж".toUpperCase());
        hashMap.compute((String)keySet.toArray()[3], (a, b) -> b = "Кочетков" + " Максим" + " Васильевич" + " 18" + " м".toUpperCase());
        hashMap.compute((String)keySet.toArray()[4], (a, b) -> b = "Коржова" + " Анна" + " Владимировна" + " 69" + " ж".toUpperCase());
        hashMap.forEach((a, b) -> System.out.println(a+" "+b));
        System.out.println();



        System.out.println("Задание №4\nПройти по коллекции и вывести значения в формате Фамилия инициалы \"Иванов И.И.\"");
        hashMap.compute((String)keySet.toArray()[0], (a, b) -> b = "Андреев" + " А." + " В." + " 42" + " м".toUpperCase()); // значение ключа 1 с прописной буквы
        hashMap.compute((String)keySet.toArray()[1], (a, b) -> b = "Базбетова" + " А." + " В." + " 36" + " ж".toUpperCase());
        hashMap.compute((String)keySet.toArray()[2], (a, b) -> b = "Диденко" + " А." + " С." + " 17" + " ж".toUpperCase());
        hashMap.compute((String)keySet.toArray()[3], (a, b) -> b = "Кочетков" + " М." + " В.ч" + " 18" + " м".toUpperCase());
        hashMap.compute((String)keySet.toArray()[4], (a, b) -> b = "Коржова" + " А." + " В." + " 69" + " ж".toUpperCase());
        hashMap.forEach((a, b) -> System.out.println(a+" "+b));
        System.out.println();

        System.out.println("Задание №5\n*Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.");
        


    }
}
