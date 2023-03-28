import java.util.List;
    public interface OperacionCrud {
        List<LocalesComerciales> listar();
        LocalesComerciales porId(Integer idLocal);
        void crear(LocalesComerciales localesComerciales);
        void editar(LocalesComerciales localesComerciales);
        void eliminar(Integer idLocal);
        public int total();
    }

