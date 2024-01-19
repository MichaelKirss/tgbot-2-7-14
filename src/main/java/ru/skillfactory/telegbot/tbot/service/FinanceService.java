package ru.skillfactory.telegbot.tbot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.skillfactory.telegbot.tbot.entity.Income;
import ru.skillfactory.telegbot.tbot.entity.Spend;
import ru.skillfactory.telegbot.tbot.repository.IncomeRepository;
import ru.skillfactory.telegbot.tbot.repository.SpendRepository;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class FinanceService {
    static final String ADD_INCOME = "/addincome";
    static final String ADD_SPEND = "/addspend";

    private final IncomeRepository incomeRepository;
    private final SpendRepository spendRepository;


    public String addFinanceOperation(String operationType, String price, Long chatId) {
        String message;
        if (ADD_INCOME.equalsIgnoreCase(operationType)) {
            Income income = new Income();
            income.setChatId(chatId);
            income.setIncome(new BigDecimal(price));
            incomeRepository.save(income);
            message = "Доход в размере " + price + " был успешно добавлен";
        } else {
            Spend spend = new Spend();
            spend.setChatId(chatId);
            spend.setSpend(new BigDecimal(price));
            spendRepository.save(spend);
            message = "Расход в размере " + price + " был успешно добавлен";
        }
        return message;
    }
}
