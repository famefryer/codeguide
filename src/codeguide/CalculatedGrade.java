package codeguide;

//Exercise 1
//TODO From the YAGNI.Find and delete the method that useless for now.If this program is create for contain score and calculated score to the grade the score.
public class CalculatedGrade {
	private double score;
	private String gradeInChar;
	private String name;

	public CalculatedGrade(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void upScore() {
		this.score += 10;
	}

	public String calculatedGrade(double score) {
		this.score=score;
		if (this.score < 50) {
			return "F";
		}
		if (this.score < 60) {
			return "D";
		}
		if (this.score < 70) {
			return "C";
		}
		if (this.score < 80) {
			return "B";
		}
		return "A";
	}

	public void fixScore(double fix) {
		this.score = this.score + fix;
	}

}
