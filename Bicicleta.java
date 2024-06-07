// Caso 1: Bicicleta

// Modelar una estructura de clases, incluyendo AL MENOS las siguientes entidades: Bicicleta, Rueda, Cuadro.
// De entre las tres entidades, seleccionar cual representa al TODO y cuales a los componentes.
// Para cada entidad, considerar AL MENOS tres atributos y los correspondientes setters y getters.
// Indicar cuáles entidades son atributos del TODO.
// Indicar si las relación entre estas tres entidades es AGREGACION o es COMPOSICION. Justificar la respuesta.
// Hacer un programa donde se un objeto del tipo de la clase TODO, a través del cual se utilicen sus partes y los atributos de esas partes.
// Capturar e imprimir los valores de AL MENOS UN ATRIBUTO de cada parte y del todo.

public class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera, Cuadro cuadro) {
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
        this.cuadro = cuadro;
    }

    // Getters y setters
    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public void setRuedaDelantera(Rueda ruedaDelantera) {
        this.ruedaDelantera = ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public void setRuedaTrasera(Rueda ruedaTrasera) {
        this.ruedaTrasera = ruedaTrasera;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }
}

class Rueda {
    private String color;
    private int tamaño;

    public Rueda(String color, int tamaño) {
        this.color = color;
        this.tamaño = tamaño;
    }

    // Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}

class Cuadro {
    private String material;
    private String tamaño;

    public Cuadro(String material, String tamaño) {
        this.material = material;
        this.tamaño = tamaño;
    }

    // Getters y setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
