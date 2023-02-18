import java.util.Scanner;

class UserInput{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Name String ");
        String name=sc.next();
        sc.nextLine();
        System.out.println("Enter the city");
        String city=sc.nextLine();
        sc.close();
        System.out.println("Printing the Name and the City "+name+" "+city);
        
    }

}