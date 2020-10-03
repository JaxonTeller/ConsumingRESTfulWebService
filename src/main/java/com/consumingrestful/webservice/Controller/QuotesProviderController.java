package com.consumingrestful.webservice.Controller;

import com.consumingrestful.webservice.Facade.QuoteFacade;
import com.consumingrestful.webservice.Resource.Quote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
public class QuotesProviderController {

    private QuoteFacade quoteFacade;

    QuotesProviderController(QuoteFacade quoteFacade)
    {
        this.quoteFacade=quoteFacade;
    }

    @GetMapping("/quote")
    public Quote getQuote()  {
        return this.quoteFacade.generateQuote();
    }
}
