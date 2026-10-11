package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        int sum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of sales persons you want to enter : ");
        final int SALESPEOPLE = scan.nextInt();
        if (SALESPEOPLE <= 0) {
            System.out.println("The number of salespeople must be positive.");
            scan.close();
            return;
        }
        int[] sales = new int[SALESPEOPLE];
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxId=0;
        int minId=0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if(sales[maxId]<sales[i]) {
                maxId = i;
            }
            if(sales[minId]>sales[i]){
                minId=i;
            }
        }
        maxId++;
        minId++;
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sales: " + (double) sum/ sales.length);
        System.out.println("Salesperson "+ (maxId)+" had the highest sale with $"+sales[maxId-1]);
        System.out.println("Salesperson "+ (minId)+" had the lowest sale with $"+sales[minId-1]);
        System.out.print("Enter a value : ");
        int value=scan.nextInt();
        int counter=0;
        for(int i=0;i< sales.length;i++){
            if(sales[i]>value){
                System.out.println("Salesperson "+(i+1)+" has made "+sales[i]);
                counter++;
            }
        }
        System.out.println("Total number of those who exceeded the value : "+ counter);
        scan.close();
    }
}