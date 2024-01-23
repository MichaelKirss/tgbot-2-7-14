package ru.skillfactory.telegbot.tbot.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name ="SPEND")
public class Spend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "CHAT_ID")
    private Long chatId;
    @Column(name = "SPEND")
    private BigDecimal spend;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getChatId() {
        return chatId;
    }
    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }
    public BigDecimal getSpend() {
        return spend;
    }
    public void setSpend(BigDecimal spend) {
        this.spend = spend;
    }
}
