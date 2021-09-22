package com.zjm.day.尚硅谷.栈.实现综合计算器;


import static com.zjm.day.尚硅谷.栈.实现综合计算器.Stack2.*;

public class Test {


    public static void main(String[] args) {
        String expresion = "3+2*6-2";//中缀表达式
        Stack2 numStack = new Stack2(10);
        Stack2 operStack = new Stack2(10);

        int index =  0;//用于扫描
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';
        while (true){
            //得到表示式的每个字符
            ch = expresion.substring(index,index+1).charAt(0);
            //如果是符号
            if (isOperation(ch)){
                //如果符号栈为空，则直接入栈
                if (operStack.isEmpty()){
                    operStack.push(ch);
                }else {
                    //如果不为空，就进行比较，如果当前的操作符的优先级小于或者等于栈中的操作符，就需要从数栈中取出两个数字，
                    //再从符号栈中pop出一个人符号，进行运算，将结果入数栈，然后将当前的操作符如符号栈
                    if (priority(ch) <= priority(operStack.getTop())){
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = cal(num1,num2,oper);
                        //把运算结果入栈
                        numStack.push(res);
                        operStack.push(ch);
                    }
                    else {
                        //如果当前优先级大于栈中的，则直接入栈
                        operStack.push(ch);
                    }
                }
            }else {
                //如果为数字
                //其实获取到的应该是字符  '1' ASCII 上'1'为49  ，所以需要减去48
                numStack.push(ch - 48);
            }

            index++;
            if (index >= expresion.length()){
                break;
            }
        }
        //当表达式扫描完毕，则计算最后的结果，数栈中只有一个数字【结果]
        while (true){
            if (operStack.isEmpty()){
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            int cal = cal(num1, num2, oper);
            numStack.push(cal);
        }
        System.out.printf("表达式：%s = %d \n",expresion,numStack.pop());

    }

}
