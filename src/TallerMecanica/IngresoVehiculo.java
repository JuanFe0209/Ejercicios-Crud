package TallerMecanica;

public class IngresoVehiculo {
    Integer idVehiculo;
    String nombreDueño;
    String tipoVehiculo;
    String marcaVehiculo;
    String problemaVehiculo;

    public IngresoVehiculo(Integer idVehiculo, String nombreDueño, String tipoVehiculo, String marcaVehiculo, String problemaVehiculo) {
        this.idVehiculo = idVehiculo;
        this.nombreDueño = nombreDueño;
        this.tipoVehiculo = tipoVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.problemaVehiculo = problemaVehiculo;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public String getProblemaVehiculo() {
        return problemaVehiculo;
    }

    public void setProblemaVehiculo(String problemaVehiculo) {
        this.problemaVehiculo = problemaVehiculo;
    }

    @Override
    public String toString() {
        return "IngresoVehiculo{" +
                "idVehiculo=" + idVehiculo +
                ", nombreDueño='" + nombreDueño + '\'' +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                ", marcaVehiculo='" + marcaVehiculo + '\'' +
                ", problemaVehiculo='" + problemaVehiculo + '\'' +
                '}';
    }
}
