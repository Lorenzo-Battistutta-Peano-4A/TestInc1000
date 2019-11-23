/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinc1000;

/**
 *
 * @author perilli.alberto
 */
public class TestInc1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inc1000 t1 = new Inc1000();
        Inc1000 t2 = new Inc1000();
        t1.start();
        t2.start();
        System.out.println(Inc1000.getCont());
    }
    
}
