public class Main2 {
    public static void main(String[] args) {
        // Crear objetos de las partes del cuerpo humano
        Corazon corazon = new Corazon("Normal", 72);
        Pulmon pulmon = new Pulmon("Sano", "Izquierdo");
        Higado higado = new Higado("Funcionando", "Rojo");
        Apendice apendice = new Apendice("Intacto", "Inflamado");

        // Crear objeto CuerpoHumano
        CuerpoHumano cuerpoHumano = new CuerpoHumano(corazon, pulmon, higado, apendice);

        // Imprimir valores de las partes y del cuerpo humano
        System.out.println("Cuerpo Humano:");
        System.out.println("Estado del corazón: " + cuerpoHumano.getCorazon().getEstado());
        System.out.println("Ritmo cardíaco: " + cuerpoHumano.getCorazon().getRitmoCardiaco());
        System.out.println("Estado del pulmón: " + cuerpoHumano.getPulmon().getEstado());
        System.out.println("Ubicación del pulmón: " + cuerpoHumano.getPulmon().getUbicacion());
        System.out.println("Estado del hígado: " + cuerpoHumano.getHigado().getEstado());
        System.out.println("Color del hígado: " + cuerpoHumano.getHigado().getColor());
        System.out.println("Estado del apéndice: " + cuerpoHumano.getApendice().getEstado());
        System.out.println("Condición del apéndice: " + cuerpoHumano.getApendice().getCondicion());
    }
}
