public class DivisaoNaoExataException extends Throwable {

    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message); // Passa a mensagem para a superclasse
        this.numerador = numerador;
        this.denominador = denominador;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + ": " + numerador + " / " + denominador;
    }
}