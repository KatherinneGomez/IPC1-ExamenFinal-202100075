
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
                        IOC.outText("-------Ejercicio 1-------");
                        int a = IOC.inInteger("Ingrese el primer número:");
                        int b = IOC.inInteger("Ingrese el segundo número:");
                        int elMayor = BO.elMayor(a,b);
                        
                        IOC.outText("El mayor de los dos números es: "+elMayor);
                        break;
                    case 2:
                        boolean correcto = false;
                        while(!correcto){
                            IOC.outText("-------Ejercicio 2-------");
                            int num = IOC.inInteger("Ingrese un número impar:");
                            if(num%2!=0){
                                BO.piramide(num);
                                correcto=true;
                            }else{
                                IOC.outText("Número ingresado inválido");
                                correcto=false;
                            }
                        }
                        break;
                    case 3:
                        int numVacas = IOC.inInteger("Indique el número de vacas en venta:");
                        Vacas vacas = new Vacas(numVacas);
                        for(int i=0;i<numVacas;i++){
                            Vaca vaca = new Vaca(i,BO.getPeso(),BO.getPLeche());
                            
                            vacas.addVaca(vaca);
                        }
                        int pesoCamion = IOC.inInteger("Indique el peso que puede soportar el camión:");
                        
                        for(int j=0;j<numVacas;j++){
                            String vaca1="id: "+vacas.getVaca(j).getIdVaca();
                            vaca1=vaca1+", peso: "+vacas.getVaca(j).getPeso();
                            vaca1=vaca1+", produccion: "+vacas.getVaca(j).getpLeche();
                            IOC.outText(vaca1);
                        }
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
        
        menu="1. Comparar Dos Números";
        menu=menu+"\n2. Pirámide de números Impares";
        menu=menu+"\n3. Vacas";
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

