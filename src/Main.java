
import java.util.Scanner;

public class Main
{
    // Method to convert binary to hex
    static void convert(StringBuilder val)
    {
        // Reversing the characters
        val =val.reverse();
        int size =val.length();

        // Loop to insure the number of characters are multiples of four
        while (size%4 !=0)
        {
            val.append("0");
            size =val.length();
        }

        // New StringBuilder to hold the result
        StringBuilder val2 = new StringBuilder();

        // Two loops to calculate the result; the inner loop calculate result of each four digits
        // the outer loop is only to set the start point of the inner loop each time
        for (int i=0; i<size; i+=4)
        {
            int res=0; double po=0;
            for (int j=0; j<4; j++)
            {
                int num =(val.charAt(i+j))-'0';
                res +=num*(int)Math.pow(2,po);
                po +=1;
            }
            val2=val2.append(res);
        }
        System.out.println(val2.reverse());
    }

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        StringBuilder val  =new StringBuilder(sc.nextLine());

        convert(val);

}

}
