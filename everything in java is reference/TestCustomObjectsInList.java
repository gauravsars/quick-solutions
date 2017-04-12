package testCustomobjectsinlist;

import java.util.ArrayList;

import testList.TestInbuiltObjectsInList;

public class TestCustomObjectsInList {
	
public static void main(String[] args) {
		
		ArrayList<WeekDayModel> sevenDaysofWeek = new ArrayList<WeekDayModel>();
		
		ArrayList<WeekDayModel> englishNames = new ArrayList<WeekDayModel>();
		
		WeekDayModel weekDay1 = new WeekDayModel();
		WeekDayModel weekDay2 = new WeekDayModel();
		WeekDayModel weekDay3 = new WeekDayModel();
		WeekDayModel weekDay4 = new WeekDayModel();
		WeekDayModel weekDay5 = new WeekDayModel();
		WeekDayModel weekDay6 = new WeekDayModel();
		WeekDayModel weekDay7 = new WeekDayModel();
		weekDay1.setWeekDayName("Monday");
		weekDay1.setWeekDayHindiName("Somvar");
		weekDay1.setBehaviour("Good");
		weekDay1.setLordName("shiva");
		
		weekDay2.setWeekDayName("Tuesday");
		weekDay2.setWeekDayHindiName("Mangalwar");
		weekDay2.setBehaviour("Good");
		weekDay2.setLordName("hanuman");
		
		weekDay3.setWeekDayName("Wednesday");
		weekDay3.setWeekDayHindiName("budhwar");
		weekDay3.setBehaviour("Good");
		weekDay3.setLordName("ganesha");
		
		weekDay4.setWeekDayName("Thursday");
		weekDay4.setWeekDayHindiName("veerbar");
		weekDay4.setBehaviour("Good");
		weekDay4.setLordName("sai");
		
		weekDay5.setWeekDayName("Friday");
		weekDay5.setWeekDayHindiName("shukrawar");
		weekDay5.setBehaviour("good");
		weekDay5.setLordName("laxmi");
		
		weekDay6.setWeekDayName("Saturday");
		weekDay6.setWeekDayHindiName("shanivar");
		weekDay6.setBehaviour("Good");
		weekDay6.setLordName("shani");
		
		weekDay7.setWeekDayName("Sunday");
		weekDay7.setWeekDayHindiName("Itwar");
		weekDay7.setBehaviour("Good");
		weekDay7.setLordName("chutti");
		
		sevenDaysofWeek.add(weekDay1);
		sevenDaysofWeek.add(weekDay2);
		sevenDaysofWeek.add(weekDay3);
		sevenDaysofWeek.add(weekDay4);
		sevenDaysofWeek.add(weekDay5);
		sevenDaysofWeek.add(weekDay6);
		sevenDaysofWeek.add(weekDay7);
		
		
		englishNames.addAll(sevenDaysofWeek);
		
		//englishNames = sevenDaysofWeek ;
		
		System.out.println(englishNames);
		
		System.out.println(sevenDaysofWeek);
		TestCustomObjectsInList testInbuiltObjects = new TestCustomObjectsInList();
		sevenDaysofWeek = testInbuiltObjects.updateDays(sevenDaysofWeek);
		System.out.println(sevenDaysofWeek);
		System.out.println(englishNames);
		
	}

	private ArrayList<WeekDayModel> updateDays(ArrayList<WeekDayModel> sevenDaysofWeek) {
		
	/*	Iterator itr = sevenDaysofWeek.iterator();
		
		while(itr.hasNext()){
			
			String day =(String) itr.next();
			
			
		}*/
		
		for(int i = 0 ; i < sevenDaysofWeek.size() ; i++){
			if((i == 1) || (i == 3)){
			WeekDayModel weekDayModel = sevenDaysofWeek.get(i);
			
			WeekDayModel weekDayModelNew = new WeekDayModel();
			if(i == 1){
			weekDayModelNew.setBehaviour("very nice");
			weekDayModelNew.setLordName(weekDayModel.getLordName());
			weekDayModelNew.setWeekDayHindiName("Somvar");
			weekDayModelNew.setWeekDayName("Monday");
			
			sevenDaysofWeek.set(i, weekDayModelNew);
			
		}
			else{
				weekDayModelNew.setBehaviour("very nice");
				weekDayModelNew.setLordName(weekDayModel.getLordName());
				weekDayModelNew.setWeekDayHindiName("Somvar");
				weekDayModelNew.setWeekDayName("Monday");
				
				sevenDaysofWeek.set(i, weekDayModel);
			}
			}
		}
		
		return sevenDaysofWeek;
		
	}

}
