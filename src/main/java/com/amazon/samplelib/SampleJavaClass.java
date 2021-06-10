package com.amazon.samplelib;
/**
 * SampleJavaClass.
 */
public class SampleJavaClass {
    /**
     * Sample method.
     * @return a placeholder string
     */
    public String sampleMethod() {
        return "sampleMethod() called!";
    }
    
    private void foo(String p) {
       String s = "aloha";
       System.out.println(String.format("This is a faulty message: %i", s));
       System.out.format("No %s",1);
       if ("1" == "2") {
            //dosomething
       }
        
       if ("2" == "4") {
            //dosomething
       }
        
       if ("3" == "4") {
            //dosomething
       }
    }
}
