package br.edu.univas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Prof extends Pessoa {
    private final String area;
    private final int cargaHoraria;

    public Prof(String nome, String cpf, String area, int cargaHoraria) {
        super(nome, cpf);
        this.area = area;
        this.cargaHoraria = cargaHoraria;
    }



    public String getArea() {
        return area;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

}


class sisacadmic {
    private final List<Prof> professores;

    public sisacadmic() {
        professores = new ArrayList<>();
    }


    public void cadastrarProfessor(String nome, String cpf, String area, int cargaHoraria) {
        Prof professor = new Prof(nome, cpf, area, cargaHoraria);
        professores.add(professor);
        System.out.println("Professor cadastrado com sucesso!");
    }


    public void listarProfessores() {
        System.out.println("Professores cadastrados:");
        for (Prof professor : professores) {
            System.out.println("Nome: " + professor.getNome());
            System.out.println("CPF: " + professor.getCpf());
            System.out.println("Área: " + professor.getArea());
            System.out.println("Carga Horária: " + professor.getCargaHoraria());
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        sisacadmic sistema = new sisacadmic();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Sistema Acadêmico ===");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Listar Professores");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("Área: ");
                String area = scanner.nextLine();
                System.out.print("Carga Horária: ");
                int cargaHoraria = scanner.nextInt();
                scanner.nextLine();

                sistema.cadastrarProfessor(nome, cpf, area, cargaHoraria);
            } else if (opcao == 2) {
                sistema.listarProfessores();
            } else if (opcao == 0) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();
        }

        System.out.println("Encerrando o programa...");
    }
}
