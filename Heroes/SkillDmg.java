package Heroes;

public class SkillDmg{
public static double dmg (String skill, String type){
double dmgmod=0;
	switch (skill){
			case "Range":
				dmgmod=Range.newdmg(type);
				break;
			case "Rage":
				dmgmod=Rage.newdmg(type);
				break;	
			case "Berzerk":
				dmgmod=Berzerk.newdmg(type);
				break;	
			case "Avatar":
				dmgmod=Avatar.newdmg(type);
				break;	
			case "Splash":
				dmgmod=Splash.newdmg(type);
				break;
}
return(dmgmod);
}


}