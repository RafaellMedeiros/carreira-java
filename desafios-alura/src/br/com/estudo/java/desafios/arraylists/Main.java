package br.com.estudo.java.desafios.arraylists;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Atividades de 1 a 3
        ArrayList<String> arrayAnimals = new ArrayList<>();
        arrayAnimals.add("cachorro");
        arrayAnimals.add("gato");
        arrayAnimals.add("papagaio");

        showArrayList(arrayAnimals);

        Animal myDog = new Dog();

        isAnimalDog(myDog);

        //Atividade 4
        ArrayList<Product> arrayProducts = new ArrayList<>();
        arrayProducts.add(new Product("Prod 1", 4));
        arrayProducts.add(new Product("Prod 2", 5));
        arrayProducts.add(new Product("Prod 3", 3));
        arrayProducts.add(new Product("Prod 4", 2));
        arrayProducts.add(new Product("Prod 5", 1));

        showAverage(arrayProducts);
    }


    static private void showArrayList(ArrayList<String> array) {
        array.forEach(System.out::println);
    }

    static boolean isAnimalDog(Animal animal) {
        if (animal instanceof Dog dog) {
            System.out.println(dog + " é um cachorro");
            return true;
        }
        return false;
    }

    static void showAverage(ArrayList<Product> arrayProducts) {
        double total = 0;
        for (Product product : arrayProducts) {
            total += product.getPrice();
        }
        double average = total / arrayProducts.size();
        System.out.println("Average price: " + average);
    }
}


