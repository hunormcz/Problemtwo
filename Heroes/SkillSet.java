package Heroes;


import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;


public class SkillSet{
	public static String[][] Skill() throws FileNotFoundException{
		String[][] skill;
		skill = new String[3][31];
		
		String[] allskills;
		allskills = new String[30];
		
		// Read all skills from file
				String filePath = new File("").getAbsolutePath();
				Scanner inFile1 = new Scanner(new File(filePath+"/src/skills.txt"));
				int i=0;
				
				while (inFile1.hasNext()) {

			    allskills[i] = inFile1.next();
				i++;   
			    }
			    inFile1.close();
					    
				    
				//for (i=0; i<30; i++){
				//System.out.println(i+": "+names[i]);
				//}
						
				
				//Randomize skills to array
				Random rnd = new Random();
				int r = rnd.nextInt(5);
				//boolean notduplicate = false;
				//namesRandom[0]=names[r];
				
				for (i=0; i<30; i++){
					r = rnd.nextInt(5);
					
					skill[0][i]=allskills[r];
					}
				for (i=0; i<30; i++){
					r = rnd.nextInt(5);
						
					skill[1][i]=allskills[r];	
					
					}
					
					
		return(skill);
	}
	
	
}


