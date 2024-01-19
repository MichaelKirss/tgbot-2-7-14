package ru.skillfactory.telegbot.tbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skillfactory.telegbot.tbot.entity.Spend;
@Repository
public interface SpendRepository extends JpaRepository<Spend, Long> {

}
