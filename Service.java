package laba2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Service {
	public int nonVac(ArrayList<Pet> pets) {
		int nonVac=0;
		for(Pet p:pets) {
			if(p.isVacStatus()==false) {
				nonVac++;
			}
		}
		return nonVac;
	}
	public void dogs(ArrayList<Pet> pets) {
		for(Pet p:pets) {
			if(p.getClass().getName()=="laba2.Dog") {
				p.print();
			System.out.print("\n");
		}
		}
	}
	public void youngToOld(ArrayList<Pet> pets) {
		Collections.sort(pets);
	}
	public void alphabet(ArrayList<Pet> pets) {
		Collections.sort(pets,
                new Comparator<Pet>()
                {
                    public int compare(Pet f1, Pet f2)
                    {
                        return f1.getName().compareTo(f2.getName());
                    }        
                });
	}

}
