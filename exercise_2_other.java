/*
Lesson _02
In this exercise, you will use if statements, relational and logical operators to complete this exercise.
In this exercise you will use 6 booleans to determine if the robot is Moving forward, backward, right or left
For example:
if(rightMotorMovingForward && leftMotorMovingForward)
{
	movingStatus = "Robot is moving forward";
}
if(rightMotorMovingForward && leftMotorMovingBackward)
{
	movingStatus = "Robot is spinning towards the right";
}
Good Luck Completing the exercise!
Clue:
Only one right side motor and left side motor boolean can be set to true. So for example: If rightMotorMovingForward = true; rightMotorMovingBackward and rightMotorNotMoving should be set to false.
This is because if the rightMotor is moving forward, then the rightMotor can't be moving backward or not moving.
*/

/*
 * @author Surya
 */

public class exercise_2_other 
{
	public static void main(String[] args) 
	{
		 boolean rightMotorMovingForward, leftMotorMovingForward, rightMotorMovingBackward, leftMotorMovingBackward, rightMotorNotMoving, leftMotorNotMoving;
		 String movingStatus = null;
		 
		 rightMotorMovingForward = true; 
		 leftMotorMovingForward = false; 
		 rightMotorMovingBackward = false;
		 leftMotorMovingBackward = true;
		 rightMotorNotMoving = false; 
		 leftMotorNotMoving = false;
		 
		 if (rightMotorMovingForward && leftMotorMovingForward)
		 {
			 movingStatus = ("The robot is moving forward.");
		 }
		 else if (rightMotorMovingForward &&  leftMotorNotMoving)
		 {
			 movingStatus = ("The robot is moving right.");
		 }
		 else if (rightMotorNotMoving && leftMotorMovingForward)
		 {
			 movingStatus = ("The robot is moving left.");
		 }
		 else if (rightMotorMovingForward && leftMotorMovingBackward)
		 {
			 movingStatus = ("The robot is spinning counter clockwise.");
		 }
		 else if (rightMotorMovingBackward && leftMotorMovingForward)
		 {
			 movingStatus = ("The robot is spinning clockwise.");
		 }
		 else if (rightMotorMovingBackward && leftMotorNotMoving)
		 {
			 movingStatus = ("The robot is reversing to the right.");
		 }
		 else if (rightMotorNotMoving && leftMotorMovingBackward)
		 {
			 movingStatus = ("The robot is reversing to the left.");
		 }
		 else if (rightMotorMovingBackward && leftMotorMovingBackward)
		 {
			 movingStatus = ("The robot is reversing.");
		 }
		 
		 System.out.println(movingStatus);
		 
	}

}

