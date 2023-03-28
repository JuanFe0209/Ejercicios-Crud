public class LocalesComerciales {
    private Integer idLocal;
    private String nombreLocal;
    private String direccionLocal;

    public LocalesComerciales(Integer idLocal, String nombreLocal, String direccionLocal) {
        this.idLocal = idLocal;
        this.nombreLocal = nombreLocal;
        this.direccionLocal = direccionLocal;
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public String getDireccionLocal() {
        return direccionLocal;
    }

    public void setDireccionLocal(String direccionLocal) {
        this.direccionLocal = direccionLocal;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        LocalesComerciales.ultimoId = ultimoId;
    }

    private static int ultimoId;

    @Override
    public String toString() {
        return "LocalesComerciales{" +
                "idLocal=" + idLocal +
                ", nombreLocal='" + nombreLocal + '\'' +
                ", direccionLocal='" + direccionLocal + '\'' +
                '}';
    }
}

