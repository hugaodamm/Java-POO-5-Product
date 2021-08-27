package com.praticaintegradora3;

import com.praticaintegradora3.model.NonPerishable;
import com.praticaintegradora3.model.Pereciveis;
import com.praticaintegradora3.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Distribuidor {

    public static void main(String[] args) {

        List<NonPerishable> naoPerecivel = new ArrayList<>();
        naoPerecivel.add(new NonPerishable("Sal", 5.5, "Tempero"));
        naoPerecivel.add(new NonPerishable("Oregano", 12.5, "Condimento"));
        naoPerecivel.add(new NonPerishable("Detergente", 5.5, "Limpeza"));
        naoPerecivel.add(new NonPerishable("Desinfetante", 5.5, "Limpeza"));
        naoPerecivel.add(new NonPerishable("Macarrão", 5.5, "Massa"));

        List<Pereciveis> pereciveis = new ArrayList<>();
        pereciveis.add(new Pereciveis("Batata", 2.50, 1));
        pereciveis.add(new Pereciveis("Ovo", 11.50, 2));
        pereciveis.add(new Pereciveis("Beterraba", 2.50, 3));
        pereciveis.add(new Pereciveis("Leite", 3.50, 2));
        pereciveis.add(new Pereciveis("Cenoura", 3.00, 3));

        System.out.println("----------Não Pereciveis--------");
        NonPerishable.totalNonPerishable(naoPerecivel, 1);

        System.out.println("----------Pereciveis------------");
        Pereciveis.totalPereciveis(pereciveis, 1);

        }
}
