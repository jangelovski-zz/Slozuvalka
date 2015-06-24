public class TheSubsequences {

	
	public static int count(int A, int B, int C) {

		int rezultat = 0;
		//int flag;
		if(!(A < C && B < C) && !((B - A) < C)){
		for (int i = A; i <= B; i++) {
			int flag = 0;
			int temp = i;
			int temp1 = C;

			while(temp > 0)
			{
				if(temp % 10 == temp1 % 10)
				{
					temp = temp / 10;
					temp1= temp1/ 10;
				}
				else{
					temp = temp / 10;
				} 
				if(temp1 == 0){
					flag = 1;
				} else flag = 0;
			}
			if (flag == 1)
				rezultat++;
		}
		}
		return rezultat;
	}

	public static void main(String[] args) {

		System.out.println(count(372830, 483964, 4458));
		// TODO Auto-generated method stub
	}

}
