
public class TableTennisScore {
	public static String whoWon(String score)
	{
		String player1;
		String player2;
		
		String[] oddelno = score.split("\\s");
		
		if(oddelno[0].equals("Anna")){
			player1 = "Anna";
			player2 = "Peter";
		}
		else{
			player1 = "Peter";
			player2 = "Anna";
		}
		int pl1wins = 0;
		int pl2wins = 0;
		String winner;
		for(int i = 2; i < oddelno.length; i++)
		{
			String[] rez = oddelno[i].split(":");
			int scorePlayer1 = Integer.parseInt(rez[0]);
			int scorePlayer2 = Integer.parseInt(rez[1]);
			if(scorePlayer1 > scorePlayer2)
			{
				pl1wins++;
			} else pl2wins++;
		}
		String score1;
		if(pl1wins > pl2wins)
		{
			winner = player1;
			score1 = Integer.toString(pl1wins) + ":" + Integer.toString(pl2wins);
		} 
		else {
			winner = player2;
			score1 = Integer.toString(pl2wins) + ":" + Integer.toString(pl1wins);
		}
		return winner + " " + score1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String score = "Peter Anna 19:21 21:18 10:21 21:14 13:21 10:21 13:21 21:17 16:21";
		System.out.println(whoWon(score));
	}
}
