import java.util.*;
public class NumberGame {
    public static void main(String args[]){
        Random d=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter range:");
        int l=sc.nextInt(),h=sc.nextInt();
        int n=l+d.nextInt(h),i=1;
        while(true){
            System.out.print("Guess the No."+i+": ");
            int ans=sc.nextInt();
            if(n==ans){
                System.out.println("You have guessed it right");
                break;
            }
            else if(n>ans)
            System.out.println("The number is greater");
            else if(n<ans)
            System.out.println("The number is lesser");
            ++i;
        }sc.close();
    }
}