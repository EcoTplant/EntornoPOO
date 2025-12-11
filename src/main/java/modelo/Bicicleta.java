package modelo;

import java.time.LocalDate;

public class Bicicleta {
    private String marca;
    private String tipo;
    private double peso;
    private boolean tieneSuspension;
    private int cambios;
    private LocalDate fechaCompra;

    public Bicicleta() {
        this.marca = "Sin marca";
        this.tipo = "Ruta";
        this.peso = 10;
        this.tieneSuspension = false;
        this.cambios = 7;
        this.fechaCompra = LocalDate.now();
    }

    public Bicicleta(String marca, String tipo, double peso, boolean tieneSuspension,
                     int cambios, LocalDate fechaCompra) {
        setMarca(marca);
        setTipo(tipo);
        setPeso(peso);
        setTieneSuspension(tieneSuspension);
        setCambios(cambios);
        setFechaCompra(fechaCompra);
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca != null ? marca : "N/A"; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo != null ? tipo : "N/A"; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso > 0 ? peso : 1; }

    public boolean isTieneSuspension() { return tieneSuspension; }
    public void setTieneSuspension(boolean tieneSuspension) { this.tieneSuspension = tieneSuspension; }

    public int getCambios() { return cambios; }
    public void setCambios(int cambios) { this.cambios = cambios > 0 ? cambios : 1; }

    public LocalDate getFechaCompra() { return fechaCompra; }
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra != null ? fechaCompra : LocalDate.now();
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + ''' +
                ", tipo='" + tipo + ''' +
                ", peso=" + peso +
                ", tieneSuspension=" + tieneSuspension +
                ", cambios=" + cambios +
                ", fechaCompra=" + fechaCompra +
                '}';
    }
}
