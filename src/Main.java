import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    private static String Horizontal;

    public static void main(String[] args) {

        int counter =0;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\Winter Challenge 2021\\day8\\src\\input.txt"));
            String line = bufferedReader.readLine();

            while (line != null) {
//                System.out.println(line);
                String[] input = line.split("\\|");
//                System.out.println(Arrays.toString(input));
                String pattern = input[0];
                String output = input[1];
                String[] words = output.split(" ");
                counter += Stream.of(words).filter(s -> s.length() == 2 || s.length() == 7 || s.length() == 4 || s.length() == 3).count();
//
                line= bufferedReader.readLine();
            }

            System.out.println(counter);
            



        }
         catch (IOException e) {
            e.printStackTrace();
        }



    }}
