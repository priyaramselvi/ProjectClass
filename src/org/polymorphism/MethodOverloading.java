package org.polymorphism;

public class MethodOverloading {
public static void college(String name) {
	System.out.println("College name is "+name);
}
public static void college(String course,int courseSize) {
	System.out.println("Course name is "+course+"\n"+"Course intake size is "+courseSize);
}
public static void main(String[] args) {
	MethodOverloading M = new MethodOverloading();
	M.college("KCT");
	M.college("TXT", 66);
}
}
