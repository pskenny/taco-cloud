package tacos.tacos;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class TacoOrder {
    
    private String deliverName;
    private String deliverStreet;
    private String deliveryCity;
    private String deliverState;
    private String deliveryZip;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        tacos.add(taco);
    }
}
