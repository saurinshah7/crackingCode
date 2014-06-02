package arrays;
import java.util.*;

public class Transpose {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n of nxn matrix: ");
		Integer n=in.nextInt();
		
		int [][]mat=new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				mat[i][j]=i*n+j+1;
			}
		}
		
		printMatrix(mat);
		transpose(mat);
		System.out.println("Transpose 1");
		printMatrix(mat);
		transpose(mat);
		System.out.println("Transpose 2");
		printMatrix(mat);
		transpose(mat);
		System.out.println("Transpose 3");
		printMatrix(mat);
		transpose(mat);
		System.out.println("Transpose 4");
		printMatrix(mat);
		in.close();
	}
	
	public static void transpose(int [][]mat){
		int n=mat.length;
		for(int i=0;i<n/2;i++){
			int length=n-i*2;
			
			for(int j=0;j<length-1;j++){
				int top=mat[i][i+j];
				mat[i][i+j]=mat[i+length-j-1][i];
				mat[i+length-j-1][i]=mat[i+length-1][i+length-1-j];
				mat[i+length-1][i+length-1-j]=mat[i+j][i+length-1];
				mat[i+j][i+length-1]=top;
			}
		}
	}
	static void printMatrix(int[][] mat){
		for(int i=0;i<mat.length;i++){
			
			String s="";
			for(int j=0;j<mat.length;j++){
				s+=mat[i][j]+"\t";
			}
			System.out.println(s);
		}
	}
	

}
