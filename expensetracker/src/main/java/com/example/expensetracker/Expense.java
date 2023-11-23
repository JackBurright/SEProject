package com.example.expensetracker;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicInteger;

public class Expense {
    

    private static final AtomicInteger count = new AtomicInteger(0);
    private Integer id;
    private BigDecimal amount;
    private String description;
    private LocalDate date;

    public Expense() {
        this.id = count.incrementAndGet();
        this.date = LocalDate.now(); 
    }
    
    
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    

}






