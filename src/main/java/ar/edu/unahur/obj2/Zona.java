package ar.edu.unahur.obj2;

import java.util.ArrayList;
import java.util.List;

public class Zona {
    private final String nombre;
    public static List<IProfugo> profugos;

    public String getNombre() {
        return nombre;
    }

    public Zona(String nombre) {
        this.nombre = nombre;
        this.profugos = new ArrayList<>();
    }

    public Zona(String nombre, List<IProfugo> profugos) {
        this.nombre = nombre;
        this.profugos = profugos;
    }

    public void agregarProfugo(IProfugo profugo){
        this.profugos.add(profugo);
    }

    public void quitarProfugo(IProfugo profugo) {
        this.profugos.remove(profugo);
    }
    
    public List<IProfugo> getProfugos() {
        return List.copyOf(profugos);
    }

    public void vaciarProfugos() {
        profugos.clear();
    }
}
