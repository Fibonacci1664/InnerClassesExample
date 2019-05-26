package com.davegreen;

public class MyOuterClass
{
    private int x;
    private int y;
    
    MyInnerClass myInnerClass = new MyInnerClass();
    
    public MyOuterClass()
    {
        this.x = 5;
        this.y = 10;
    }
    
    public void outerNumbers()
    {
        System.out.println("###############################");
        System.out.println("Time to call the innerNumbers method!");
        myInnerClass.innerNumbers();
        System.out.println("###############################");
    
    }
    
    class MyInnerClass
    {
        private int a;
        private int b;
    
        public MyInnerClass()
        {
            this.a = 15;
            this.b = 20;
        }
        
        public int innerNumbers()
        {
            if(x < b)
            {
                System.out.println("Outer class x is less than inner class b!");
            }
            
            return 1;
        }
        
    }
    
}
