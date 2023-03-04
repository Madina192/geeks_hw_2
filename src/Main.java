import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(whatToDo(35, 15));
        System.out.println(whatToDo(10, 24));
        System.out.println(whatToDo(23, 32));
        System.out.println(whatToDo(18, -38));
        System.out.println(whatToDo(6, 41));
        System.out.println(whatToDo(generateRandomAge(), 12));
        System.out.println(whatToDo(generateRandomAge(), 45));
    }
    public static String whatToDo(int age, int temperature) {
        String walk = "Можно идти гулять";
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return walk;
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return walk;
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return walk;
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random randomNumber = new Random();
        int age = randomNumber.nextInt(100);
        return age;
    }

}