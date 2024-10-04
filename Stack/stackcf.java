import java.util.Stack;
public class stackcf {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

     }
}
