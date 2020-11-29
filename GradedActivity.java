public class GradedActivity
{
	 private double scoreValue;

	 public void setScore(double s1)
	 {
	 	scoreValue = s1;
	 }

	 public double getScoreOf()
	 {
	 	return scoreValue;
	 }
	 
	 public double getGradeOf()
	 {
	 	char letterGrade;
	
	  if(scoreValue >= 90)
	  	letterGrade = 'A';
	  else if (scoreValue >= 80)
	  	letterGrade = 'B';
	  else if (scoreValue >= 70)
	  	letterGrade = 'C';
	  else if (scoreValue >= 60)
	  	letterGrade = 'D';
	  else 
	  	letterGrade = 'F';

	  return letterGrade;
	 }


}