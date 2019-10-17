package org.array.collections;

public class Exercises {
public static void main(String[] args) {
	int sum=0;
	int a[]=new int[10];
	a[0]=1;
	a[1]=2;
	a[2]=3;
	a[3]=4;
	a[4]=5;
	a[5]=6;
	a[6]=7;
	a[7]=8;
	a[8]=9;
	a[9]=10;
	//to find the sum
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	System.out.println("Total :" + sum);
	//to find the length
	int l=a.length;
	System.out.println("Length:"+l);
	//to find the average
	float avg=(float)sum/a.length;
	System.out.println("Average :"+avg);
}
}
