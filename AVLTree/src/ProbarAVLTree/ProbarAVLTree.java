/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ProbarAVLTree;

import AVLTree.AVLTree;

/**
 *
 * @author fires
 * blog: http://proyectosbeta.blogspot.com/
 */
public class ProbarAVLTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AVLTree<Integer> arbolAVL = new AVLTree<Integer>();

       /* Integer elemento1 = new Integer("1");
        Integer elemento2 = new Integer("2");
        Integer elemento3 = new Integer("3");
        Integer elemento4 = new Integer("4");
        Integer elemento5 = new Integer("5");
        Integer elemento6 = new Integer("6");
        Integer elemento7 = new Integer("7");
        Integer elemento8 = new Integer("15");
        Integer elemento9 = new Integer("14");
        Integer elemento10 = new Integer("13");*/

        arbolAVL.insert(12);
        arbolAVL.insert(17);
        arbolAVL.insert(3);
        arbolAVL.insert(20);
        arbolAVL.insert(4);
        arbolAVL.insert(2);
        arbolAVL.insert(6);
        arbolAVL.insert(8);
        arbolAVL.insert(7);
        arbolAVL.insert(1);
        arbolAVL.insert(15);
        arbolAVL.insert(21);
        arbolAVL.insert(18);
        arbolAVL.insert(9);
        arbolAVL.insert(30);
        
        arbolAVL.imprimirPorNiveles();
        System.out.println("\n");

        

    }

}
