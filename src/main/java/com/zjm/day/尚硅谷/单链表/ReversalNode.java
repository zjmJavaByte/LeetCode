package com.zjm.day.尚硅谷.单链表;

import static com.zjm.day.尚硅谷.单链表.MethodLink.mergeLink;

/**
 * @Author zjm
 * @Description:
 * @Date: Created in 12:49 2021/9/6
 * @Modified By:
 */
public class ReversalNode {

    public static void main(String[] args) {

        MethodLink methodLink = new MethodLink();
        /*methodLink.add(new Node("z", 0, 1));
        methodLink.add(new Node("j", 1, 2));
        methodLink.add(new Node("m", 2, 3));
        methodLink.add(new Node("m", 3, 4));*/
        //methodLink.show();

        System.out.println("----------------------按顺序添加-------------------");

        methodLink.addOrder(new Node("z", 0, 7));
        methodLink.addOrder(new Node("j", 1, 2));
        methodLink.addOrder(new Node("m", 2, 3));
        methodLink.addOrder(new Node("m", 3, 5));
        methodLink.show();

        System.out.println();
        System.out.println("----------------------反转-------------------");

        methodLink.reversalLink();
        methodLink.show();


        System.out.println();
        System.out.println("----------------------合并两个有序的单链表，合并之后的链表依然有序-------------------");

        MethodLink methodLink2 = new MethodLink();
        methodLink2.add(new Node("q", 0, 1));
        methodLink2.add(new Node("w", 1, 8));
        methodLink2.add(new Node("e", 2, 6));
        methodLink2.add(new Node("r", 3, 4));


        System.out.println();
        System.out.println("----------------------节点个数-------------------");

        int i = methodLink.countNode();
        System.out.println("节点个数为：" + i);

        System.out.println();
        System.out.println("----------------------第k个节点-------------------");

        Node nodeByK = methodLink.findNodeByK(4);
        System.out.println("节点为：" + nodeByK);


        System.out.println();
        System.out.println("----------------------从尾到头打印单链表-------------------");

        methodLink.printRev();

        System.out.println();
        System.out.println("----------------------删除-------------------");
        methodLink.del(new Node("y", 3, 7));
        methodLink.show();


        System.out.println();
        System.out.println("----------------------修改-------------------");


        methodLink.update(new Node("y", 3, 2));
        methodLink.show();


        System.out.println();
        System.out.println("----------------------合并两个“有序”的单链表，合并之后的链表依然有序-------------------");

        Node node1 = new Node("",2,1);
        Node node2 = new Node("",2,2);
        Node node3 = new Node("",2,3);
        Node node4 = new Node("",2,4);
        Node node5 = new Node("",2,5);

        Node node6 = new Node("",0,0);
        Node node7 = new Node("",0,0);
        node6.next = node1;
        node7.next = node2;
        node1.next = node3;
        node3.next = node5;
        node2.next = node4;
        mergeLink(node6,node7);
    }





}
