package br.com.alura.rh.teste.service;

import br.com.alura.rh.teste.Exception.ValidacaoException;
import br.com.alura.rh.teste.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class ReajusteService {

    public List<ValidacaoReajuste> validacoes;

    public ReajusteService (List<ValidacaoReajuste> validacoes){
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
        this.validacoes.forEach(v -> v.validar(funcionario,aumento));


        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
