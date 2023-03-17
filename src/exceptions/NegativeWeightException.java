package exceptions;

public class NegativeWeightException extends RuntimeException{
    public NegativeWeightException(){
        super("el tamaño no es el adecuado");
    }
}
