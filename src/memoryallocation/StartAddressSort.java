/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoryallocation;

import java.util.Comparator;

/**
 *
 * @author HP
 */
public class StartAddressSort implements Comparator<Hole> {
     @Override
    public int compare(Hole a, Hole b) {

        if (a.getStartAddress() >= b.getStartAddress()) {
            return 1;
        } else {
            return -1;
        }
    }
    
}
