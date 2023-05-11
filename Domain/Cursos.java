package Domain;

public class Cursos extends Conteudo{

    private int cargaHoraria;


    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_Padrao * cargaHoraria;
    }

    
    @Override
    public String toString() {
        return "\n--------Curso--------\ntitulo='" + getTitulo() + '\'' +
                "\ndescricao='" + getDescricao() + '\'' +
                "\ncarga Horaria=" + cargaHoraria +
                '\'';
    }
}