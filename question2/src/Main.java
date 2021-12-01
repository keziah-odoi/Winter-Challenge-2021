import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listOfLines = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\Winter Challenge 2021\\Day 1\\question2\\src\\input.txt"));
            String line = bufferedReader.readLine();
            while (line != null) {
                listOfLines.add(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Integer> integers = new ArrayList<>();
        for (String number : listOfLines) {
            integers.add(Integer.parseInt(number));
        }
//
//        List<Integer> numbers = new ArrayList<>(List.of(199,
//                200,
//                208,
//                210,
//                200,
//                207,
//                240,
//                269,
//                260,
//                263));

        int countGreater = 0;
        int currentSum = 0, previousSum = 0;
        for (int marker = 0; marker < integers.size() - 3; marker++) {
            previousSum = currentSum;
            currentSum = integers.get(marker) + integers.get(marker + 1) + integers.get(marker + 2);
//            System.out.println(previousSum+ " " +currentSum);

            if (currentSum > previousSum) {
                System.out.println("Increased");

                countGreater++;
            } else if (currentSum == previousSum) {
                System.out.println("no change");
            } else System.out.println("Decreased");
        }
        System.out.println(countGreater);
    }
}

