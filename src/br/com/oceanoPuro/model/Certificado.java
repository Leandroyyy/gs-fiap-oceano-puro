package br.com.oceanoPuro.model;

import java.time.LocalDate;

public class Certificado {

    private Long id;

    private LocalDate dataEmissao;

    private LocalDate dataExpiracao;

    public Certificado(Long id, LocalDate dataEmissao, LocalDate dataExpiracao) {
        this.id = id;
        this.dataEmissao = dataEmissao;
        this.dataExpiracao = dataExpiracao;
    }

    public boolean estaExpirado() {
        return dataExpiracao.isBefore(LocalDate.now());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }
}
