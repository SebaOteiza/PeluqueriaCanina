package abstractas;

//las clases abtractas no pueden crear objetos pero pueden ser super clases heredadas de otros objetos
public abstract class FiguraGeometrica {

    protected String tipoFigura;

    //constructor
    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    //metodo abstractto
    public abstract void dibujar(); //EL METODO ABSTRAC NO LLEVA LAS {} AL FINAL
    //inicializando el método pero no hace nada, eso se ve en las clses hijas 

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FiguraGeometrica{");
        sb.append("tipoFigura=").append(tipoFigura);
        sb.append('}');
        return sb.toString();
    }

}

    //de las clases hijas tenemos que definir qué hará el método 
