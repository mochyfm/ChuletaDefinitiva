public class CustomCollection {
    private Object datos[] = null;
    private int numValores = 0;

    public CustomCollection(int capacidadInicial) {
        datos = new Object[capacidadInicial];
    }

    public Object getElement(int posicion) {
        return datos[posicion];
    }

    public int numeroValores() {
        return numValores;
    }

    public void insertar(Object elemento, int posicion) {

        if (numValores == datos.length) {
            Object auxuliar[] = datos;
            datos = new Object[datos.length * 2];

            for (int j = 0; j < numValores; j++) {
                datos[j] = auxuliar[j];
            }

            auxuliar = null;

        }

        for (int j = numValores - 1; j >= posicion; j--) {
            datos[j + 1] = datos[j];
        }

        datos[posicion] = elemento;
        numValores++;

    }

    public int search(Object elemento) {
        for (int i = 0; i < numValores; i++) {
            if (datos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void add(Object elemento) {
        insertar(elemento, numValores);
    }

    public Object delete(int posicion) {
        Object auxiliar = datos[posicion];

        for (int j = posicion; j < numValores - 1; j++) {
            datos[j] = datos[j + 1];
        }

        numValores--;
        return auxiliar;

    }

    @Override
    public String toString() {
        String salida = "";
        for (int i = 0; i < numValores; i++) {
            salida += "[" + getElement(i) + "] ";
        }
        return salida;
    }

}