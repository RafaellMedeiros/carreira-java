package br.com.rafa.bank.manage;

import br.com.rafa.bank.manage.models.Options;

import java.util.Scanner;

public class Menu {
    public static void show() {
        System.out.println("  ____    _    _   _ _  __  __  __    _    _   _    _    ____ _____ \n" +
                " | __ )  / \\  | \\ | | |/ / |  \\/  |  / \\  | \\ | |  / \\  / ___| ____|\n" +
                " |  _ \\ / _ \\ |  \\| | ' /  | |\\/| | / _ \\ |  \\| | / _ \\| |  _|  _|  \n" +
                " | |_) / ___ \\| |\\  | . \\  | |  | |/ ___ \\| |\\  |/ ___ \\ |_| | |___ \n" +
                " |____/_/   \\_\\_| \\_|_|\\_\\ |_|  |_/_/   \\_\\_| \\_/_/   \\_\\____|_____|");

        System.out.println("-----------------------------------------------------------------------");

        System.out.println("O que deseja fazer ?");
        System.out.println("0 - Logar em uma conta");
        System.out.println("1 - Cria uma nova conta");
        System.out.println("2 - Listar contas");
        System.out.println("3 - Excluir conta");
        System.out.println("4 - fazer um deposito");
        System.out.println("5 - fazer um saque");

        System.out.println("-----------------------------------------------------------------------");
    }

    public static Options result() {
        Scanner  sc = new Scanner(System.in);
        int response = Integer.parseInt(sc.nextLine());
        return Options.getByCode(response);
    }
}
