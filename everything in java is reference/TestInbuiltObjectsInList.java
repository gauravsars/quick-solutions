package testList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestInbuiltObjectsInList {
	
	public static void main(String[] args) {
		
		ArrayList<String> sevenDaysofWeek = new ArrayList<String>();
		
		ArrayList<String> englishNames = new ArrayList<String>();
		
		
		sevenDaysofWeek.add("Monday");sevenDaysofWeek.add("Tuesday");sevenDaysofWeek.add("Wednesday");
		sevenDaysofWeek.add("Thursday");sevenDaysofWeek.add("Friday");sevenDaysofWeek.add("Saturday");
		sevenDaysofWeek.add("Sunday");
		
		englishNames.addAll(sevenDaysofWeek);
		
		//englishNames = sevenDaysofWeek ;
		
		System.out.println(englishNames);
		
		System.out.println(sevenDaysofWeek);
		TestInbuiltObjectsInList testInbuiltObjects = new TestInbuiltObjectsInList();
		
		sevenDaysofWeek = testInbuiltObjects.updateDays(sevenDaysofWeek);
		System.out.println(sevenDaysofWeek);
		System.out.println(englishNames);
		
		
		
		
		
	}

	private ArrayList<String> updateDays(ArrayList<String> sevenDaysofWeek) {
		
	/*	Iterator itr = sevenDaysofWeek.iterator();
		
		while(itr.hasNext()){
			
			String day =(String) itr.next();
			
			
		}*/
		
		for(int i = 0 ; i < sevenDaysofWeek.size() ; i++){
			
			if(i == 0)
			sevenDaysofWeek.set(i, "Somvar");
			
			if(i == 1)
			sevenDaysofWeek.set(i, "Mangalvar");	
			
		}
		
		return sevenDaysofWeek;
		
	}

}
