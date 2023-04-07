package GuessTheNumber;
import java.util.*;

public class GuessTheNumber {
    public static void main(String[]args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Think of a Number between 1-1000000 and I would tell you in just 20 steps");
        System.out.println("*********************************************************************");
        int i,SI=0,LI=999999,number=0,mid,ch,c=1;
        int num[] = new int [1000000];
        for(i=0;i<1000000;i++)
        {
            num[i]=i+1;
        }
        while(SI<=LI)
        {
            mid=(SI+LI)/2;
            while(true)
            {
                System.out.println();
                System.out.println(c+" Turn");
                System.out.println("Press 1 if the Number in your Mind is "+num[mid]);
                System.out.println("Press 2 if your Number is less than "+num[mid]);
                System.out.println("Press 3 if your Number is greater than "+num[mid]);
                System.out.println();
                ch=sc.nextInt();
                System.out.println();
                if(ch==1)
                {
                    number=num[mid];
                    SI=LI+1;
                    break;
                }
                else if(ch==2)
                {
                    LI=mid-1;
                    c++;
                    break;
                }
                else if(ch==3)
                {
                    SI=mid+1;
                    c++;
                    break;
                }
                else
                {
                    System.out.println("You have entered a Wrong Number. Please Re-enter it Again");
                }
            }
        }
        System.out.println("*********************************************************************");
        if(number>0)
        {
            System.out.println("The Number in your Mind is "+number);
        }
        else
        {
            System.out.println("Don't try to Cheat with the Genius");
        }
        System.out.println("*********************************************************************");
        System.out.println("Thanking You");
        System.out.println("This program was developed by Manish M. Pillai");
        System.out.println("*********************************************************************");
        sc.close();
    }
}
