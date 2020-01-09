package Exceptions;

public class NoMinHeapException extends Exception {
    private String msg;

    public NoMinHeapException(String msg){
        super(msg);
    }
}
