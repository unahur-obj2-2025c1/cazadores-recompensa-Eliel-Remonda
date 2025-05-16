package ar.edu.unahur.obj2;

public class CazadorSigiloso extends Cazador{
    
    @Override
    public Boolean puedeCazarEspecifica(IProfugo profugo){
        return profugo.getHabilidad() > 50;
    }
    @Override
    public void intimidarProgutoEspecifica(IProfugo profugo){
        profugo.reducirHabilidad(); // debe recudir la habilidad en 5 y no puede ser negativa
    }
}
