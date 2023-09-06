package Lab1;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class añosbisiestos {  
public static void main(String[] args) throws ParseException {
try (Scanner scanner = new Scanner(System.in)) {
    System.out.println("Aplicación para saber años bisiestos");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        
    System.out.print("Primera fecha\t");
        Date startDate = dateFormat.parse(scanner.next());
    
    System.out.print("Segunda fecha\t");
        Date endDate = dateFormat.parse(scanner.next()); 
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
    
    int startYear=Integer.parseInt(df.format(startDate));
    int endYear=Integer.parseInt(df.format(endDate));
    int flag=0;
    
    for(int i=startYear;i<=endYear;)
    {
    
        if ((i % 4 == 0 && i % 100 != 0) || (i % 100 == 0 && i % 400 == 0));
            {
                flag=i;
                break;
            }
    }
    
    if(flag!=0)
        {
        System.out.println("\n*****************************************************");
        System.out.println("Años bisiestos desde "+startYear+" a "+endYear+" : ");
     
                for(int i=flag;i<=endYear;i=i+4)
                {
                    System.out.print(i+"  ");
                }
        }
    else
    	{
    	System.out.println("No hay años bisiestos en el periodo proporcionado");
    }
} catch (NumberFormatException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
}

}