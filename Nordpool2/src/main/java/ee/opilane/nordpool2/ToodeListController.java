package ee.opilane.nordpool2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ToodeListController {
    List<Toode> tooted = new ArrayList<>(Arrays.asList(
          new Toode(38993, "Juust", 8.0, true),
          new Toode(389944, "Sai", 8.0, false),
          new Toode(389911, "Piim", 8.0, true)

    ));

    @GetMapping("hinnad-kokku")
    public double hinnadKokku(){
        double summa = 0;
        for (Toode toode : tooted) {
            summa += toode.getHind();
        }
        return summa;
    }

    @GetMapping("suurenda-hinda/{suurendus}")
    public List<Toode> suurendaHinda(@PathVariable double suurendus){
        double summa = 0;
        for (Toode toode : tooted) {
            toode.setHind(toode.getHind() + suurendus);
        }
        return tooted;
    }


    @GetMapping("lisa1/{id}/{nimi}/{hind}/{aktiivne}") ///kõige ebakorrektsem variant     //localhost:8080/lisa/3/jogurt/77/true
    public  List<Toode> lisa1(
            @PathVariable int id,
            @PathVariable String nimi,
            @PathVariable double hind,
            @PathVariable boolean aktiivne
    ) {
        Toode toode = new Toode(id, nimi, hind, aktiivne);
        tooted.add(toode);
        return tooted;
    }

    @GetMapping("lisa2")     //localhost:8080/lisa2?id=223&nimi=tee&hind=77&aktiivne=true
    public  List<Toode> lisa2(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam double hind,
            @RequestParam boolean aktiivne
    ) {
        Toode toode = new Toode(id, nimi, hind, aktiivne);
        tooted.add(toode);
        return tooted;
    }

    @PostMapping("lisa3")  //kõige rohkem kasutaks   //localhost:8080/lisa2?id=223&nimi=tee&hind=77&aktiivne=true
    public  List<Toode> lisa3(@RequestBody Toode toode) {
        //Toode toode = new Toode(id, nimi, hind, aktiivne);
        tooted.add(toode);
        return tooted;
    }



    @GetMapping("kustuta/{index}")
    private List<Toode> kustutaToode(@PathVariable int index) {
        tooted.remove(index);
        return tooted;
    }

    @GetMapping("vaata/{index}")
    private Toode vaataToodet(@PathVariable int index){
        return tooted.get(index);
    }

    @GetMapping("tuhjendaTooted")
    private List<Toode> tuhjendaTooted(){
        tooted.clear();
        return tooted;
    }


}
