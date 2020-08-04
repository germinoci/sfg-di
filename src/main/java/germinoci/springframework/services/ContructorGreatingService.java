package germinoci.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ContructorGreatingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
