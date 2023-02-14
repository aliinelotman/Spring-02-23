package ee.opilane.nordpool2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToodeController {
    //{"id":9383778, "name": "ksjf2", "hind":8,0...}
    Toode toode = new Toode(38993, "Juust", 8.0, true);

    @GetMapping("saa-toode")
    public Toode saaToode(){
        return toode;
    }

}
