package Version1;

public class Auditoria {
    private Estudiante audEstudiante;
    private Instancia audInstancia;
    private Recordatorio audRecordatorio;
    private String estado;

    //constructores
    public Auditoria(Estudiante audEstudiante, String est) {
        this.audEstudiante = audEstudiante;
        this.estado = est;
    }

    public Auditoria(Instancia inst, String est) {
        this.audInstancia = inst;
        this.estado = est;
    }

    public Auditoria(Recordatorio rec, String est) {
        this.audRecordatorio = rec;
        this.estado = est;
    }

    // getters

    public Estudiante getAudEstudiante() {
        return audEstudiante;
    }

    public Instancia getAudInstancia() {
        return audInstancia;
    }

    public Recordatorio getAudRecordatorio() {
        return audRecordatorio;
    }

    public String getEstado() {
        return estado;
    }

    //setters


    public void setAudEstudiante(Estudiante audEstudiante) {
        this.audEstudiante = audEstudiante;
    }

    public void setAudInstancia(Instancia audInstancia) {
        this.audInstancia = audInstancia;
    }

    public void setAudRecordatorio(Recordatorio audRecordatorio) {
        this.audRecordatorio = audRecordatorio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //metodos toStrings



    public String toStringEstudiante() {
        return "Auditoria{" +
                "audEstudiante=" + audEstudiante +
                ", estado='" + estado + '\'' +
                '}';
    }


    public String toStringInstancia() {
        return "Auditoria{" +
                ", audInstancia=" + audInstancia +
                ", estado='" + estado + '\'' +
                '}';
    }

    public String toStringRecordatorio() {
        return "Auditoria{" +
                ", audRecordatorio=" + audRecordatorio +
                ", estado='" + estado + '\'' +
                '}';
    }
}
