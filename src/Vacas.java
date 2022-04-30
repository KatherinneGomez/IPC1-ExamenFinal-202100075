/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gkath
 */
public class Vacas {
    Vaca[] vacas;

    public Vacas(int numVacas) {
        vacas= new Vaca[numVacas];
    }
    
    public void addVaca(Vaca vaca){
        this.vacas[getPosDisponible()]=vaca;
    }
    
    public Vaca getVaca(int pos){
        return this.vacas[pos];
    }
    
    public int getPosDisponible(){
        int pos=-1;
        
        for(int i=0;i<vacas.length;i++){
            if(getVaca(i) == null){
                pos=i;
                break;
            }
        }
        
        return pos;
    }
}
