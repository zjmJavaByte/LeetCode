package com.zjm.day.尚硅谷.栈.实现综合计算器;

import java.util.Stack;

/**
 * 中缀表达式转后缀表达式
 *
 *
 * 1) 初始化两个栈:运算符栈 s1 和储存中间结果的栈 s2;
 * 2) 从左至右扫描中缀表达式;
 * 3) 遇到操作数时，将其压 s2;
 * 4) 遇到运算符时，比较其与 s1 栈顶运算符的优先级:
 * 1.如果 s1 为空，或栈顶运算符为左括号“(”，则直接将此运算符入栈;
 * 2.否则，若优先级比栈顶运算符的高，也将运算符压入 s1;
 * 3.否则，将 s1 栈顶的运算符弹出并压入到 s2 中，再次转到(4-1)与 s1 中新的栈顶运算符相比较;
 * 5) 遇到括号时:
 * (1) 如果是左括号“(”，则直接压入 s1
 * (2) 如果是右括号“)”，则依次弹出 s1 栈顶的运算符，并压入 s2，直到遇到左括号为止，此时将这一对括号丢弃
 * 6) 重复步骤 2 至 5，直到表达式的最右边
 * 7) 将 s1 中剩余的运算符依次弹出并压入 s2
 * 8) 依次弹出 s2 中的元素并输出，结果的逆序即为中缀表达式对应的后缀表达式
 *
 */
public class NifixToSuffix {

    public static void main(String[] args) {

        String expression = "1+((2+3)×4)-5";

        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();

        String[] split = expression.split("");
        for (String s : split) {
            if (s.matches("\\d+")){//数字
                s2.push(s);
            }else if (isOperation(s)){//运算符
                String lastElement;
                if (s1.empty() || (lastElement = s1.lastElement()).equals("(")){
                    s1.push(s);
                    continue;
                }
                int priority1 = priority(s);
                int priority2 = priority(lastElement);
                if (priority1 > priority2){
                    s1.push(s);
                    continue;
                }
                while (true){
                    String pop = s1.pop();
                    s2.push(pop);
                    if (s1.empty() || (lastElement = s1.lastElement()).equals("(")){
                        s1.push(s);
                        break;
                    }
                    int priority3 = priority(s);
                    int priority4 = priority(lastElement);
                    if (priority3 > priority4){
                        s1.push(s);
                        break;
                    }
                }

            }else {//小括号
                if ("(".equals(s)){
                    s1.push(s);
                }else {

                }
            }
        }



    }

    public static boolean isOperation(String val){
        return val.equals("*") || val.equals("/") || val.equals("-") || val.equals("+");
    }

    /**
     * 返回运算符的优先级，优先级是程序员自己定义的，优先级使用数组表示
     * 数字越大，则优先级就越高
     */
    public static int priority(String opr){
        if (opr.equals("*") || opr.equals("/")){
            return 1;
        }else if (opr.equals("-") || opr.equals("+")){
            return 0;
        }else {
            return -1;//假定目前
        }
    }

}
