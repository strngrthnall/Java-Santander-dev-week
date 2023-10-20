package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity(name = "tb_account")
public class Account{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique= true)
  private String number;

  private String agency;

  @Column(scale = 13, precision = 2)
  private BigDecimal balance;
  @Column(name = "additional_limit", scale = 13, precision = 2)
  private BigDecimal limit;


  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumber() {
    return this.number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getAgency() {
    return this.agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }

  public BigDecimal getBalance() {
    return this.balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public BigDecimal getLimit() {
    return this.limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }
  
}