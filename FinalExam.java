public class FinalExam extends GradedActivity
{
	private int numOfQuestions;
	private double pointsOfEach;
	private int numOfMissed;

	public FinalExam(int questions, int missed)
	{
		double numericScoreValue;
		numOfQuestions = questions;
		numOfMissed = missed;
		pointsOfEach = 100.0/ questions;
		numericScoreValue = 100.0- (missed * pointsOfEach);
		setScore(numericScoreValue);
	}
	public double getPointsOfEach()
	{
		return pointsOfEach;
	}
	public int getNumOfMissed()
	{
		return numOfMissed;
	}
}