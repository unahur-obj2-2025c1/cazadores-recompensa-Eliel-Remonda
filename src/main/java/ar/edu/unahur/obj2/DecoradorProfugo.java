package ar.edu.unahur.obj2;

public class DecoradorProfugo implements IProfugo {
    protected IProfugo profugoDecorado;

    public DecoradorProfugo(IProfugo profugoDecorado) {
        this.profugoDecorado = profugoDecorado;
    }

    @Override
    public Integer getInocencia() {
        return profugoDecorado.getInocencia();
    }

    @Override
    public Integer getHabilidad() {
        return profugoDecorado.getHabilidad();
    }

    @Override
    public Boolean esNervioso() {
        return profugoDecorado.esNervioso();
    }

    @Override
    public void volverseNervioso() {
        profugoDecorado.volverseNervioso();
    }

    @Override
    public void dejarDeEstarNervioso() {
        profugoDecorado.dejarDeEstarNervioso();
    }

    @Override
    public void reducirHabilidad() {
        profugoDecorado.reducirHabilidad();
    }

    @Override
    public void disminuirInocencia() {
        profugoDecorado.disminuirInocencia();
    }

}
