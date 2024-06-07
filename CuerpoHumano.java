// Caso 2: Cuerpo humano

// Modelar una estructura de clases, incluyendo AL MENOS las siguientes entidades: CuerpoHumano, Corazon, Pulmon, Higado, Apendice.
// De entre las tres entidades, seleccionar cual representa al TODO y cuales a los componentes.
// Para cada entidad, considerar AL MENOS tres atributos y los correspondientes setters y getters.
// Indicar cuáles entidades son atributos del TODO.
// Indicar si las relación entre estas cinco entidades es AGREGACION o es COMPOSICION. Justificar la respuesta.
// Hacer un programa donde se un objeto del tipo de la clase TODO, a través del cual se utilicen sus partes y los atributos de esas partes.
// Capturar e imprimir los valores de AL MENOS UN ATRIBUTO de cada parte y del todo.

public class CuerpoHumano {
    private Corazon corazon;
    private Pulmon pulmon;
    private Higado higado;
    private Apendice apendice;

    public CuerpoHumano(Corazon corazon, Pulmon pulmon, Higado higado, Apendice apendice) {
        this.corazon = corazon;
        this.pulmon = pulmon;
        this.higado = higado;
        this.apendice = apendice;
    }

    // Getters y setters
    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Pulmon getPulmon() {
        return pulmon;
    }

    public void setPulmon(Pulmon pulmon) {
        this.pulmon = pulmon;
    }

    public Higado getHigado() {
        return higado;
    }

    public void setHigado(Higado higado) {
        this.higado = higado;
    }

    public Apendice getApendice() {
        return apendice;
    }

    public void setApendice(Apendice apendice) {
        this.apendice = apendice;
    }


}

class Corazon {
    private String estado;
    private int ritmoCardiaco;

    public Corazon(String estado, int ritmoCardiaco) {
        this.estado = estado;
        this.ritmoCardiaco = ritmoCardiaco;
    }

    // Getters y setters
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }
}

class Pulmon {
    private String estado;
    private String ubicacion;

    public Pulmon(String estado, String ubicacion) {
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    // Getters y setters
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}

class Higado {
    private String estado;
    private String color;

    public Higado(String estado, String color) {
        this.estado = estado;
        this.color = color;
    }

    // Getters y setters
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Apendice {
    private String estado;
    private String condicion;

    public Apendice(String estado, String condicion) {
        this.estado = estado;
        this.condicion = condicion;
    }

    // Getters y setters
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
}
