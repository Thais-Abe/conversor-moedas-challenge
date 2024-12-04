package com.abe.thais.demo.controllers;

import com.abe.thais.demo.services.CoinService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.Map;

@Controller
public class CoinController {

    private final CoinService coinService;

    public CoinController(CoinService coinService) {
        this.coinService = coinService;
    }

    @GetMapping("/")
    public String getCoinConverter(Model model) throws IOException, InterruptedException {
        Map<String, Double> conversionRates = coinService.getConversionRates("BRL");
        System.out.println("conversionRates = " + conversionRates.keySet());
        model.addAttribute("currencies", conversionRates.keySet());
        return "index";
    }

    @PostMapping("/convert")
    public String convertCurrency(@RequestParam("amount") double amount,
                                  @RequestParam("currencyFrom") String currencyFrom,
                                  @RequestParam("currencyTo") String currencyTo,
                                  Model model) throws IOException, InterruptedException {


        double conversionRate = coinService.convertCurrency(currencyFrom, currencyTo);
        Map<String, Double> conversionRates = coinService.getConversionRates(currencyFrom);

        double convertedAmount = amount * conversionRate;

        System.out.println("conversionRates = " + conversionRates.keySet());
        model.addAttribute("currencies", conversionRates.keySet());

        model.addAttribute("convertedAmount", convertedAmount);

        return "index";
    }


}
