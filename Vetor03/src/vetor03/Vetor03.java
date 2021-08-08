/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author pablo
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //double v[] = {2.5, 2.75, 9, -4.5};
        //Arrays.sort(v);
        // int p = Arrays.binarySearch(v, 9);
//        for (double valor : v) {
//            System.out.println(valor +" ");
//        }
        //System.out.println("posicao " + p);

        int v[] = new int[20];
        Arrays.fill(v, 8);
        for (double valor : v) {
            System.out.print(valor + " ,");
        }
    }

}
