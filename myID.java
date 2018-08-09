import java.util.Scanner ;


public class Main {

    public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	     String name  ;
	     int age ;
	     String  bloodgroup  ;
	     String group ;
	     name = scanner.nextLine();
	     age = scanner.nextInt();
	     bloodgroup = scanner.next();
        if (age>= 20) {group = "RED";}
        else if(age>=15 && age<20) {group = "BLUE";}
        else if(age>=10 && age<15) {group = "YELLOW";}
        else group = " none";

        System.out.println("_________________________");
        System.out.println(" Name: "+name);
        System.out.println(" Age: "+age);
        System.out.println(" Blood Group: " +bloodgroup);
        System.out.println("_________________________");
        System.out.println("  Your group is "+ group);
        System.out.println("_________________________");


        scanner.close();


    }
}
