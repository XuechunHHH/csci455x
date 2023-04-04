import java.util.Stack;

public class MatchParentheses {
    public static void main(String[] args) {
        String str = "()(())";
        System.out.println(matched(str));
    }

    public static boolean matched(String str) {
        return checkR(str, new Stack<Character>(), 0);
    }

    private static boolean checkR(String str, Stack<Character> stack, int idx) {
        if (idx >= str.length()){
            if (stack.isEmpty()) return true;
            return false;
        }
        if (str.charAt(idx) == '(') {
            stack.push('(');
        } else if (str.charAt(idx) == ')') {
            if (stack.isEmpty()) {
                return false;
            }
            stack.pop();
        }
        return checkR(str, stack, idx + 1);
    }
}
