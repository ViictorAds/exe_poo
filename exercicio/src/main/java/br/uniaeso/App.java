package br.uniaeso;

public class App 
{
    public static void main( String[] args )
    {

        Empresa empresa = new Empresa("TechNova", "987.654.3210-77");

       

        Departamento depar1 = new Departamento("Desenvolvimento de Software");
        Departamento depar2 = new Departamento("Pesquisa e Desenvolvimento");

        empresa.setDepartamento(depar1);

        

        Funcionario funcionario = new Funcionario("Victor", 2000.00, "21/04/2002"); 
        Funcionario funcionario2 = new Funcionario("Vinicius", 5000.00, "30/08/1999");
        Funcionario funcionario3 = new Funcionario("Ivone", 3000.00, "22/07/1983");

        depar1.setFuncionario(funcionario);
        depar1.setFuncionario(funcionario3);

        depar2.setFuncionario(funcionario2);
        

        funcionario.setSalario(2000.00);
        funcionario.getSalario();
        
        System.out.println("Salário com reajuste: " + funcionario.getSalario());


        depar1.removeFuncionario(funcionario3); 
        depar2.addFuncionario(funcionario3); 


        System.out.println("\nEmpresa: ");
        System.out.println(empresa.getNome());

        System.out.println("\nFuncionários da Empresa "+ empresa.getNome()+ ":");
        System.out.println(funcionario.getNome());
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario3.getNome());

        System.out.println("\nDepartamentos da Empresa "+ empresa.getNome()+ "+");
        System.out.println(depar1.getNome());
        System.out.println(depar2.getNome());

        System.out.println("\nFuncionários do departamento Desenvolvimento de Software:");
        for (Funcionario func : depar1.getFuncionario()) {
            System.out.println(func.getNome());
        }

        System.out.println("\nFuncionários do departamento Pesquisa e Desenvolvimento:");
        for (Funcionario func : depar2.getFuncionario()) {
            System.out.println(func.getNome());
        }

    }
}
