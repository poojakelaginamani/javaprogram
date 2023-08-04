package com.xworkz.runner;

import com.xworkz.app.army.Airport;
import com.xworkz.app.army.AirportRules;
import com.xworkz.app.army.ArmyRule;
import com.xworkz.app.army.GeneralRule;
import com.xworkz.app.army.HospitalRule;
import com.xworkz.app.army.Hostel;
import com.xworkz.app.army.HostelRules;
import com.xworkz.app.army.MetroRule;
import com.xworkz.app.army.Pub;
import com.xworkz.app.army.PubRules;
import com.xworkz.app.army.Rules;
import com.xworkz.app.army.Temple;
import com.xworkz.app.army.TemplesRule;
import com.xworkz.app.army.Theater;
import com.xworkz.app.army.TheaterRules;
import com.xworkz.app.army.VTU;
import com.xworkz.app.army.VtuRules;
import com.xworkz.app.army.metro;

public class Runners {
 public static void main(String[] args) {
	 System.out.println("ARMY RULES");
	   
	ArmyRule army = new GeneralRule(); 
	army.getHairCut();
	army.getUniforms();
	System.out.println("Everyone should talk :"+army.everyone_should_talk);
	System.out.println("**************************************");
	   
	System.out.println("AIRPORT RULES");   
    Airport air = new AirportRules();
    air.getLimitsLiquids();
    air.getBodyScanners();
    System.out.println("Must bring Passport:"+air.should_have_passports);
    System.out.println("**************************************");
    
    System.out.println("HOSPITAL RULES");
    HospitalRule hospital=new Rules();
    hospital.getFee();
    hospital.getMedicine();
    System.out.println("Follow some rules:"+hospital.keep_silent);
    System.out.println("**************************************");
    
    System.out.println("HOSTEL RULES");
    Hostel rule = new HostelRules();
    rule.getDonotDoRagging();
    rule.getFee();
    System.out.println("Maintances times:"+rule.Launch_time);
    System.out.println("**************************************");
    
    
    System.out.println("METRO RULES");
   metro metrorule = new MetroRule();
   metrorule.getCoins();
   metrorule.getWithinTime();
   System.out.println("Follow metro rules:"+metrorule.buy_tickets);
   System.out.println("**************************************");
   
   System.out.println("PUB RULES");
   Pub pubrule = new PubRules();
   pubrule.dontDurgs();
   pubrule.getPartner();
   System.out.println("Follow pub rules:"+pubrule.Open_Time);
   System.out.println("**************************************");
   
   System.out.println("TEMPLE RULES");
   Temple temple = new TemplesRule();
   temple.getDontTakePicture();
   temple.getKeepSilent();
   System.out.println("Follow rules:"+temple.donot_partywear_dress);
   System.out.println("**************************************");
   
   System.out.println("THEATER RULES");
   Theater theater = new TheaterRules();
   theater.donttake_Outside_Food();
   theater.getMaintance_Clean();
   System.out.println("Follow rules:"+theater.fees_tickets);
   System.out.println("**************************************");
   
   System.out.println("VTU RULES");
   VTU vturule = new VtuRules();
   vturule.getPass();
   vturule.getStudent_Info();
   System.out.println("Follow rules:"+vturule.HeadQuarter);
   
   
}
}