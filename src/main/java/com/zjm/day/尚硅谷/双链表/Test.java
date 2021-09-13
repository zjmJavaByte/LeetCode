package com.zjm.day.尚硅谷.双链表;

import static com.zjm.day.尚硅谷.双链表.Methods.mergeLink;

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
        methods.addOrder(new Node(3,"r"));
        methods.addOrder(new Node(9,"t"));
        methods.show();


        System.out.println();
        System.out.println("----------------------合并两个“有序”的链表，合并之后的链表依然有序-------------------");

        Node a0 = new Node(0, "");
        Node a = new Node(6, "a");
        Node s = new Node(7, "s");

        a0.next = a;
        a.pre = a0;
        a.next = s;
        s.pre = a;

        Node g0 = new Node(0, "");
        Node d = new Node(3, "d");
        Node f = new Node(9, "f");
        Node g = new Node(1, "g");

        g0.next = g;
        g.pre = g0;
        g.next = d;
        d.pre = g;
        d.next = f;
        f.pre = d;

        mergeLink(a0,g0);


        System.out.println();
        System.out.println("----------------------反转-------------------");
        methods.reversalLink();
        methods.show();

        System.out.println();
        System.out.println("----------------------节点个数-------------------");

        int i = methods.countNode();
        System.out.println("节点个数为：" + i);


        System.out.println();
        System.out.println("----------------------找到最后一个节点-------------------");
        Node node = methods.findLastNode();
        System.out.println("最后一个节点为：" + node);

        System.out.println();
        System.out.println("----------------------第k个节点-------------------");
        Node nodeByK = methods.findNodeByK(4);
        System.out.println("第k个节点为：" + nodeByK);

        System.out.println();
        System.out.println("----------------------从尾到头打印单链表-------------------");
        methods.printRev();


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
