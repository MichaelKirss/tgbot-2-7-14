package ru.skillfactory.telegbot.tbot.controllers;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skillfactory.telegbot.tbot.dto.ValuteCursOnDate;
import ru.skillfactory.telegbot.tbot.service.CentralRussianBankService;
import ru.skillfactory.telegbot.tbot.service.StatService;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CurrencyController {
    private final CentralRussianBankService centralRussianBankService;
    private final StatService statservice;

    @GetMapping("/getCurrencies")
    public List<ValuteCursOnDate> getValuteCursOnDate() throws Exception {
        return centralRussianBankService.getCurrenciesFromCbr();
    }
    @GetMapping("/getStats")
    @ApiOperation(value = "Получение количества пополнений")
    public int getStats (@RequestParam(value = "ammount")BigDecimal ammount){
        return statservice.getCoutntsForIncome(ammount);
    }

}
