package dio.banco;
import java.util.ArrayList;

public class Fatura {
    private String dataVencimento;
    private double total;
    private ArrayList<Lancamento> lancamentos;

    public Fatura(String dataVencimento, double total, ArrayList<Lancamento> lancamentos) {
        this.dataVencimento = dataVencimento;
        this.lancamentos = lancamentos;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public ArrayList<Lancamento> getLancamentos() {
        return lancamentos;
    }

    public void setLancamentos(ArrayList<Lancamento> lancamentos) {
        this.lancamentos = lancamentos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
