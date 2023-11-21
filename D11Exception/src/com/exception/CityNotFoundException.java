package com.exception;

public class CityNotFoundException extends Throwable {
    @Override
    public String getMessage() {
            String s = "Chennai city pincode starts with 6";
            return s;
    }
}
