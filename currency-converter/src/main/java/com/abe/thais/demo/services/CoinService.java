package com.abe.thais.demo.services;

import com.abe.thais.demo.models.Coin;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.IOException;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;


@Service
public class CoinService {

    public Double convertCurrency(String currencyFrom, String currencyTo) throws IOException, InterruptedException {

        Coin coin = makeRequisitionforApi( currencyFrom);
        return coin.getConversion_rates().get(currencyTo);
    }

    public Map<String, Double> getConversionRates(String currencyFrom) throws IOException, InterruptedException{

        Coin coin = makeRequisitionforApi( currencyFrom);
        Map<String, Double> conversionRates = coin.getConversion_rates();
        return conversionRates;

    }

    public Coin makeRequisitionforApi(String currencyFrom) throws IOException, InterruptedException {
        String url_str = "https://v6.exchangerate-api.com/v6/071b5678b833b382fa7f1dbd/latest/" + currencyFrom;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url_str))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        Gson coinGson = new Gson();
        Coin coin = coinGson.fromJson(json, Coin.class);
        return  coin;
    }
}
