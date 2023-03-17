package ITMO.JavaCourse.Lab09;

import java.util.*;

public class CollectionsMethods {
    private static Random random = new Random();
    //Второе задание
    public static Set<Integer> printNoDuplicateList(List<Integer> numbers) {
        Set<Integer> noDuplicate = new HashSet<>(numbers);
        return noDuplicate;
    }
    //Третье задание
    public static void addItems(ArrayList<Byte> arrayList, LinkedList<Byte> linkedList ) {
        for (int i = 1; i <= 1000000; i++) {
            arrayList.add((byte) i);
            linkedList.add((byte)i);
        }
    }

    public static void printRandomItem(ArrayList<Byte> arrayList) {
        for (int i = 1; i <= 100000; i++) {
            System.out.print(arrayList.get(random.nextInt(1000000)) + " ");
        }
    }
    public static void printRandomItem(LinkedList<Byte> linkedList) {
        for (int i = 1; i <=100000; i++) {
            System.out.print(linkedList.get(random.nextInt(1000000)) + " ");
        }
    }
    //Четвёртое задание
    public static void printUserInfo() {

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        Integer scoreRes = 0;

        Map<User, Integer> userScore = new HashMap<>();
        userScore.put(new User("PeterP"), 10);
        userScore.put(new User("AlinaS"), 67);
        userScore.put(new User("AndreyVan"), 87);
        userScore.put(new User("TanyaT"), 76);
        userScore.put(new User("PetrovVan"), 55);
        userScore.put(new User("NoName"), 33);

        for (User user: userScore.keySet()) {
            if (Objects.equals(user.getUser(), userName)) {
                scoreRes = userScore.get(user);
            }
        }
        System.out.println("User Name: "+ userName + ". Scores: " + scoreRes + " points");
    }
}
