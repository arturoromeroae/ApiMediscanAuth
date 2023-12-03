package pe.mybusiness.ApiAuth.dto;

import java.util.Date;
import java.util.Set;
import lombok.Data;
import pe.mybusiness.ApiAuth.entity.Role;

@Data
public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String password;
    private Set<Role> roles;
    private Date fechaPago;
    private String numTarjeta;
    private String idCompra;
    private String cvvTarjeta;
    private Date nextPaymentDate;
    private String expiracionTarjeta;
}
