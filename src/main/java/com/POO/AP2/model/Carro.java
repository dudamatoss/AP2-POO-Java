package com.POO.AP2.model;

public class Carro {

    private int id;
    private String modelo;
    private String marca;
    private int ano;

    public Carro(int id, String modelo, String marca, int ano) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
