package com.zjm.day.尚硅谷.双链表;

/**
 * @Author zjm
 * @Description:
 * @Date: Created in 12:26 2021/9/10
 * @Modified By:
 */
public class Methods {

    Node head = new Node(0,"");

    /**
     * 添加
     * @param node
     */
    public void add(Node node){
        Node cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
        node.pre = cur;
    }

    /**
     * 修改
     * @param node
     */
    public void update(Node node){
        Node cur = head;
        while (cur.next != null){
            if (cur.next.no == node.no){
                cur.next.name = node.name;
                break;
            }
            cur = cur.next;
        }
    }


    /**
     * 删除
     * @param node
     */
    public void del(Node node){
        Node cur = head;
        while (cur.next != null){
            if (cur.next.no == node.no){
                cur.next.pre = cur;
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
    }


    /**
     * 遍历双向链表
     */
    public void show(){
        Node cur = head;
        while (cur.next != null){
            System.out.println(cur.next);
            cur = cur.next;
        }
    }



    /**
     * 节点数量
     */
    public int count(){
        Node cur = head;
        int count = 0;
        while (cur.next != null){
            count++;
            cur = cur.next;
        }
        return count;
    }



    /**
     * 节点数量
     */
    public boolean isEmpty(){
        if (head.next == null) {
            System.out.println("链表为空");
            return true;
        }
        return false;
    }

    /**
     * 顺醋添加
     * @param node
     */
    public void addOrder(Node node){
        Node cur = head;
        while (cur.next != null){
            if (cur.next.no >= node.no){
                cur.next.pre = node;
                node.next = cur.next;
                cur.next = node;
                node.pre = cur;
                break;
            }
            cur = cur.next;
        }
        if (cur.next == null){
            cur.next = node;
            node.pre = cur;
        }
    }



    /*------------------------面试题--------------------------*/

    /**
     * 反转链表
     */
    public void reversalLink(){

    }

}
