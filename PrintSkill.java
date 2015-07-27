import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import Heroes.*;

class PrintSkill{

public static void printskill(String[] names, String[] team, int players) throws IOException{
		String input = null; 
		String name=null;
		String skill=null;
		double dmg=0;
		BufferedReader stdin = new BufferedReader ( new InputStreamReader( System.in ) );
		Boolean valid=false;
		
	//read input
	System.out.println("Enter Name and Skill for details: (name.skill), 'n' to cancel");
	//validate input
	input = stdin.readLine();
	if (input.equals("n")){valid=true;}
	while (!valid)
	{
				input = stdin.readLine();
				//split string
				if (input != null && !input.isEmpty()){
					  
					String[] parts = input.split(Pattern.quote("."));
					name = parts[0];
					try {
					skill = parts[1];
					} catch (Exception e) {
						// TODO: handle exception
					} 
					  
				//find player	  
				for (int i=0; i< players; i++){
						  if (names[i].equals(name)){
							valid=true;  
						  dmg=SkillDmg.dmg(skill, team[i]);	
						  
						  }
					  }
						  
					  }
		
		//error message invalid input
		if (!valid) 
		{
		System.out.println("Invalid input! Please enter name and skill in the following format: playername.skillname ");	
		}
		else{System.out.println(name+"-Skill "+skill+" Damage: "+dmg);}
	}
				  
				
		
	
	}
	
}