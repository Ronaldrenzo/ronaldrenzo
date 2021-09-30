
import java.util.Scanner;

public class Regalos{

static Scanner sc = new Scanner(System.in);

static void algoritmoregalos(){
  //Definir variable
  double monto=0;
  String regalo="";
  //Datos de entrada
  System.out.println("Ingrese el monto que dispone:");
  monto=sc.nextDouble();
  //Proceso
  if(monto<=10){
    regalo+="\nTarjeta";
  } else if(monto>=11 && monto<=100){
    regalo="\nChocolate\nTarjeta";
  }else if(monto>=101 && monto<=250){
    regalo="\nFlores\nChocolate\nTarjeta";
  }else{
    regalo="\nAnillo\nFlores\nChocolate\nTarjeta";
  }
  //Datos de salida
  System.out.println("Ud. puede elegir los siguientes:"+ regalo);
}

public static void main(String[] arg){
algoritmoregalos();
}
  
}