package co.com.electrodomestico.tipoelectrodomestico.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "TipoElectrodomestico")
@NoArgsConstructor

public class TipoElectrodomesticoEntity {
    @Id
    @Column(name = "idTipoElectrodomestico")
    private String idTipoElectrodomestico;
    @Column(name = "nombreTipoElectrodomestico")
    private String nombreTipoElectrodomestico;
    @Column(name = "tarifaMantenimiento")
    private double tarifaMantenimiento;
    @Column(name = "activo")
    private boolean activo;
}
