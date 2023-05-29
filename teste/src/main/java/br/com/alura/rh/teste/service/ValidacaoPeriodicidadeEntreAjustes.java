package br.com.alura.rh.teste.service;

import br.com.alura.rh.teste.Exception.ValidacaoException;
import br.com.alura.rh.teste.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeEntreAjustes implements ValidacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDeseUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if (mesesDeseUltimoReajuste < 6) {
            throw new ValidacaoException("intervalo entre reajustes deve ser de no minimo 6 meses!");
        }
    }
}