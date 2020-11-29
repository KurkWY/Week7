public class CourseGradeDemo
{
	
	public static void main (String[] args)
	{
		GradedActivity lowest;
		GradedActivity highest;

		GradedActivity ga= new GradedActivity();

		ga.setScore(80);

		PassFailExam pfe= new PassFailExam(10,3,90);

		Essay e = new Essay(28,19,18,30);

		FinalExam fe= new FinalExam(50, 12);

		CourseGrades coursegrade = new CourseGrades();

		coursegrade.setLab(ga);

		coursegrade.setPassFailExam(pfe);

		coursegrade.setEssay(e);
		coursegrade.setFinalExam(fe);
		System.out.println(coursegrade);
		System.out.println("\n");
		double average;
		average=coursegrade.getAverage();

	System.out.printf("Average of the scores is:\t"+average);
	System.out.printf("Lowest of the score is:\t" +coursegrade.getLowest().getScoreOf());
	System.out.printf("Higest of the score is:\t" +coursegrade.getHighest().getScoreOf());
	}
}