import java.util.Scanner ;


public class Main {

    public static void main(String[] args) {
        System.out.println("Tax Calculator App");
        System.out.println("----- WELCOME -----");
        Scanner scanner = new Scanner(System.in);
        int count;
        System.out.println("Enter total person count:");
        count = scanner.nextInt();
        String[] names = new String[count];
        long[] income = new long[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter name "+ (i+1)+":");
            names[i] = scanner.next();
            System.out.println("Enter " + names[i] + "'s Annual income :");
            income[i] = scanner.nextLong();

        }

        for(int j =0 ; j <count ; j++ ){
            calculateTax(names[j],income[j]);
        }

    }


    public static void calculateTax(String name ,long income ){
            long tax = 0;
            if (income > 300000)
            {tax = income/5 ;
            }
            else if (income>100000 && income<300000){
            tax = income/10;
            }
            else tax = 0;

            System.out.println( name+" : "+"\u20B9"+" "+tax);

        }

}
