package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        MyOuterClass myOuterClass = new MyOuterClass();
    
        MyOuterClass.MyInnerClass myInnerClass = myOuterClass.new MyInnerClass();       // This apparently is a rather rare syntax that will never be used due to never needing to
                                                                                        // have to instantiate an inner class object from outside of the outer class object.
        
                                                                                        // However if ever need this is how its done.
        
        myInnerClass.innerNumbers();
        
        myOuterClass.outerNumbers();
    }
}
