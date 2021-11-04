/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;
import java.util.*;
/**
 *
 * @author SPH_SHSM
 */
public class Customer {
    String name;
    double chequing;
    double saving;
    double RRSP;

    public Customer(String name) {
        this.name = name;
        this.chequing = this.saving = this.RRSP = 0;
    }
    
    public void depositChequing(double d){
        this.chequing+=d;
        Balance();
    }
    
    public void Balance(){
        System.out.println("Chequing: "+chequing);
        System.out.println("Saving: "+saving);
        System.out.println("RRSP: "+RRSP);
    }
    
    
    
}
