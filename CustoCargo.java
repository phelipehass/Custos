package br.com.funcionarios;

import java.math.BigDecimal;

/**
 * Created by phelipe.pereira on 21/08/2019.
 */
public class CustoCargo {
    private String cargo;
    private BigDecimal custo;

    public CustoCargo(String cargo, BigDecimal custo) {
        this.cargo = cargo;
        this.custo = custo;
    }
    // getters e setters;

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public BigDecimal getCusto(){
        return custo;
    }

    public void setCusto(BigDecimal custo){
        this.custo = custo;
    }
}
