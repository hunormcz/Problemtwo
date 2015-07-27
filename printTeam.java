import Heroes.*;

class PrintTeam {
	public void print (String[] team, String[] names, int players, String[][] skills){
		System.out.println("Current Team Composition");
		double totaldmg=0;
		
		double dmg=0;
		for (int i=1; i<= players; i++){
			
			System.out.println(i+". Name: "+ names[i-1]+" ["+team[i-1]+"]");
			System.out.println("Stats - hp:"+HeroStats.hp(team[i-1])+" Dmg:"+HeroStats.dmg(team[i-1])+" Armor:"+HeroStats.armor(team[i-1]));
			
			//get skilldmg for skill 1
			dmg=SkillDmg.dmg(skills[0][i], team[i-1]);
			System.out.println("skill 1: "+skills[0][i]+" Damage: "+dmg);
			totaldmg=totaldmg+dmg;
			
			//get skilldmg for skill 2
			dmg=SkillDmg.dmg(skills[1][i], team[i-1]);
			System.out.println("skill 2: "+skills[1][i]+" Damage: "+dmg);
			totaldmg=totaldmg+dmg;
			}
		
		System.out.println();
		System.out.println("Total Team Damage: "+totaldmg);
	}	
	

}