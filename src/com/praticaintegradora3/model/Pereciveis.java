package com.praticaintegradora3.model;

import java.util.List;

public class Pereciveis extends Product {

    // atributo
    private Integer daysPorCaducar;

    // Getter and Setter
    public int getDaysPorCaducar() {
        return daysPorCaducar;
    }

    public void setDaysPorCaducar(int daysPorCaducar) {
        this.daysPorCaducar = daysPorCaducar;
    }

    //Construtor
    public Pereciveis(String name, double price, int daysPorCaducar) {
        super(name, price);
        this.daysPorCaducar = daysPorCaducar;
    }

    // método toString
    @Override
    public String toString() {
        return "Pereciveis{" +
                "daysPorCaducar=" + daysPorCaducar +
                '}';
    }

    public double calcule(Integer quantidadeOfProdutos){
    double total = 0.0;
        //double valorProd = super.calcule(quantidadeOfProdutos);
       try {
           switch (daysPorCaducar) {
               case 1:
//                valorProd /= 4;
//                break;
                   total = (this.getPrice() / 4) * quantidadeOfProdutos;
                   break;
               case 2:
//                valorProd /= 3;
//                break;
                   total = (this.getPrice() / 3) * quantidadeOfProdutos;
                   break;
               case 3:
//                valorProd /= 2;
//                break;
                   total = (this.getPrice() / 2) * quantidadeOfProdutos;
                   break;
           }
       }catch (Exception e) {
               System.out.println("Ocorreu um erro no cálculo:" + e);
       }
        return total;
    }

    public static void totalPereciveis(List<Pereciveis> pereciveis, Integer quantidade) {
        Double total = 0d;
        for (Pereciveis item : pereciveis) {
            total += item.calcule(quantidade);
        }
        System.out.printf("%.2f", total);
    }
}
