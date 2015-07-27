import java.io.*;

import Heroes.*;

class ProblemTwo {	

  public static void main (String args[]) throws IOException {
	 BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
	 // read number of players
	 int pnumbers=ReadNames.playerN();
	  	  
	 // build team composition
	 Units unit = new Units();
	 PrintTeam team = new PrintTeam();
	 String[] teamcomp = unit.unitComposition(pnumbers);
	 
	 //get skills 
	 String[] playernames =  ReadNames.readFile(pnumbers); 
	 String[][] skills = SkillSet.Skill();	 
	 
	 //print team
	 team.print(teamcomp, playernames, pnumbers, skills);
	
	 //custom name
	 
	 
	 //Print skill dmg for player
	 PrintSkill.printskill(playernames, teamcomp, pnumbers);
	
	 
	 
	 
	 System.out.println("Enter custom name for player? y/n");
	 String input = stdin.readLine();
	 	while (input.equals("y"))
	 	{
		 ReadNames.customname(playernames);
	 
		 //	print new team
		 System.out.println("New Team:");
		 team.print(teamcomp, playernames, pnumbers, skills);
		 System.out.println("Enter another custom name? y/n");
		 input = stdin.readLine();
	 	}
  }
}