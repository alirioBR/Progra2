package Parcial1;
import java.util.Scanner;

public class iva {
    public static void main(String[] args) {
        double afp, isss, salario, salariomdes, salarioF, tramo2, tramo3, tramo4;
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Ingrese salario base: ");
            salario = obj.nextDouble();
        }

        afp= (salario * 0.03);
        isss = (salario * 0.0725);

        System.out.println(afp);
        System.out.println(isss);
        salariomdes = (salario - ( afp + isss));
        {
        if(salariomdes<472); {
            {System.out.println("Su salario NO tiene descuento de Renta, salario a recibir es $"+salariomdes);
            };           
        if(salariomdes >= 472.01 && salariomdes <= 895.24);{
                tramo2=(((salariomdes - 472.0) * 0.10) + 17.67);
                salarioF=(salariomdes-tramo2);
            System.out.println("Su salario tiene descuento de Renta, salario a recibir es $"+salarioF);
            };
        if(salariomdes >= 895.25 && salariomdes <= 2038.10);{
            tramo3=(((salariomdes - 895.24)* 0.20)+ 60);
            salarioF=(salariomdes-tramo3);
            System.out.println("Su salario tiene descuento de Renta, salario a recibir es $"+salarioF);
            };
         if (salariomdes >= 2038.11);{ 
            {tramo4=(((salariomdes - 2038.10)* 0.30)+ 288.57);
                salarioF=(salariomdes-tramo4);
            System.out.println("Su salario tiene descuento de Renta, salario a recibir es $"+salarioF);
            };
    }
}
}
}
}