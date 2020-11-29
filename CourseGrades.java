public class CourseGrades implements Analyzable
{
	private GradedActivity[] grades = new GradedActivity[4];

	public void setLab(GradedActivity ga)
	{
		grades[0]=ga;
	}
	public void setPassFailExam(PassFailExam fe)
	{
		grades[1] = fe;
	}
	public void setEssay(Essay e)
	{
		grades[2] = e;
	}
	public void setFinalExam(FinalExam fe)
	{
		grades[3] = fe;
	}
	public String toString()
	{
		return"Lab:\n" + "Score"
		+",Grade:" +grades[0].getGradeOf()
		+"\n\nPassFailExam:\n" + "Score: "
		+grades[1].getScoreOf() +", Grade:"
		+grades[1].getGradeOf()
		+"\n\nEssay:\n"
		+"Score: " + grades[2].getScoreOf()
		+", Grade: " + grades[2].getGradeOf()
		+"\n\nFinalExam:\n" + "Score:"
		+grades[3].getScoreOf() + ", Grade:"
		+grades[3].getGradeOf();
	}
	public double getAverage()
	{
		double total =0;
		for(int i = 0; i < grades.length; i++)
		{
			total+= grades[i].getScoreOf();
		}
		double average = total/grades.length;
		return average;
	}
	public GradedActivity getHighest()
	{
		GradedActivity highest = grades[0];
		for(int i=0;i< grades.length;i++)
		{
			if(grades[i].getScoreOf() > highest.getScoreOf())
				highest = grades[i];
		}
		return highest;
	}
	public GradedActivity getLowest()
	{
		GradedActivity lowest = grades[0];
		for(int i = 0; i < grades.length; i ++)
		{
			if(grades[i].getScoreOf()<lowest.getScoreOf())
				lowest = grades[i];
		}
		return lowest;
	}
}