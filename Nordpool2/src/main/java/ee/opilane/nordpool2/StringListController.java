package ee.opilane.nordpool2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StringListController {
    List<String> autod = new ArrayList<>(Arrays.asList("BMW", "Audi", "Opel", "Seat", "Fiat", "onu Bella"));

    @GetMapping("saa-autod")
    public List<String> saaAutod(){
        return autod;
    }

    //hiljem DeleteMapping
    @GetMapping("kustuta-autod/{index}") //tagastada saab void, String ("Kustutamine õnnestus"), List
    public List<String> kustutaAutod(@PathVariable int index){
        autod.remove(index);
        return autod;
    }

    //hiljem DeleteMapping
    @GetMapping("tuhjenda") //tagastada saab void, String ("Kustutamine õnnestus"), List
    public List<String> tuhjenda(){
        autod.clear();
        return autod;
    }

    @GetMapping("vaata-autot/{index}")
    public String vaataAutot(@PathVariable int index){
        return autod.get(index);
    }

    //Hiljem PostMapping
    @GetMapping("lisa/{auto}")
    public List<String> lisaAuto(@PathVariable String auto){
        autod.add(auto);
        return autod;
    }

    //Hiljem PutMapping
    @GetMapping("muuda/{index}/{auto}")
    public List<String> muudaAuto(@PathVariable int index, @PathVariable String auto){
        autod.set(index, auto);
        return autod;
    }
}
