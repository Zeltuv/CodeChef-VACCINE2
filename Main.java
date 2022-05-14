import java.util.*;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int testAmount = scanner.nextInt();
        
        if (testAmount < 1 || testAmount > 10)
            return;

        for (int i = 0; i < testAmount; i++) {
            int people = scanner.nextInt();
            int maxpeople = scanner.nextInt();

            int peopleAtRisk = 0;
            int peopleSafe = 0;

            for (int j = 0; j < people; j++) {
                int age = scanner.nextInt();

                if(age >= 80 || age<=9){
                    peopleAtRisk++;
                }else {
                    peopleSafe++;
                }
            }

            int neededDay = (int) (Math.ceil((double) peopleAtRisk/(double)maxpeople)+ Math.ceil((double) peopleSafe/(double)maxpeople));

            System.out.println(neededDay);
        }
    }
}
