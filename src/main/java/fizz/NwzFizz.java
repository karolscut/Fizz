package fizz;

public class NwzFizz {
	
	int iNUm;
	
	public static int doFizz(int num) {
		return num % 3;
	}
	
	public static int doBuzz(int num) {
		return num % 5;
	}
	
	public void doFizzBuzz() {
		
	}
	
	public static boolean isFizz(int num) {
		if(doFizz(num) == 0 || String.valueOf(num).contains("3")) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public static boolean isBuzz(int num) {
		if(doBuzz(num) == 0 || String.valueOf(num).contains("5")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFizzBuzz(int num) {
		if(isFizz(num) && isBuzz(num)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		for(int i=1;i<100;i++) {
			
//			switch()
			
			if(isFizz(i) && !(isBuzz(i))) {
				System.out.println(i+"---------"+"fizz");;
			} else {
				if (!(isFizz(i)) && isBuzz(i)) {
					System.out.println(i+"---------"+"buzz");
				} else {
					if(isFizz(i) && isBuzz(i)) {
						System.out.println(i+"----------"+"fizzBuzz");
					} else {
						System.out.println(i);
					}
				}
			}
			
			
		}
		
	}

}
