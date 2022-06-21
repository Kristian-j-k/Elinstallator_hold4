package com.elinstallator_hold4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VerificationChartTest {

    @Test
    public void VcStringTest(){

        VerificationChart vc1 = new VerificationChart();
        vc1.address = "gadenavn 5";

        assertEquals("gadenavn 5",vc1.address);

    }

}
