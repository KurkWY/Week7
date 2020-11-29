public class PassFailExam extends PassFailActivity
{
	private int numOfQuestions;
	private double pointsOfEach;
	private int numOfMissed;

	public PassFailExam(int questions, int missed, double minPassing)
	{
		double numericScoreValue;
		numOfQuestions = questions;
		numOfMissed = missed;
		pointsOfEach = 100.0/ questions;
		numericScoreValue = 100.0 -(missed * pointsOfEach);
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