package lab1;

public class Variant4{
    public int intMethod(int a, int b){
        if (a<b){
            System.out.println("a must be bigger than b");
            return 0;
        }
        else{
            int result;
            result = a/b;
            return result;
        }
    }

    public int ifMethod(int a, int b, int c){
        int result=0;
        if (a>0){
            result+=1;
        }
        if (b>0){
            result+=1;
        }
        if (c>0){
            result+=1;
        }
        return result;
    }
    public double[] forMethod(double price){
    	double result[] = new double[10];
        for (int i = 0; i < 10; i++) {
            result[i]=(i+1)*price;
        }
        return result;
    }
    public int[] arrayMethod(int a, int d,int n){
        int result[];
        result = new int[n];
        int element=a;
        for (int i = 0; i < n; i++) {
            result[i]=element;
            element*=d;
        }
        return result;
    }
    public boolean whileMethod(int a) {
    	
    	if(a<=0) {
    		return false;
    	}
        while (a % 3 == 0) {
            a /= 3;
            if (a / 3 == 1 && a % 2 != 0) {
                return true;
            }
        }
        return false;
    }
    public boolean bolMethod(int a,int b,int c) {
        return (a == b) && (b == c);
    }
    public int caseMethod(int month) {
    	switch (month) {
    	  case 1:
    	    return 31;
    	  case 2:
    		  return 29;
    	  case 3:
    	    return 31;
    	  case 4:
    		  return 30;
    	  case 5:
    		  return 31;
    	  case 6:
    		  return 30;
    	  case 7:
    		  return 31;
    	  case 8:
    		  return 31;
    	  case 9:
    		  return 30;
    	  case 10:
    		  return 31;
    	  case 11:
    		  return 30;
    	  case 12:
    		  return 31;
    	  default:
      		return 0;
    	}
    }
    public int[][] matrixMethod69(int matrix[][], int n, int m, int k) {
    	int result[][] = new int[n+1][m];
    	for(int i=0;i<=k;i++) {
    		for(int j=0;j<m;j++) {
    		result[i][j]=matrix[i][j];
    		}
    	}
        for(int j=0;j<m;j++) {
        	result[k+1][j]=1;
        }
        for(int i=k+1;i<n;i++) {
    		for(int j=0;j<m;j++) {
    		result[i+1][j]=matrix[i][j];
    		}
    	}
    	return result;
    }
}

