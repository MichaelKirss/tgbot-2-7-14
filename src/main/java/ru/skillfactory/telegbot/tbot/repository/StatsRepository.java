package ru.skillfactory.telegbot.tbot.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
@RequiredArgsConstructor
public class StatsRepository {
    private static final JdbcTemplate jdbcTemplate = null;
    public static int getCount(BigDecimal ammount){
       return jdbcTemplate.queryForObject("SELECT count (*) WHERE INCOME > ?", Integer.class, ammount);
    }
}
