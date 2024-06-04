package br.com.oceanoPuro.model;

import java.time.LocalDate;

public class Pagamento {

    private LocalDate dataPago;

    private Empresa empresa;

    private Plano plano;

    public Pagamento(LocalDate dataPago, Empresa empresa, Plano plano) {
        this.dataPago = dataPago;
        this.empresa = empresa;
        this.plano = plano;
    }

    public LocalDate getDataPago() {
        return dataPago;
    }

    public void setDataPago(LocalDate dataPago) {
        this.dataPago = dataPago;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
}
