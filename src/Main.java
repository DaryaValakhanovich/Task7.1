import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        markLength4(list);
        System.out.println(list);
    }

    public static void markLength4(List<String> original) {
        List<String> newList = new ArrayList<>();
        for (String anOriginal : original) {
            if (anOriginal.length() == 4)
                newList.add(anOriginal);
        }
        for (String s1 : newList) {
            original.add(original.indexOf(s1), "***");
        }
    }
}

