package ee.opilane.nordpool2;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ToodeListController {
    List<Toode> tooted = new ArrayList<>(Arrays.asList(
          new Toode(38993, "Juust", 8.0, true),
          new Toode(389944, "Sai", 8.0, false),
          new Toode(389911, "Piim", 8.0, true);

    ));
}
