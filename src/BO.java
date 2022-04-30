
import Tools.IOC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gkath
 */
public class BO {
    public static int elMayor(int a, int b){
        if(a>b){
            return a;
        }else if(b>a){
            return b;
        }else{
            return 0;
        }  
    }
    
    public static void piramide(int num){
        IOC.outText("Pirámide");
        String piramide="*";
        int filas = num-(int)(num/2);
        //IOC.outText(String.valueOf(filas));
        
        for(int alto=1; alto<=filas;alto++){
            for(int espacio=1;espacio<=filas-alto;espacio++){
                System.out.print(" ");
            }
            for(int pira=1;pira<=alto*2-1;pira++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
    public static int getPeso(){
        int peso=(int) Math.round(Math.random()*(400-120));
        return peso;
    }
    
    public static int getPLeche(){
        int pLeche=(int) Math.round(Math.random()*(40-12));
        return pLeche;
    }
}
