package br.com.oceanoPuro.model;

public class Empresa {

    private Long id;

    private String nome;

    private String cnpj;

    private Long quantidadeFuncionarios;

    private Certificado certificado;

    public Empresa(Long id, String nome, String cnpj, Long quantidadeFuncionarios) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String tamanhoEmpresa() {
        if (this.quantidadeFuncionarios > 250) {
            return "EMPRESA GRANDE";
        }

        if (this.quantidadeFuncionarios > 50) {
            return "EMPRESA MÉDIA";
        }

        return "EMPRESA PEQUENA";
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Long getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(Long quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public Certificado getCertificado() {
        return certificado;
    }

    public void setCertificado(Certificado certificado) {
        this.certificado = certificado;
    }

}
