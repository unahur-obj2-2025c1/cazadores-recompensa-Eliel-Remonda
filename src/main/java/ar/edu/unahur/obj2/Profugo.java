package ar.edu.unahur.obj2;

public class Profugo implements IProfugo{ 
    private Integer inocencia;
    private Integer habilidad;
    private Boolean esNervioso;

    public Profugo(Integer inocencia, Integer habilidad, Boolean esNervioso) {
        this.inocencia = inocencia;
        this.habilidad = habilidad;
        this.esNervioso = esNervioso;
    }

    @Override
    public Integer getInocencia() {
        return inocencia;
    }

    @Override
    public Integer getHabilidad() {
        return habilidad;
    }

    @Override
    public Boolean esNervioso() {
        return esNervioso;
    }

    @Override
    public void volverseNervioso() {
        esNervioso = true;
    }

    @Override
    public void dejarDeEstarNervioso() {
        esNervioso = false;
    }

    @Override
    public void reducirHabilidad() {
        habilidad = Integer.max(0, habilidad - 5);
    }

    @Override
    public void disminuirInocencia() {
        inocencia = Integer.max(0, inocencia - 2);
    }

}
