
    public class Fila {

        private Fila (){}

        private static Fila instancia = null;

        public static Fila getInstancia(){

            if (instancia == null) {
                instancia = new Fila();
            }
            return instancia;
        }

        public static void ImprimeDocumento(){}

        public static void RemoveDocumento(){}

        public static void RemoveTodosDocumentos(){}

    }
