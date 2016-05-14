package revisionApp;
/**
 * A class to test the user on the first 4 periods of the periodic table
 */

/**
 * @author Abbey Scofield-Marlowe
 * @version 1.0
 */

import java.util.*;

public class periodicTable extends roteRevision {
	static String[] pTable = {"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr"};
	Random numberGen = new Random();
	
	public String nextElement(){
		
		int nextElNo = numberGen.nextInt(pTable.length+1);
		System.out.println(nextElNo);
		return "";
	}
}
