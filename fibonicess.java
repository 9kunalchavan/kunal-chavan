package java1;

public class fibonicess {
	public static void main(String[] args) {
		int term=7;
		int first_term=0;
		int second_term=1;
		System.out.println("fibonicc serirs"+term+"numbers");
		
		for(int i=1 ;i<=term;i++) {

			System.out.println(first_term+"   ");{
			int next_term=first_term+second_term;
			first_term=second_term;
			second_term=next_term;
			
			System.out.println("next_term"+term+"number");
			}
		}
	}

}