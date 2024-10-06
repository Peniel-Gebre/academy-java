package com.bptn.course._14_custome_exception._03_custom_exception_3;

//InvalidOrderException.java
public class InvalidOrderException extends Exception {
private static final long serialVersionUID = 1L;

public InvalidOrderException(String message) {
 super(message);
}
}