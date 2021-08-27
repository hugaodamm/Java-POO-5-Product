package com.praticaintegradora3.model;

public class Product {

    // Atributos
    private String name;
    private Double price;

    // Construtor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //método toString
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //método calcule
    public double calcule(Integer quantidadeOfProdutos){
        Double total = this.price * quantidadeOfProdutos;
        return total;
    }

}
