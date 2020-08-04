package germinoci.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("in18Service")
public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
