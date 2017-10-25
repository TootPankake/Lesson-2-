
public class exercise_2 {
	
public static void main(String[]args) {
	int buildSeasonHours;
	String dedicationLevel;
	
	buildSeasonHours = 30;
	
	if (buildSeasonHours >=300)
	{
		dedicationLevel = ("300+ hours: dedication level = dedication on steroids");
	}
	else if (buildSeasonHours >= 200)
	{
		dedicationLevel = ("250+ hours: dedication level = very dedicated");
	}
	else if (buildSeasonHours >= 150)
	{
		dedicationLevel = ("150+ hours: dedication level = really dedicated");
	}
	else if(buildSeasonHours >= 120)
	{
		dedicationLevel = ("120+ hours: dedication level = dedicated");
	}
	else if(buildSeasonHours >= 90)
	{
		dedicationLevel = ("90+ hours: dedication level = average dedication");
	}
	else if(buildSeasonHours >= 50)
	{
		dedicationLevel =  ("50+ hours: dedication level = un-dedicated");
	}
	else
	{
		dedicationLevel = ("Hopefully not me.");
	}
	System.out.println(dedicationLevel);
}

}
/*
Lesson _02
In this exercise, you will use if, else if, and else statements to determine dedication of robotics members depending on build season hours
For example:
300+ hours: dedication level = "dedication on steroids"
200+ hours: dedication level = "very dedicated"
150+ hours: dedication level = "really dedicated"
120+ hours: dedication level = "dedicated"
90+ hours: dedication level = "average dedication"
50+ hours: dedication level = "un-dedicated"
else: dedication level = "Eamon"
Good Luck Completing the exercise!
*/

/*
 * @author Surya
 */