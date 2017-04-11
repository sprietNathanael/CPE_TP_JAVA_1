package cpe_tp_java_1;

import cpe_tp_java_1.HommePolitique;

/**
 * @author francoise.perrin
 * Inspiration MOOC sur Coursera "Introduction � la POO (en Java)"
 * by Jamila Sam, Jean-C�dric Chappelier - EPFL 
 */

public interface Vote {
	public boolean estInvalide();
	public HommePolitique getHommePolitique() ; 
	public int getDate();
}
