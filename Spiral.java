package solution;

import java.util.Scanner;

class Spiral
{
	//Prints a matrix in spiral format
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int x_dim=in.hasNextInt()?in.nextInt():0;
	int y_dim=in.hasNextInt()?in.nextInt():0;
	int arr[][]=new int[x_dim][y_dim];
//	int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

	for(int indx=0;indx<x_dim;indx++)
		for(int indx2=0;indx2<y_dim;indx2++)
			arr[indx][indx2]=in.nextInt();
	/*
	 * 
eg. Input :
4
4
1  2   3   4
5   6   7   8
9  10 11 12
13 14 15 16 

*/		

	int xmin=0,ymin=0;
	int xmax=arr.length-1,ymax=arr[0].length-1;
	while(xmin<=xmax && ymin<=ymax){
		for(int yindx=ymin;yindx<=ymax;yindx++)
			System.out.print(arr[xmin][yindx]+"\t");
		System.out.println();
		xmin++;
	
		for(int xindx=xmin;xindx<=xmax;xindx++)
			System.out.print(arr[xindx][ymax]+"\t");
		System.out.println();
		ymax--;
		
		for(int yindx=ymax;yindx>=ymin;yindx--)
			System.out.print(arr[xmax][yindx]+"\t");
		System.out.println();
		xmax--;
		
		for(int xindx=xmax;xindx>=xmin;xindx--)
			System.out.print(arr[xindx][ymin]+"\t");
		System.out.println();
		ymin++;
		
		System.out.println("----");
	}
}	

}
