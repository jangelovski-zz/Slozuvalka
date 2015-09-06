
public class FaultyCompressor {
	public static String compressMe(String input){
		String toReturn = "";
		int brojac = 1;
		for(int i = 0; i < input.length(); i++){
			if(i == input.length()-1){
				if(input.charAt(i) != input.charAt(i-1)){
					toReturn += input.charAt(i) + "1";
				}
				else toReturn += input.charAt(i) + Integer.toString(brojac);
			}
			else if(input.charAt(i) == input.charAt(i+1)){
				brojac++;
			}
			else{
				toReturn += input.charAt(i) + Integer.toString(brojac);
				brojac = 1;
			}
		}
		
		return toReturn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcdefghijklmnopqrstuvwxyz";
		
		String b = compressMe(a);
		
		System.out.print(b);
		//System.out.println(a.length());
	}

}
