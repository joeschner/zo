/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author 14237050
 */
public class zoo extends Main {
    
Scanner s = new Scanner(System.in);    
public String name;
public int preis;


public zoo(String name, int preis) {
    
    this.name=name;
    this.preis=preis;
}

public void ShowAll(){
    
    
    System.out.println(name + preis);
    
    int auswahl = s.nextInt();
    
    
}     
       
}
