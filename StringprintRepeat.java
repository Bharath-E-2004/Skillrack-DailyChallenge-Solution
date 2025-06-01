import java.util.;

public class StringPrintRepaet {

public static void main(String[] args) {

Scanner scenew Scanner(System.in);

String name=sc.nextLine(),digit sc.nextLine();

for(int i=0;i<name.length();i++)

     System.out.println(name.substring(0,i+1).repeat(Character getNumericValue(digit.charAt(i))));

System.exit(0); 
   }
}
/*
Explanation:

Here S1 asdf and S2 = 4921. a -> a is printed 4 times.

asasasasasasasasas -> as is printed 9 times.

asdasd -> asd is printed 2 times.

asdf -> asdf is printed once.

Example Input/Output 2:

Input:

SkillRack

132498454

Output:

S

SkSkSk

SkiSki

SkilSkilSkilSkil

SkillSkillSkillSkillSkillSkillSkillSkillSkill

SkillRSkillRSkillRSkill RSkill RSkill RSkillRSkillR

Skill RaSkill RaSkill RaSkillRa

Skill RacSkill RacSkill RacSkill RacSkill Rac

Skill RackSkill RackSkill RackSkill Rack
/*
