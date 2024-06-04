package br.com.oceanoPuro.model;

public class Plano {

    private Long id;

    private Long valor;

    private String tipoPlano;

    public Plano(Long id, Long valor, String tipoPlano) {
        this.id = id;
        this.valor = valor;
        this.tipoPlano = tipoPlano;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }
}
