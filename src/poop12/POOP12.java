/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author Josue Amezcua
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Concurrencia de Hilos
        new HiloT("Primer Hilo").start();
        HiloT Hilo2 = new HiloT ("Segundo Hilo");
        Hilo2.start();
        
        new Thread(new HiloR(),"Tercer Hilo").start();
        new Thread(new HiloR(),"Cuarto Hilo").start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteracion "+i+" del Hilo Main");
        }
        System.out.println("Hilo Main Terminado");
        
    }
    
}
