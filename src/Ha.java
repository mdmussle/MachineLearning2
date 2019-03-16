import java.io.*;
import java.util.*;

public class Ha{
    private static int sumNum1 =0;
    private static int sumNum2=0;
    private static int countNum1=0;
    private static int countNum2=0;
    
    public static void main(String[] args) throws FileNotFoundException {
        String newFileName = "haberman.data";
        Scanner scan = new Scanner (new File(newFileName));
        String line = null;
        
        while(scan.hasNext())
        {
            line = scan.next();
            String[] temp = line. split(",");
            if (temp[3].equals("1"))
            {
                countNum1++;
                sumNum1 = sumNum1 + Integer.parseInt(temp[2]);
                
            }
            else if (temp[3].equals("2"))
            {
                countNum2++;
                sumNum2=sumNum2+Integer.parseInt(temp[2]);
                
            }
    }
        System.out.println("the servival of 1 is : " + sumNum1/countNum1);
        System.out.println("the servival of 2 is : " + sumNum2/countNum2);
    }
}