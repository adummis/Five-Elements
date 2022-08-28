package co.com.elements.cartera.ingresoegreso.entity;

public class MovimientoDinero {
    private long idMovimientoDinero;
    private float monto;
    private String conceptoMovimiento;
    private Usuario usuarioMovimiento;
    private boolean estado;

    public long getIdMovimientoDinero() {
        return idMovimientoDinero;
    }

    public void setIdMovimientoDinero(long idMovimientoDinero) {
        this.idMovimientoDinero = idMovimientoDinero;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Usuario getUsuarioMovimiento() {
        return usuarioMovimiento;
    }

    public void setUsuarioMovimiento(Usuario usuarioMovimiento) {
        this.usuarioMovimiento = usuarioMovimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idMovimientoDinero=" + idMovimientoDinero +
                ", monto=" + monto +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", usuarioMovimiento=" + usuarioMovimiento +
                ", estado=" + estado +
                '}';
    }
}
