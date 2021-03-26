import java.util.Scanner;

public class StackTest {
    public static void main(String[] args) {
        Stack<Aluno> stack;
        stack = new StackObject<>();
        
        stack.push(new Aluno(1, "João", 21));
        stack.push(new Aluno(2, "José", 22));
        stack.push(new Aluno(3, "Julio", 23));
        stack.push(new Aluno(4, "Tiago", 24));
        try { // tente
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            // Erro! fila vazia
            System.out.println(stack.pop());
        } catch (IndexOutOfBoundsException ex) { // se pegar ....
            System.out.println(ex.getMessage());
        }
        System.out.println("Fim do programa!");
    }
}
