
import Tools.IOC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gkath
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte opcion = 0;
        boolean salir=false;
        
        while(!salir){
            try{
                opcion=getOpcionMenu();
                switch(opcion){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        salir=true;
                        break;
                }
            }catch(Exception ex){
                IOC.outText("Error"+ex);
            }
        }
    }
    
    public static byte getOpcionMenu(){
        String menu="";
        byte opcion=0;
        boolean correcto=false;
        
        menu="1. ----";
        menu=menu+"\n2. ----";
        menu=menu+"\n3. ----";
        menu=menu+"\n4. Salir";
        
        while(!correcto){
            opcion = IOC.inByte(menu+"\nIngrese una opción: ");
            if(opcion>=1 && opcion<=4){
                correcto=true;
            }
        }
         return opcion;
    }
}

