public class Essay extends GradedActivity
{
	private int grammars;
	private int spellings;
	private int correctLengths;
	private int contents;

	public Essay(int egrammar, int espelling, int ecorrctLength, int econtent)
	{
		grammars = egrammar;
		spellings= espelling;
		correctLengths = ecorrctLength;
		contents = econtent;
		setScore(grammars + spellings + correctLengths + contents);
	}
}