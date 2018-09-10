package com.lavi.tech;
class A
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}
class B extends A
{
    // overriding m1()
    /*void m1()
    {
        System.out.println("Inside B's m1 method");
    }*/
}
class C extends A
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside C's m1 method");
    }
}
// Driver class
public class Dispatch
{
    public static void main(String args[])
    {
        
        A a = new B();
        a.m1();
        /*B b = new B();
        b.m1();*/
        
        
    }
}