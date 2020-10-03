package com.consumingrestful.webservice.Facade;

import com.consumingrestful.webservice.Resource.Quote;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Component
public class QuoteFacade {

    public Quote generateQuote() {
        RestTemplate restTemplate=new RestTemplate();
        String URL="https://gturnquist-quoters.cfapps.io/api/random";
        Quote quote = restTemplate.getForObject(URL, Quote.class);
        System.out.println(quote);
        return quote;
    }
}
