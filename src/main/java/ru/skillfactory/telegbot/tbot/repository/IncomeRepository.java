package ru.skillfactory.telegbot.tbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skillfactory.telegbot.tbot.entity.Income;
@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
}
