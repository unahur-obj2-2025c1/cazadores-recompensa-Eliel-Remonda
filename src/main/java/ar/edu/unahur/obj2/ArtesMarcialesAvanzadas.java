package ar.edu.unahur.obj2;

public class ArtesMarcialesAvanzadas extends DecoradorProfugo {

    public ArtesMarcialesAvanzadas(IProfugo profugoDecorado) {
        super(profugoDecorado);
    }

    @Override
    public Integer getHabilidad() {
        return Math.min(100, profugoDecorado.getHabilidad() * 2);
    }

}
