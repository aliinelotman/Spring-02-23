package ee.opilane.kalkulaator2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class kalkulaator {
    List<Integer> integers = new ArrayList<>(Arrays.asList(31, 52, 24));
};

