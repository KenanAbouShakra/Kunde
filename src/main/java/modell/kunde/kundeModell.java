package modell.kunde;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kundeModell {
    @GetMapping("/")
    public Kunde returKunde(Kunde innkunde) {
        return innkunde;
    }
}
