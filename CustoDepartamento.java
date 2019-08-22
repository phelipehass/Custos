package br.com.funcionarios;

import java.math.BigDecimal;

/**
 * Created by phelipe.pereira on 21/08/2019.
 */
public class CustoDepartamento {
    private String departamento;
    private BigDecimal custo;
    // getters e setters

    public CustoDepartamento(String departamento, BigDecimal custo){
        this.departamento = departamento;
        this.custo = custo;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public BigDecimal getCusto(){
        return custo;
    }

    public void setCusto(BigDecimal custo){
        this.custo = custo;
    }
}
