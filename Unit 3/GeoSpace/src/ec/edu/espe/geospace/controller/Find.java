/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.geospace.controller;

/**
 *
 * @author USER
 */
public class Find {

   
     public int findCoordinate(int[] elements, int x){
        int i;
        int n = elements.length;
        for (i = 0; i < n; i++){
            if (elements[i] == x){
                return i;
            }
        }
        return -1;
    }
}
