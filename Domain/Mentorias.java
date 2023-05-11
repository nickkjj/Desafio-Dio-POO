package Domain;
import java.time.LocalDate;

public class Mentorias extends Conteudo{


    @Override
    public double calcularXP() {
        return XP_Padrao+20d;
    }

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n--------Mentoria--------\ntitulo='" + getTitulo() + '\'' +
                "\ndescricao='" + getDescricao() + '\'' +
                "\ndata=" + data +
                '\'';
    }

}