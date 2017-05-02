/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpe_tp_java_1;

import java.util.Comparator;

/**
 *
 * @author nathanael
 */
public class PercentageComparator implements Comparator<Candidat>{

    @Override
    public int compare(Candidat o1, Candidat o2)
    {
        Double percentage1 = (Double)o1.getPourcentage();
        Double percentage2 = (Double)o2.getPourcentage();
        return percentage2.compareTo(percentage1);
    }
    
}
