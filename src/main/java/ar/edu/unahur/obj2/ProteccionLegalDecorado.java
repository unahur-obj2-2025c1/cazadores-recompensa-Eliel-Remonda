package ar.edu.unahur.obj2;


public class ProteccionLegalDecorado extends DecoradorProfugo {
    public ProteccionLegalDecorado(IProfugo profugoDecorado) {
        super(profugoDecorado);
    }

    @Override
    public Integer getInocencia(){
        return Math.max(profugoDecorado.getHabilidad(), 40);
    }
}