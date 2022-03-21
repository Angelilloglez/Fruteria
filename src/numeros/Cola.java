/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeros;

import java.util.ArrayList;

/**
 *
 * @author Ángel.García
 */
public class Cola {
     
    ArrayList cola;
    
    public Cola(){
        this.cola=new ArrayList();
        
    }
    
    public void nuevoCliente(String nombre){
        
        Cliente a= new Cliente(nombre);
        this.cola.add(a);
    }
    
    
}
