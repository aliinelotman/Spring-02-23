package ee.opilane.nordpool2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping ("hi")// localhost:8080/hi
    public String saaS6na(){
        return "Hello world";
    }

    @GetMapping ("hi/{nimi}")// localhost:8080/hi
    public String saaNimi(@PathVariable String nimi){
        return "Hello " + nimi;
    }

    @GetMapping ("multiply/{nr1}/{nr2}")// localhost:8080/multiply/2/4
    public Integer korruta(@PathVariable int nr1, @PathVariable int nr2) {
        return nr1*nr2;
    }

    @GetMapping ("do-logs/{mitu}")// localhost:8080/do-logs/8
    public void logi(@PathVariable int mitu) {
        for (int i = 0; i < mitu; i++) {
            System.out.println("Logi number" + i);
        }
    }
}

