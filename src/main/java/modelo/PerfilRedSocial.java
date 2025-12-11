package modelo;

import java.time.LocalDate;

public class PerfilRedSocial {
    private String alias;
    private int seguidores;
    private int siguiendo;
    private boolean verificado;
    private String biografia;
    private LocalDate fechaRegistro;

    public PerfilRedSocial() {
        this.alias = "usuario";
        this.seguidores = 0;
        this.siguiendo = 0;
        this.verificado = false;
        this.biografia = "";
        this.fechaRegistro = LocalDate.now();
    }

    public PerfilRedSocial(String alias, int seguidores, int siguiendo,
                           boolean verificado, String biografia, LocalDate fechaRegistro) {
        setAlias(alias);
        setSeguidores(seguidores);
        setSiguiendo(siguiendo);
        setVerificado(verificado);
        setBiografia(biografia);
        setFechaRegistro(fechaRegistro);
    }

    public String getAlias() { return alias; }
    public void setAlias(String alias) { this.alias = alias != null ? alias : "N/A"; }

    public int getSeguidores() { return seguidores; }
    public void setSeguidores(int seguidores) { this.seguidores = seguidores >= 0 ? seguidores : 0; }

    public int getSiguiendo() { return siguiendo; }
    public void setSiguiendo(int siguiendo) { this.siguiendo = siguiendo >= 0 ? siguiendo : 0; }

    public boolean isVerificado() { return verificado; }
    public void setVerificado(boolean verificado) { this.verificado = verificado; }

    public String getBiografia() { return biografia; }
    public void setBiografia(String biografia) { this.biografia = biografia != null ? biografia : ""; }

    public LocalDate getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro != null ? fechaRegistro : LocalDate.now();
    }

    @Override
    public String toString() {
        return "PerfilRedSocial{" +
                "alias='" + alias + ''' +
                ", seguidores=" + seguidores +
                ", siguiendo=" + siguiendo +
                ", verificado=" + verificado +
                ", biografia='" + biografia + ''' +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
}
