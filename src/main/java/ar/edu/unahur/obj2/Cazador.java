package ar.edu.unahur.obj2;

import java.util.List;

public abstract class Cazador {
    private Integer experiencia;
    private List<IProfugo> profugosCazados;
    private List<IProfugo> profugosIntimidados;

    public void intimidarProfugo(IProfugo profugo){
        profugo.disminuirInocencia();
        this.intimidarProgutoEspecifica(profugo);
    }
    
    public abstract void intimidarProgutoEspecifica(IProfugo profugo);

    public Boolean puedeCazarGeneral(IProfugo profugo){
        return this.experiencia > profugo.getInocencia();
    }

    public abstract Boolean puedeCazarEspecifica(IProfugo profugo);
    
    public Boolean puedeCapturar(IProfugo profugo){
        return puedeCazarGeneral(profugo) && puedeCazarEspecifica(profugo);
    }

    public void procesoDeCaptura(IProfugo profugo){
        if (puedeCapturar(profugo)){
            profugosCazados.add(profugo);
            Zona.profugos.remove(profugo);
        }else{
            intimidarProfugo(profugo);
            profugosIntimidados.add(profugo);
        }
        experiencia += minimoValorDeProfugosIntimidados() + ( 2 * cantidadProfugosCaputados());
    }

    public Integer minimoValorDeProfugosIntimidados(){
        return profugosIntimidados.stream().mapToInt(p -> p.getHabilidad()).min().orElse(0);
    }

    public Integer cantidadProfugosCaputados(){
        return profugosCazados.size();
    }

    public Integer cantidadProfugosIntimidados(){
        return profugosIntimidados.size();
    }
}
