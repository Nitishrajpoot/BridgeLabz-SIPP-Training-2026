package Stack;

import java.util.*;

class BalancedConfigBrackets{
    static boolean isValidConfig(String s){
        Deque<Character> stack=new ArrayDeque<>();

        Map<Character,Character> matchFor=Map.of(
            ')','(',
            ']','[',
            '}','{'
        );

        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()||stack.pop()!=matchFor.get(c))
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args){
        String s="{[()]}";

        System.out.println(isValidConfig(s));
    }
}
