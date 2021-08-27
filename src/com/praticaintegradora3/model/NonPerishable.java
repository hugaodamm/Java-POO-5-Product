package com.praticaintegradora3.model;

import java.util.List;

public class NonPerishable extends Product {

    // atributo
    private String type;

    // Getter and Setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Constructor
    public NonPerishable(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return "NonPerishable{" +
                "type='" + type + '\'' +
                '}';
    }

    //método calcule
    public double calcule(Integer quantidadeOfProdutos){
        return super.calcule(quantidadeOfProdutos);
    }

    public static void totalNonPerishable(List<NonPerishable> naoPereciveis, Integer quantidade) {
        Double total = 0d;
        for (NonPerishable item : naoPereciveis) {
            total += item.calcule(quantidade);
        }
        System.out.println(total);
    }
}
