package c2ejercicio3;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class C2Ejercicio3 {

   

    public static void main(String[] args) {
        // TODO code application logic here  
        
       int ventana;
       String [] botones = {"Soy empleado base mas comision", "Soy empleado por comision", "Cancelar"};
       
       ventana = JOptionPane.showOptionDialog(null,"Elige una opcion","Empleados", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,botones,botones[0]);
       int opcion = ventana;
       
       switch(opcion)
       {
           case 0: 
               //JOptionPane.showMessageDialog(null,baseMasComision);
               break;
           case 1: 
                //String nombre = JOptionPane.showInputDialog(null, "Escribe el nombre del empleado: ");
                String apellido = JOptionPane.showInputDialog(null, "Escribe el apellido del empleado: ");
                String nss = JOptionPane.showInputDialog(null, "Escribe el nombre del empleado: ");
                double tarifa = Double.parseDouble(JOptionPane.showInputDialog(null, "Hola"));
                double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salario obtenido anteriormente: "));
                
                EmpleadoPorComision comision = new EmpleadoPorComision(nombre,apellido,nss,tarifa,salario);
               break;
           case 2: break;
           
           default: break;
       }
        
        /*
         EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Susana",
        "Pérez","222-22-222",10000,.06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Roberto",
        "González","333-33-333",10000,.04,300);
        System.out.printf( "%s %s:\n\n%s\n\n","Llamada a toString de EmpleadoPorComision con referencia de superclase ",
                "a un objeto de la superclase", empleadoPorComision.toString());
        System.out.printf( "%s %s:\n\n%s\n\n",
                "Llamada a toString de EmpleadoBaseMasComision con referencia",
                "de subclase a un objeto de la subclase",empleadoBaseMasComision.toString());
        EmpleadoPorComision empleadoPorComision2 = empleadoBaseMasComision;
        EmpleadoBaseMasComision empleadoPorComision3 = empleadoBaseMasComision;
        System.out.printf("%s %s:\n\n%s\n","Llamada a toString de EmpleadoBaseMasComision con referencia de superclase",
        "a un objeto de la subclase", empleadoPorComision2.toString() );
        System.out.printf("%s %s:\n\n%s\n","\nLlamada a toString de EmpleadoBaseMasComision con referencia de subClase",
        "a un mismo objeto", empleadoPorComision3.toString() );*/
    }
    
}
