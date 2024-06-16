import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperNuclearReactor {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {


            int number = scanner.nextInt();
            list.add(number);
            double sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }

                double average = (sum / list.size() + 1);

                int lastNumber = list.get(list.size() - 1);

                if (list.size() >= 2) {
                    lastNumber = list.get(list.size() - 2);
                    int difference = number - lastNumber;
                    System.out.println(difference);

                    if (number > 1.1 * average && number > lastNumber * 1.2) ;
                    System.out.println();
                }
            }
        }
    }











