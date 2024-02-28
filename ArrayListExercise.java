import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("black");
        colors.add("yellow");
        colors.add("green");
        colors.add("indigo");
        colors.add("indigo");

        for (String color : colors) {
            System.out.println(color);
        }

        colors.add(2, "orange");
        colors.remove(1);
        System.out.println(colors);

        System.out.println(searchColor(colors, "orange"));
        System.out.println("Array with duplicates removed: " + removeDuplicates(colors));
    }

    public static String searchColor(List<String> colors, String searchTerm) {
        int position = colors.indexOf(searchTerm);
        if (position != -1) {
            return "Color '" + searchTerm + "' found at position " + (position + 1);
        } else {
            return "Color '" + searchTerm + "' not found in the ArrayList";
        }
    }

    public static ArrayList<String> removeDuplicates(List<String> colors) {
        ArrayList<String> uniqueColors = new ArrayList<>();
        for (String color : colors) {
            if (!uniqueColors.contains(color)) {
                uniqueColors.add(color);
            }
        }
        return uniqueColors;
    }
}