package com.dio.labproject.Models;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToMany
    private List<Feature> features;
    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany
    private List<News> news;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }
}
