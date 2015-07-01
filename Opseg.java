
/*
Дадена е равенката: x2+s(x)+200·x=N каде што x, N се природни броеви, а s(x) е функција која што го дава збирот 
на цифри на бројот x. Даден е и бројот N и два природни броеви A и B, каде што A≤B и A, B≤1,000,000,000. Потребно е 
да проверите дали постои природен број x во опсегот [A, B] така што е задоволена равенката, и ако постои тогаш треба да 
се врати како резултат. Ако таков природен број x во опсегот [A, B] што ја задоволува равенката не постои, тогаш се враќа -1.

Име на класата: Range
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Range {
    static long zbir_cifri(long n)
    {
        long zbir = 0;
        while(n > 0)
        {
            zbir += n % 10;
            n /= 10;
        }
        return zbir;
    }
   	
    static long proveri(long N, long A, long B) {
        // Vasiot kod tuka
        long zname = -1;
        for(long i = A; i <= B; i++)
        {
        	
            long rezultat = (200 * i) + zbir_cifri(i) + (i * i);
            if(rezultat == N) 
            {
                zname = i;
                break;
            }
        }
		return zname;
    }
    
    public static void main(String[] args) throws Exception {
        int i,j,k;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long N = Long.parseLong(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        
        long res = proveri(N, A, B);
        System.out.println(res);
        
        br.close();
        
    }
    
}
