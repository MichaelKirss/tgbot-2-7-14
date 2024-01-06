package ru.skillfactory.telegbot.tbot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skillfactory.telegbot.tbot.dto.ValuteCursOnDate;
import ru.skillfactory.telegbot.tbot.service.CentralRussianBankService;

import java.util.List;

@RestController
public class CurrencyController {
    private final CentralRussianBankService centralRussianBankService;

    public CurrencyController(CentralRussianBankService centralRussianBankService) {
        this.centralRussianBankService = centralRussianBankService;
    }

    @GetMapping("/getCurrencies")
    public List<ValuteCursOnDate> getValuteCursOnDate() throws Exception {
        return centralRussianBankService.getCurrenciesFromCbr();

    }

}
