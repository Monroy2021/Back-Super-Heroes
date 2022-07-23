package co.com.gamehero.model.cartas;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class CartaEstado {
    private Boolean esOculta;
}
