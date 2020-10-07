package com.uca;

import org.junit.jupiter.api.Test;
import java.util.concurrent.Callable;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Tests {
    @Test
	public void TestConverter(){
		assertThat(RomanConverter.getRomanFromNumber(4), equalTo("IV"));
		assertThat(RomanConverter.getRomanFromNumber(1), equalTo("I"));
		
		assertThat(exceptionOf(() -> RomanConverter.getRomanFromNumber(-1)), instanceOf(IllegalArgumentException.class));
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
