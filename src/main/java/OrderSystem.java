import java.util.Scanner;

public class OrderSystem {

    public static void printDeliveryFees(){
        System.out.println("DELIVERY FEES:");
        System.out.println("0 -  5 miles  = $2");
        System.out.println("6 - 15 miles  = $5");
        System.out.println("16 - 25 miles = $10");
        System.out.println("26 - 50 miles = $15");
        System.out.println("More than 50 miles = $20");
    }

    public static int calculateTotalCost(int miles, int qty){
        final int price = 5;
        int mileFee;

        if(miles < 6 && miles >= 0){
            mileFee = 2;
        }
        else if(miles < 16 && miles >= 6){
            mileFee = 5;
        }
        else if(miles < 26 && miles >= 16){
            mileFee = 10;
        }
        else if(miles < 51 && miles >= 26){
            mileFee = 15;
        }
        else{
            mileFee = 20;
        }

        int totalCost = (price * qty) + mileFee;

        return totalCost;
    }

    public static void main(String[] args) {
        System.out.println("PRODUCT PRICE: $5");
        System.out.println(" ");

        printDeliveryFees();

        System.out.println(" ");
        System.out.println("Enter mile distance: ");
        Scanner scanner = new Scanner(System.in);
        int miles = scanner.nextInt();

        System.out.println(" ");
        System.out.println("Enter quantity: ");
        int qty = scanner.nextInt();

        System.out.println(" ");
        System.out.println("Total cost: $" + calculateTotalCost(miles, qty));

        scanner.close();
    }

}

