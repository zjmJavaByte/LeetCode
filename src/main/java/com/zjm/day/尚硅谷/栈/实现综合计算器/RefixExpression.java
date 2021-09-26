package com.zjm.day.尚硅谷.栈.实现综合计算器;

import java.util.Stack;

/**
 * 前缀表达式 --》》波兰表达式
 * 前缀表达式运算符位于操作符之前
 * 举例说明：（ 3 + 4 ）* 5 - 6  --》》 - x + 3 4 5 6
 *
 * 前缀表达式的计算机求值
 * 从右至左扫描表达式，遇到数字时，将数字压入堆栈，遇到运算符时，弹出栈顶的两个数，用运算符对它们做相应的计算（栈顶元素 和 次顶元素），
 * 并将结果入栈；重复上述过程直到表达式最左端，最后运算得出的值即为表达式的结果
 *
 * 例如: (3+4)×5-6 对应的前缀表达式就是 - × + 3 4 5 6 , 针对前缀表达式求值步骤如下:
 *
 * 从右至左扫描，将6、5、4、3压入堆栈
 * 遇到+运算符，因此弹出3和4（3为栈顶元素，4为次顶元素），计算出3+4的值，得7，再将7入栈
 * 接下来是×运算符，因此弹出7和5，计算出7×5=35，将35入栈
 * 最后是-运算符，计算出35-6的值，即29，由此得出最终结果
 *
 */
public class RefixExpression {


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        String expression = "- * + 3 4 5 6";
        String[] s = expression.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            if (s[i].matches("\\d+")){
                stack.push(Integer.parseInt(s[i]));
            }else {
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                int cal = cal(num1, num2, s[i]);//先出栈的在运算符前面
                stack.push(cal);
            }
        }
        System.out.println(stack.pop());

    }

    /**
     * 判断是否为运算符
     * @param val
     * @return
     */
    public static boolean isOperation(String val){
        return val.equals("*") || val.equals("/") || val.equals("-") || val.equals("+");


    }

    /**
     * 运算
     * @param num1
     * @param num2
     * @param oper
     * @return
     */
    public static int cal(int num1,int num2,String oper){
        int res = 0;//用于存放计算的结果
        switch (oper){
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;//先出栈的作为被减数
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;//先出栈的作为被除数
                break;
            default:
                break;
        }
        return res;
    }

}
