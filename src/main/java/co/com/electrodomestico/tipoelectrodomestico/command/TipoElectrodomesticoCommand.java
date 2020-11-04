package co.com.electrodomestico.tipoelectrodomestico.command;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class TipoElectrodomesticoCommand {

    private String idTipoElectrodomestico;
    private String nombreTipoElectrodomestico;
    private double tarifaMantenimiento;
    private boolean activo;

}
