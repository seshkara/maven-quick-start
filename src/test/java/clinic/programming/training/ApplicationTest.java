package clinic.programming.training;



import org.junit.Before;

import org.junit.Ignore;

import org.junit.Test;

import static org.junit.Assert.*;



public class ApplicationTest {

    private Application app;

    

    @Before

    public void setup() {
		System.out.println("--------setup");

        app = new Application();

    }

    

    

    @Test

    public void testWordCountString() {
		System.out.println("--------testWordCountString");

        int count = app.countWords("this is a test");
		System.out.println("----this is a test----" + count);
        assertTrue(count == 4);

    }



    @Test

    public void testWordCountEmpty() {
System.out.println("--------testWordCountEmpty");		

        int count = app.countWords("");
		System.out.println("----''----" + count);

        assertTrue(count == 0);

    }



    @Test

    public void testWordCountNull() {
		System.out.println("--------testWordCountNull");

        int count = app.countWords(null);
System.out.println("-----null---" + count);
        assertTrue(count == 0);

    }



    @Test

    @Ignore

    public void testWordCountMore() {
		System.out.println("--------testWordCountMore");

        int count = app.countWords("this will be skipped");
System.out.println("----this will be skipped----" + count);
        assertTrue(count == 3);

    }



    @Test

    public void testWordCountSingle() {
		System.out.println("--------testWordCountSingle");

        int count = app.countWords("test");
System.out.println("----test----" + count);
        assertTrue(count == 1);

    }

}