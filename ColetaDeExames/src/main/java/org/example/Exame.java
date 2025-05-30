package org.example;

import java.util.Calendar;
import java.util.Date;

public class Exame {
    String codigoExame;
    String tipoExame;
    Date dataColeta = new Date();
    Date dataResultado = getDataResultado();

    //calcular a data de resultado...
    public Date getDataResultado() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dataColeta);
        cal.add(Calendar.DAY_OF_MONTH, 10);
        return cal.getTime();
    }

    public Exame(String codigoExame, String tipoExame, Date dataColeta) {
        this.codigoExame = codigoExame;
        this.tipoExame = tipoExame;
        this.dataColeta = dataColeta;
    }
}
