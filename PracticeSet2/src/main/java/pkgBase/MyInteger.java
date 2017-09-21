package pkgBase;

public class MyInteger {

	private int iValue;
	
	public MyInteger(int iValue) {
		
		this.iValue = iValue;
	}

	

	public int getiValue() {
		return iValue;
	}

	
	public boolean isEven() {
		
		return (getiValue() % 2 == 0);
			
	}

	public boolean isOdd() {
		
		return !isEven();
		
	}

	public boolean isPrime() {
	    int i;
	    int num = getiValue();
	    for (i = 2; i < num; i++) {
	        if (num % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static boolean isEven(int n) {
		
		return ((n % 2) == 0);
	}

	public static boolean isOdd(int n ) {
		
		return isEven(n);
		
	}
	
	public static boolean isPrime(int n) {
		
		int i;
		
		for (i =2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(MyInteger n) {
		
		return (n.getiValue() % 2 == 0);
	}
	
	public static boolean isOdd(MyInteger n) {
		
		return isEven(n);
	}
	
	public static boolean isPrime(MyInteger n) {
		
		int i;
		int num = n.getiValue();
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean equals(int i) {
		
		return (this.iValue == i);
		
	}
	
	public boolean equals(MyInteger n) {
		
		return (this.iValue == n.getiValue());
		
	}
	
	
	
}


