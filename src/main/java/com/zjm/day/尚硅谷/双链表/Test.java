package com.zjm.day.尚硅谷.双链表;

/**
 * @Author zjm
 * @Description:
 * @Date: Created in 12:30 2021/9/10
 * @Modified By:
 */
public class Test {

    public static void main(String[] args) {

        Methods methods = new Methods();

        System.out.println();
        System.out.println("----------------------添加-------------------");
        /*methods.add(new Node(1,"q"));
        methods.add(new Node(2,"w"));
        methods.add(new Node(3,"e"));
        methods.add(new Node(4,"r"));
        methods.add(new Node(5,"t"));
        methods.show();*/

        methods.addOrder(new Node(8,"q"));
        methods.addOrder(new Node(4,"w"));
        methods.addOrder(new Node(5,"e"));
        methods.addOrder(new Node(4,"r"));
        methods.addOrder(new Node(9,"t"));
        methods.show();

        System.out.println();
        System.out.println("----------------------修改-------------------");
        methods.update(new Node(3,"zzzz"));
        methods.show();

        System.out.println();
        System.out.println("----------------------删除-------------------");
        methods.del(new Node(3,"y"));
        methods.show();


    }

}
