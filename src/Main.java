import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int Horizontal=0;
        int Vertical =0;
        int aim =0;

        ArrayList<String> listOfLines = new ArrayList<>();
        Map<String, Integer> mapFromFile = new HashMap<>();


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\User\\IdeaProjects\\Winter Challenge 2021\\Day 2\\src\\input-day2.txt"));
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] parts = line.split(" ");
                String action = parts[0].trim();
                String number = parts[1].trim();


                if (!action.equals("") && !number.equals("")) {
                    switch (action) {
                        case "forward":
                        { Horizontal = Horizontal+ Integer.parseInt(number);
                            Vertical = Vertical + (Integer.parseInt(number)*aim);
                            break;}
                        case "up":
                        {
//                            Vertical-=Integer.parseInt(number);
                            aim -= Integer.parseInt(number);
                            break;}
                        case "down":
                        {
//                            Vertical+=Integer.parseInt(number);
                            aim += Integer.parseInt(number);
                            break;}
                    }
                    mapFromFile.put(action,Integer.parseInt(number));
                }
                listOfLines.add(line);
                line = bufferedReader.readLine();
            }

            System.out.println("Vertical "+ Vertical);
            System.out.println("Horizontal "+ Horizontal);

            System.out.println(Vertical*Horizontal);


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(String.valueOf(mapFromFile));
    }
}
