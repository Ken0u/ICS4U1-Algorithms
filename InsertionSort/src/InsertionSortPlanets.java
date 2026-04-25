import java.util.Arrays;

public class InsertionSortPlanets {
    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        insertionSort(planets);
    }

    public static void insertionSort(String[] list) {
        for (int i = 0; i < list.length; i++) {
            int j = i;
            String value = list[i];

            while (j > 0 && value.compareTo(list[j - 1]) < 0) {
                list[j] = list[j - 1];
                j--;
            }

            list[j] = value;
            System.out.println(Arrays.toString(list));
        }
    }
}
