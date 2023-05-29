package br.com.alura.rh.teste.service;

import br.com.alura.rh.teste.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento);
}
