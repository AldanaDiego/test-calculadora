import calculadora.Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una operacion (Ej: 2 + 3)");
        String input = sc.nextLine().replaceAll(" ", "");
        String[] op = input.split("/+|-|/*|//");

        float result = 0;
        if(op[1].equals("+")){
            result = calc.suma(Float.parseFloat(op[0]), Float.parseFloat(op[2]));
        }
        else if(op[1].equals("-")){
            result = calc.resta(Float.parseFloat(op[0]), Float.parseFloat(op[2]));
        }
        else if(op[1].equals("*")){
            result = calc.mult(Float.parseFloat(op[0]), Float.parseFloat(op[2]));
        }
        else if(op[1].equals("/")){
            result = calc.div(Float.parseFloat(op[0]), Float.parseFloat(op[2]));
        }
        System.out.println(result);
    }
}
