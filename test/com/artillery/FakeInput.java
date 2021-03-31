package com.artillery;

public class FakeInput implements InputAbstraction{
    @Override
    public String readIn(String prompt) {
        return "A1"; //spoofing input
    }
}
