package com.example;

public final class Marcapasos {

    private short Presion; // Presión Sanguínea (0-250)

    // 'byte' porque el rango máximo es 226 y byte puede almacenar hasta 127 Para
    // valores negativos, podemos ajustar la escala sumando 128 a los valores reales
    private byte frecuencia; // Frecuencia cardíaca (0-226)

    private short azucarEnSangre; // Nivel de azúcar en sangre. (0 - 1000)

    // 'int' porque el rango máximo es 3.000.000.000 y int puede almacenar hasta
    // 2^31-1
    private int fuerzaExpuesta; // Máxima fuerza a la que fue expuesto (0-3.000.000.000)

    private float minTiempoEntreLatidos; // Mínimo tiempo entre latidos (0-100 con decimales).

    // 'double' para mayor precisión
    private double bateriaRestante; // Batería restante. (% de batería restante con decimales con la mayor precisión
                                    // posible)

    private char[] codigoFabricante = new char[8]; // Código del Fabricante (Números y letras, máximo 8 caracteres).

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /*
     * short Presion: 2 bytes
     * byte frecuencia: 1 byte
     * short azucarEnSangre: 2 bytes
     * int fuerzaExpuesta: 4 bytes
     * float minTiempoEntreLatidos: 4 bytes
     * double bateriaRestante: 8 bytes
     * char[] codigoFabricante (8 caracteres): 8 * 2 = 16 bytes
     *
     * Sumando todo obtenemos:
     * 2+1+2+4+4+8+16=37 bytes
     */
}
