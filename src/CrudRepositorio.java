import java.util.ArrayList;
import java.util.List;
    public class CrudRepositorio implements  OperacionCrud {

        private List<LocalesComerciales> dataSource;

        public CrudRepositorio() {
            this.dataSource = new ArrayList<>();
        }

        @Override
        public List<LocalesComerciales> listar() {
            return dataSource;
        }

        @Override
        public LocalesComerciales porId(Integer idLocal) {
            LocalesComerciales resultado = null;
            for (LocalesComerciales mas: dataSource) {
                if (mas.getIdLocal() != null && mas.getIdLocal().equals(idLocal)) {
                    resultado = mas;
                    break;
                }
            }
            return resultado;
        }

        @Override
        public void crear(LocalesComerciales localesComerciales) {
            this.dataSource.add(localesComerciales);
        }


        @Override
        public void editar(LocalesComerciales localesComerciales) {
            LocalesComerciales l = this.porId(localesComerciales.getIdLocal());
            l.setNombreLocal(localesComerciales.getNombreLocal());
            l.setDireccionLocal(localesComerciales.getDireccionLocal());
        }

        @Override
        public void eliminar(Integer idLocal) {
            this.dataSource.remove(this.porId(idLocal));
        }

        @Override
        public int total() {
            return this.dataSource.size();
        }

    }
