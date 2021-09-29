import java.util.Scanner;
public class EstcondicionalU{
  static Scanner sc = new Scanner(System.in);

  static void ventalapices(){
    //Definir variables
    int cantidadlap;
    double pago;
    //Datos entrada
    System.out.println("Ingrese la cantidad de lapices a comprar:");
    cantidadlap=sc.nextInt();
    //proceso
    if (cantidadlap>=1000) {
      pago=cantidadlap*0.85;
    } else {
      pago=cantidadlap*0.90;
    }
    //Datos de salida
    System.out.println("El pago a realizar es:"+pago);
  } 

  public static void main(String[] args) {
    System.out.println("Hello World");
    ventalapices();

  }
  
}