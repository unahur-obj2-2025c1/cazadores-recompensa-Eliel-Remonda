package ar.edu.unahur.obj2;

public class EntrenamientoEliteDecorado extends DecoradorProfugo {
    public EntrenamientoEliteDecorado(IProfugo profugoDecorado) {
        super(profugoDecorado);
    }

    @Override
    public Boolean esNervioso(){
        return false;
    }
}
