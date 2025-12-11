package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CafeEspecialidad {
    private String origen;
    private double temperatura;
    private int tamanio;
    private BigDecimal precio;
    private int intensidad;
    private LocalDate fechaTostado;

    // Constructor vacío
    public CafeEspecialidad() {
        this.origen = "Desconocido";
        this.temperatura = 60;
        this.tamanio = 250;
        this.precio = BigDecimal.valueOf(10000);
        this.intensidad = 5;
        this.fechaTostado = LocalDate.now();
    }

    // Constructor con parámetros
    public CafeEspecialidad(String origen, double temperatura, int tamanio,
                            BigDecimal precio, int intensidad, LocalDate fechaTostado) {
        setOrigen(origen);
        setTemperatura(temperatura);
        setTamanio(tamanio);
        setPrecio(precio);
        setIntensidad(intensidad);
        setFechaTostado(fechaTostado);
    }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen != null ? origen : "N/A"; }

    public double getTemperatura() { return temperatura; }
    public void setTemperatura(double temperatura) { this.temperatura = temperatura >= 0 ? temperatura : 0; }

    public int getTamanio() { return tamanio; }
    public void setTamanio(int tamanio) { this.tamanio = tamanio > 0 ? tamanio : 1; }

    public BigDecimal getPrecio() { return precio; }
    public void setPrecio(BigDecimal precio) {
        if (precio != null && precio.doubleValue() > 0 && precio.doubleValue() < 10000000)
            this.precio = precio;
        else
            this.precio = BigDecimal.ONE;
    }

    public int getIntensidad() { return intensidad; }
    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad >= 1 && intensidad <= 10 ? intensidad : 1;
    }

    public LocalDate getFechaTostado() { return fechaTostado; }
    public void setFechaTostado(LocalDate fechaTostado) {
        if (fechaTostado != null && !fechaTostado.isAfter(LocalDate.now()))
            this.fechaTostado = fechaTostado;
        else
            this.fechaTostado = LocalDate.now();
    }

    @Override
    public String toString() {
        return "CafeEspecialidad{" +
                "origen='" + origen + ''' +
                ", temperatura=" + temperatura +
                ", tamanio=" + tamanio +
                ", precio=" + precio +
                ", intensidad=" + intensidad +
                ", fechaTostado=" + fechaTostado +
                '}';
    }
}
