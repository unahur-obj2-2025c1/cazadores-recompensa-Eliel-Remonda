package ar.edu.unahur.obj2;

public class CazadorRural extends Cazador{

    @Override
    public Boolean puedeCazarEspecifica(IProfugo profugo){
        return profugo.esNervioso();
    }
    @Override
    public void intimidarProgutoEspecifica(IProfugo profugo){
        profugo.volverseNervioso();
    }
}
