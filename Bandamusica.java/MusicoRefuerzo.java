package dominio;

import java.math.BigDecimal;

public class MusicoRefuerzo extends Musico {
    private BigDecimal pago;

    public MusicoRefuerzo(String nombre, String instrumento, BigDecimal pago) {
        super(nombre, instrumento);
        this.pago = pago;
    }

    public BigDecimal getPago() {
        return pago;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + pago + " €";
    }
}
