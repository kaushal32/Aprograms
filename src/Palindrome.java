import java.util.Scanner;

public class Palindrome{
    private int num;
    public  Palindrome(int num){
        this.num=num;

    }
    public void  Palindromeno(){
        int sum = 0, r, temp;
        temp = num;
        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            num = num / 10;
        }

        if (sum == temp)
            System.out.println("It is a Palindrome");
        else
            System.out.println("It is not a Palindrome");
    }
}
class Palindromeno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Palindrome obj=new Palindrome(sc.nextInt());
        obj.Palindromeno();


    }
}

