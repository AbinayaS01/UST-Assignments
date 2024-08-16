package Arrays;

public class multiply {

	public static void main(String[] args) {
		int m1 = 2, m2 = 2, n1 = 2, n2 = 2;
	    int mat1[][] = new int[][] { { 1, 1 }, { 2, 2 } };
	    int mat2[][] = new int[][] { { 1, 1 }, { 2, 2 } };
	    int result[][]=new int[m1][m2];
	    for(int i=0;i<m1;i++) {
	    	for(int j=0;j<n2;j++) {
	    		result[i][j]=0;
	    		for(int k=0;k<m2;k++) {
	    			result[i][j]+=mat1[i][k]*mat2[k][j];
	    		}
	    	}
	    }
	    for (int i = 0; i < m1; i++) {
	        for (int j = 0; j < n2; j++) {
	          System.out.print(result[i][j] + " ");
	        }
	        System.out.println();
	      }
	    }

	}


