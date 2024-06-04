package br.com.oceanoPuro;

import br.com.oceanoPuro.model.Certificado;
import br.com.oceanoPuro.model.Empresa;
import br.com.oceanoPuro.model.Pagamento;
import br.com.oceanoPuro.model.Plano;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Certificado certificado = new Certificado(1L, LocalDate.parse("2023-10-12"), LocalDate.parse("2023-12-12"));
        Empresa johson = new Empresa(1L, "Johson&Johson", "11223412412412", 251L);
        Plano plano = new Plano(1L, 3000L, "Anual");
        Pagamento pagamento = new Pagamento(LocalDate.parse("2023-10-12"), johson, plano);


        String estaAtivo = certificado.estaExpirado() ? "Expirado" : "Ativo";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatadaExpiracao = certificado.getDataExpiracao().format(formatter);
        String dataFormatadaPagamento = pagamento.getDataPago().format(formatter);

        System.out.println("A Empresa " + johson.getNome() + " está com o certificado " +
                estaAtivo + ", data de expiração: " + dataFormatadaExpiracao + ", plano contratado: " + plano.getTipoPlano()
                + ", data de pagamento: " + dataFormatadaPagamento + ", o tamanho da empresa é: " + johson.tamanhoEmpresa());
    }
}