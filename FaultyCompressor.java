
public class FaultyCompressor {
	public static String compressMe(String input){
		String toReturn = "";
		int brojac = 1;
		for(int i = 0; i < input.length(); i++){
			if(i == input.length()-1){ // proverka dali i e dojden do poslednio char
				if(input.charAt(i) != input.charAt(i-1)){ //ako e dojden i ako != na prethodnio znaci sam e
					toReturn += input.charAt(i) + "1"; // dodavas go charo i + dodavas 1 oti e sam
				}
				else toReturn += input.charAt(i) + Integer.toString(brojac); // ako e ist kako prethodnite dodadi go kako obicno
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
