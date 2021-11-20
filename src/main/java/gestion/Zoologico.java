package gestion;

import java.util.*;

public class Zoologico {

    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico(){ }

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public int cantidadTotalAnimales(){
        int resultado = 0;
        for (int i = 0; i < zonas.size(); i++) {
            resultado += zonas.get(i).getAnimales().size();
        }
        return resultado;
    }

    public void agregarZonas(Zona zona) {
        this.zonas.add(zona);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }

    public void setZona(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }
}
