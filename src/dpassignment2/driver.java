/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpassignment2;

/**
 *
 * @author Hp
 */
public class driver {
    public static void main(String[] args) {
        comps tri1 = new comps("Triangle","Brown","Big");
        comps sqr1 = new comps("Square","White","Big");
        
        comps circ1 = new comps("Circle","Green","Small");
        comps rec1 = new comps("Rectangle","Brown","Big");
        
        comps tri2 = new comps("Triangle","Blue","Small");
        comps circ2 = new comps("Circle","Red","Big");
        
      

        
        comps house = new comps("House","Brown & White","Big");
        house.addsh(tri1);
        house.addsh(sqr1);

        
        comps tree = new comps("Tree","Green & Brown","Small");
        tree.addsh(circ1);
        tree.addsh(rec1);
        
        
        comps water = new comps("Blue","Green & Red","Big");
        water.addsh(tri2);
        water.addsh(circ2);

        
        
        comps village = new comps("Village","Pink","Big");
        village.addsh(house);
        village.addsh(tree);
        village.addsh(water);


        
        
        System.out.println(house);
        house.show();
        
        
        System.out.println(tree);
        tree.show();
        
         System.out.println(water);
         water.show();
         
        System.out.println(village);
        village.show();
         
        
}
}
