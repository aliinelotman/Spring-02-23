package ee.opilane.nordpool2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Toode {
    private int id;
    private String nimi;
    private double hind;

    private boolean aktiivne;

}
