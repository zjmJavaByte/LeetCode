package com.zjm.day.尚硅谷.栈.实现综合计算器;

import javafx.application.Application;
import javafx.stage.Stage;


/**
 * 后缀表达式
 *
 * 后缀表达式又称逆波兰表达式,与前缀表达式相似，只是运算符位于操作数之后
 *
 * 中举例说明： (3+4)×5-6 对应的后缀表达式就是 3 4 + 5 × 6 –
 *
 *
 * 后缀表达式的计算机求值
 *
 * 从左至右扫描表达式，遇到数字时，将数字压入堆栈，遇到运算符时，弹出栈顶的两个数，
 * 用运算符对它们做相应的计算（次顶元素 和 栈顶元素），并将结果入栈；
 * 重复上述过程直到表达式最右端，最后运算得出的值即为表达式的结果
 *
 * 例如: (3+4)×5-6 对应的后缀表达式就是 3 4 + 5 × 6 - , 针对后缀表达式求值步骤如下:
 *
 * 从左至右扫描，将3和4压入堆栈；
 * 遇到+运算符，因此弹出4和3（4为栈顶元素，3为次顶元素），计算出3+4的值，得7，再将7入栈；
 * 将5入栈；
 * 接下来是×运算符，因此弹出5和7，计算出7×5=35，将35入栈；
 * 将6入栈；
 * 最后是-运算符，计算出35-6的值，即29，由此得出最终结果
 *
 */
public class SuffixExpression /*extends Application*/ {

    /*public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println(primaryStage);
    }*/



}
