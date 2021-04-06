
public class Game {
	private int[] rolls = new int[21];
	private int currentRoll = 0;
	
	public void roll(int pins) {
		rolls[currentRoll ++] = pins;
	}

	public int score() {
		int score=0;
		int i = 0;
		int frameIndex = 0;
		for(int frame=0; frame < 10; frame++) {
			if(rolls[i] + rolls[i+1] == 10)//spare
			if(isSpare(frameIndex))//spare
			{
				score += 10 + rolls[i+2];
				i+=2;
				score += 10 + rolls[frameIndex+2];
				frameIndex+=2;
			}else {

				score+=rolls[i] + rolls[i+1];
				i+=2;
				score+=rolls[frameIndex] + rolls[frameIndex+1];
				frameIndex+=2;
			}
		}
		return score;
	}

	protected boolean isSpare(int frameIndex) {
		return rolls[frameIndex] + rolls[frameIndex+1] == 10;
	}

}