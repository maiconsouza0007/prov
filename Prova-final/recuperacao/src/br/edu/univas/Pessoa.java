package br.edu.univas;


class Pessoa {
    protected String nome;
    protected String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }



    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}


class Professor extends Pessoa {
    private final String area;
    private final int cargaHoraria;

    public Professor(String nome, String cpf, String area, int cargaHoraria) {
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

class Funcionario extends Pessoa {
    private final String setor;

    public Funcionario(String nome, String cpf, String setor) {
        super(nome, cpf);
        this.setor = setor;
    }

    // Getters e setters

    public String getSetor() {
        return setor;
    }

}


class Aluno extends Pessoa {
    private final String dataNascimento;
    private final String curso;
    private final int periodo;

    public Aluno(String nome, String cpf, String dataNascimento, String curso, int periodo) {
        super(nome, cpf);
        this.dataNascimento = dataNascimento;
        this.curso = curso;
        this.periodo = periodo;
    }



    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCurso() {
        return curso;
    }

    public int getPeriodo() {
        return periodo;
    }

}


class SistemaAcademico {
    public static void main(String[] args) {

        Prof professor = new Prof("João Silva", "123456789", "Matemática", 40);
        System.out.println("Professor:");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("CPF: " + professor.getCpf());
        System.out.println("Área: " + professor.getArea());
        System.out.println("Carga Horária: " + professor.getCargaHoraria());


        Funcionario funcionario = new Funcionario("Maria Souza", "987654321", "Administração");
        System.out.println("\nFuncionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Setor: " + funcionario.getSetor());


        Aluno aluno = new Aluno("Pedro Santos", "456789123", "01/01/2000", "Engenharia", 3);
        System.out.println("\nAluno:");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Período: " + aluno.getPeriodo());
    }
}
