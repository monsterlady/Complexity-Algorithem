package Exceptions;

public class NoMaxHeapException extends Exception {
    private String msg;

    public NoMaxHeapException(String msg){
        super(msg);
    }
}
