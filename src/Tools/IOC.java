package Tools;
import java.util.Scanner;

public class IOC {
    //atributos
    public static Scanner lector = new Scanner(System.in);
    
    //métodos
    public static void outText(String texto){
        System.out.println(texto);
    }
    
    public static int inInteger(String texto){
        int dato=0;
        outText(texto);
        dato= Integer.parseInt(lector.nextLine());
        return dato;
    }
    
    public static float inFloat(String texto){
        float dato=0.0f;
        outText(texto);
        dato=Float.parseFloat(lector.nextLine());
        return dato;
    }
    
    public static byte inByte(String texto){
        byte dato=0;
        outText(texto);
        dato=Byte.parseByte(lector.nextLine());
        return dato;
    }
    
    public static String inText(String texto){
        outText(texto);
        return lector.nextLine();
    }
}
