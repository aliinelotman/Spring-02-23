package ee.opilane.kalkulaator2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class kalkulaator {
    List<Integer> integers = new ArrayList<>(Arrays.asList(31, 52, 24));

    @GetMapping("koiknumbrid")
    public List<Integer> koikNumbrid(){
        return integers;
    }
    @GetMapping("lisanr/{nr}")
    public List<Integer> lisaNumber(@PathVariable int nr){
        integers.add(nr);
        return integers;
    }

    @GetMapping("eemaldanr/{index}")
    public List<Integer> eemaldaNumber(@PathVariable int index){
        integers.remove(index);
        return integers;
    }

    @GetMapping("tuhjenda")
    public List<Integer> tuhjenda(){
        integers.clear();
        return integers;
    }

    @GetMapping("liidakoik")
    public int liidaKoik(){
        int summa = 0;
        for (Integer integer : integers) {
            summa += integer;
        }
        return summa;
    }


    @GetMapping("keskmine")
    public int keskmine(){
        int summa = 0;
        for (Integer integer : integers) {
            summa += integer;
        }
        return summa/integers.size();
    }

    @GetMapping("loetle")
    public int loetle(){
        int loendur = 0;
        for (int i = 0; i <= integers.size(); i++) {
            loendur = i;
        }
        return loendur;
    }

    @GetMapping("lisaYks")
    public List<Integer> lisaYks(){
        for (int i = 0; i < integers.size(); i++) {
           int muutuvNr = integers.get(i);
           muutuvNr += 1;
           integers.set(i, muutuvNr);
        }
        return integers;
    }

    @GetMapping("lisaNr/{nr}")
    public List<Integer> lisaNr(@PathVariable int nr){
        for (int i = 0; i < integers.size(); i++) {
            int muutuvNr = integers.get(i);
            muutuvNr += nr;
            integers.set(i, muutuvNr);
        }
        return integers;
    }

    @GetMapping("jaga10")
    public List<Integer> jaga10(){
        for (int i = 0; i < integers.size(); i++) {
            int muutuvNr = integers.get(i);
            muutuvNr /= 10;
            integers.set(i, muutuvNr);
        }
        return integers;
    }

    @GetMapping("jagaNr/{nr}")
    public List<Integer> jagaNr(@PathVariable int nr){
        for (int i = 0; i < integers.size(); i++) {
            int muutuvNr = integers.get(i);
            muutuvNr /=nr;
            integers.set(i, muutuvNr);
        }
        return integers;
    }

    @GetMapping("liida/{nr1}/{nr2}")
        public int liida(@PathVariable int nr1, @PathVariable int nr2){
        return nr1 + nr2;
    }
    @GetMapping("lahuta/{nr1}/{nr2}")
    public int lahuta(@PathVariable int nr1, @PathVariable int nr2){
        return nr1 - nr2;
    }


    @GetMapping("korruta/{nr1}/{nr2}")
    public int korruta(@PathVariable int nr1, @PathVariable int nr2){
        return nr1 * nr2;
    }

    @GetMapping("jaga/{nr1}/{nr2}")
    public double jaga(@PathVariable double nr1, @PathVariable double nr2){
        return nr1 / nr2;
    }

}

