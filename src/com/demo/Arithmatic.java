package com.demo;

public class Arithmatic {
    public  int add(int a, int b){
        return a+b;
    }
    public  int sub(int a, int b){
        return a-b;
    } public  int div(int a, int b){
        return a/b;
    } public  int mul(int a, int b){
        return a*b;
    }
    public static  void main(String[] args){
        Arithmatic arithmatic = new Arithmatic();
        System.out.println("Adding two number "+arithmatic.add(5, 3));
        System.out.println("substracting two numbers "+arithmatic.sub(5, 3));
        System.out.println( " multipluying two numbers "+ arithmatic.mul(5, 3));
        System.out.println("Dividing two numbers " +arithmatic.div(5, 3));
    }

}
anil yadav