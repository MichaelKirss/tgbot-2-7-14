package ru.skillfactory.telegbot.tbot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.skillfactory.telegbot.tbot.repository.StatsRepository;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class StatService {
    private final StatsRepository statsRepository;
    public int getCoutntsForIncome(BigDecimal ammount){
        return StatsRepository.getCount(ammount);
    }
}
