/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class Chances {
     private int Intentos_Totales;
    private int Intentos_Fallidos;
    private boolean GameOver;
    
    
    
    public Chances() {
        this.Intentos_Totales = 5;
       this.Intentos_Fallidos=0;
        this.GameOver=false;
        
    }
    
    public boolean getGameOver(){
       return GameOver;
   }
   public void setGameOver(boolean gameover){
       this.GameOver=gameover;
   }

   
    public int getIntentos_Totales() {
        return Intentos_Totales;
    }

    public void setIntentos_Totales(int Intentos_Totales) {
        this.Intentos_Totales = Intentos_Totales;
    }

    public int getIntentos_Fallidos() {
        return Intentos_Fallidos;
    }

    public void setIntentos_Fallidos(int Intentos_Fallidos) {
        this.Intentos_Fallidos = Intentos_Fallidos;
    }
    
    public int Intentos_Restantes(int intentos_totales, int intentos_fallidos){
     return intentos_totales-intentos_fallidos;   

    }
    public void perder(int intentos_Fallidos){
        if(intentos_Fallidos==5){
            JOptionPane.showMessageDialog(null,"¡Perdiste, inténtalo de nuevo!");
            setGameOver(true);
        }
    }
    public void ganar(String valor){
        if(!valor.contains("_")){
            JOptionPane.showMessageDialog(null,"¡Ganaste!");
            setGameOver(true);
        }
       
    }
    
}//Fin clase Chances
