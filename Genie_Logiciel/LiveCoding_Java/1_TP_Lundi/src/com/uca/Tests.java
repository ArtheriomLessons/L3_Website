package com.uca;

import org.junit.jupiter.api.Test;
import java.util.concurrent.Callable;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Tests {
	
    //TODO TestConverter
	@Test
	public void testRomanToNumber(){
		assertThat(RomanConverter.getNumberFromRoman("IV") , equalTo(4));
		
		assertThat(exceptionOf( () -> RomanConverter.getRomanFromNumber(-4) ), instanceOf(IllegalArgumentException.class));
	}


    //Help you to handle exception. :-)
    public static Throwable exceptionOf(Callable<?> callable) {
        try {
            callable.call();
            return null;
        } catch (Throwable t) {
            return t;
        }
    }
}
