/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpassignment2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hp
 */
public class comps {
   String name;
   String color;
   String size;
     private final  List<comps> sh;
     
  public comps (String name,String color,String size)
 {
     this.name = name;
     this.color = color;
     this.size = size;

   sh = new ArrayList<>();  
 }
   public void addsh(comps s) 
    { 
        sh.add(s); 
    } 
       
    public void removesh(comps s) 
    { 
        sh.remove(s); 
    } 

    public List<comps>ret(){
        return sh;
    }
   @Override
    public String toString(){
        return (name+color+size);
    }
    
    public void show(){
        System.out.println("\n"+name+"composed of"+"\n");
        sh.forEach((s) -> {
            System.out.println(s);
       }
        );
        System.out.println("\n");
        
    }
}
