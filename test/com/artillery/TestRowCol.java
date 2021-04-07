package com.artillery;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestRowCol {
    RowCol test;

    @BeforeEach // will call this function before every single test due to this notation and will apply them to
    public void setup(){
        FakeInput fakeInput = new FakeInput();
        Output realOutput = new Output();

        test = new RowCol();
        test.getRowCol(fakeInput,realOutput);

    }

    @Test
    public void parsesA1(){
        Assertions.assertEquals(test.getRow(), 0);
        Assertions.assertEquals(test.getColumn(), 0);

    }
//    @Test we ill come back to this bad input scenario. need to learn some more stuff first
//    public void Parse_BadInput_Throws() {
//        Assertions.assertEquals(test.getRow(), 11);
//        Assertions.assertEquals(test.getColumn(), 20);
//        // this becomes assert throws need to update
//
//    }
}
