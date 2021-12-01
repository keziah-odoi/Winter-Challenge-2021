import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listOfLines = new ArrayList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\Winter Challenge 2021\\Day 1\\java-version\\src\\input.txt"));
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

        int countGreater = 0;
        for (int i = 1; i < integers.size(); i++) {

            if (integers.get(i) > integers.get(i - 1)) {
                countGreater++;
            } else if (integers.get(i - 1).equals(integers.get(i))) {
            } else {
            }
        }
        System.out.println(countGreater);
    }
}
