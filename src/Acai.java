import com.sun.org.apache.xpath.internal.operations.Bool;

public class Acai {

    private Integer tamanho;
    private Double valor = 0.0;
    private Integer acrescimo;

    public Integer getTamanho() {
        return tamanho;
    }

    public Double calculaValor(Integer tamanho){
        if (tamanho == 1){
            valor += 8.0;
        }
        if (tamanho == 2){
            valor += 10.0;
        }
        if (tamanho == 3){
            valor += 12.0;
        }
        return valor;
    }

    public Double calculaAcrescimo(Integer acrescimo){
        if (acrescimo == 1){
            valor += 2.0;
        }
        return valor;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(Integer acrescimo) {
        this.acrescimo = acrescimo;
    }
}
