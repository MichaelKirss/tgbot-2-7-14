package ru.skillfactory.telegbot.tbot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.skillfactory.telegbot.tbot.entity.ActiveChat;

import java.util.Optional;

public interface ActiveChatRepository extends JpaRepository<ActiveChat,Long> {
    Optional<ActiveChat> findActiveChatByChatId(Long chatId);
}
