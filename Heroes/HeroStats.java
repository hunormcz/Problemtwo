package Heroes;

public class HeroStats{
	public static double hp(String type){
		int hp=0;
		switch (type) {
		  case "Tank":
			  hp=900;
		        break;
		  case "Healer":
			  hp=500;
		        break;  
		  case "DPS":
			  hp=700;
		        break;       
		
		}
		return(hp);
	
	}	
	public static double dmg(String type){
		int dmg=0;
		switch (type) {
		  case "Tank":
			  dmg=50;
		        break;
		  case "Healer":
			  dmg=35;
		        break;  
		  case "DPS":
			  dmg=60;
		        break;       
		
		}
		return(dmg);
	
	}	
	
	
	public static int armor(String type){
		int armor=0;
		switch (type) {
		  case "Tank":
			  armor=3;
		        break;
		  case "Healer":
			  armor=1;
		        break;  
		  case "DPS":
			  armor=5;
		        break;       
		
		}
		return(armor);
	
	}
}
//range -5 dmg
class Range extends HeroStats{
		public static double newdmg (String type) {
			return(HeroStats.dmg(type)-5);
		}
	
}
//rage 2x dmg
class Rage extends HeroStats{
	public static double newdmg (String type) {
		return(HeroStats.dmg(type)*2);
	}

}

//Splash dmg + 10%
class Splash extends HeroStats{
	public static double newdmg (String type) {
		return(HeroStats.dmg(type)*1.10);
	}

}

//Avatar dmg + 20%
class Avatar extends HeroStats{
	public static double newdmg (String type) {
		return(HeroStats.dmg(type)*1.20);
	}

}


//Berzerk dmg +40
class Berzerk extends HeroStats{
	public static double newdmg (String type) {
		return(HeroStats.dmg(type)+40);
	}

}

//Skillset:
//
//- range: -5 dmg
//- splash: +10%
//- rage: +2xdmg
//- berzerk + 50dmg
//- Avatar + 20%;
