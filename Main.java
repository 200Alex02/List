import java.util.*;

public class Main {
    private static int count = 1;
    private static int sumKidMan = 0;
    private static int sumTeenagerMan = 0;
    private static int sumAdultMan = 0;
    private static int sumOldMan = 0;

    public static void main(String[] args) {

        List<Human> humans = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Human human = new Human("Human" + i, i, "male");
            if (i == count * 2) {
                human.setGender("female");
                count++;
            }
            humans.add(human);
        }

        List<Human> kids = new LinkedList<>();
        List<Human> teenagers = new LinkedList<>();
        List<Human> adults = new LinkedList<>();
        List<Human> olds = new LinkedList<>();

        for (Human human : humans) {
            if (human.getAge() <= 12) {
                kids.add(human);
            } else if (human.getAge() <= 18) {
                teenagers.add(human);
            } else if (human.getAge() < 60) {
                adults.add(human);
            } else {
                olds.add(human);
            }
        }

        Set<Human> kidMan = new HashSet<>();
        Set<Human> teenagerMan = new HashSet<>();
        Set<Human> adultMan = new HashSet<>();
        Set<Human> oldMan = new HashSet<>();

        for (Human human : kids) {
            if (human.getGender().equals("male")) {
                kidMan.add(human);
            }
        }
        for (Human human : teenagers) {
            if (human.getGender().equals("male")) {
                teenagerMan.add(human);
            }
        }
        for (Human human : adults) {
            if (human.getGender().equals("male")) {
                adultMan.add(human);
            }
        }
        for (Human human : olds) {
            if (human.getGender().equals("male")) {
                oldMan.add(human);
            }
        }

        for (Human human : kidMan) {
            sumKidMan += human.getAge();
        }
        for (Human human : teenagerMan) {
            sumTeenagerMan += human.getAge();
        }
        for (Human human : adultMan) {
            sumAdultMan += human.getAge();
        }
        for (Human human : oldMan) {
            sumOldMan += human.getAge();
        }

        System.out.println("\nMiddle age of kidMale = " + sumKidMan / kidMan.size() + "\nMiddle age of teenagerMale = " + sumTeenagerMan / teenagerMan.size()
                + "\nMiddle age of adultMale = " + sumAdultMan / adultMan.size() + "\nMiddle age of oldMale = " + sumOldMan / oldMan.size());

        

        /*HashMap<Integer, Human> humanHashMap = new HashMap<>();

        for (Human human: humans) {
            humanHashMap.put(human.hashCode(), human);
        }
        System.out.println(humanHashMap);*/

    }
}