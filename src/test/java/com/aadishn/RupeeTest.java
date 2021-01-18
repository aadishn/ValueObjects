package com.aadishn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RupeeTest {
//AssertSame checks for different objects.
    /*    @Test
    void shouldReturnTrueIfTwoObjectsWithSameValuesAreSameUsingAssertSame() {
        assertSame(new Rupee(10),new Rupee(10));
    }
*/
    @Test
    void shouldTestIfTwoObjectsWithSameValuesAreSameUsingAssertTrue() {
        assertTrue(new Rupee(10).equals( new Rupee(10)));
    }

    @Test
    void shouldTestIfTwoObjectsWithDifferentValuesAreNotEqualUsingAssertNotEquals() {
        assertNotEquals(new Rupee(10),new Rupee(5));
    }


}
