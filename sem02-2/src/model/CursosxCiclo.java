package model;

/**
 *
 * @author Usuario
 */
public class CursosxCiclo {
    private int cod_cursoxciclo;
    private Periodo periodo;
    private Docente docente;
    private Curso curso;

    public CursosxCiclo(int cod_cursoxciclo, Periodo periodo, Docente docente, Curso curso) {
        this.cod_cursoxciclo = cod_cursoxciclo;
        this.periodo = periodo;
        this.docente = docente;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "CursosxCiclo{" + "cod_cursoxciclo=" + cod_cursoxciclo + ", periodo=" + periodo + ", docente=" + docente + ", curso=" + curso + '}';
    }
    
}
