package com.zjm.day.尚硅谷.单链表;


/**
 * @Author zjm
 * @Description: 单向环形链表（约瑟夫）
 * @Date: Created in 12:49 2021/9/6
 * @Modified By:
 */
public class SingleTrackCirculateLink {



    private Node first;


    public SingleTrackCirculateLink(Node first) {
        this.first = first;
        first.next = first;
    }

    /**
     * 添加
     * @param addNode
     */
    public void add(Node addNode){
        Node cur = first;
        while (true){
            if (cur.next == first){
                addNode.next = cur.next;
                cur.next = addNode;
                break;
            }
            cur = cur.next;
        }

    }

    /**
     * 遍历
     */
    public void show(){
        Node cur = first;
        while (true){
            System.out.println(cur);
            cur = cur.next;
            if (cur == first){
                break;
            }
        }
    }

    /**
     *
     * @param startNo 表示从第几个小孩开始数数
     * @param countNum 表示数几下
     * @param nums 表示开始有多少个小孩在圈中
     */
    public void count(int startNo,int countNum,int nums){
        Node help = first;
        while (true){
            if (help.next == first){
                break;
            }
            help = help.next;
        }
        for (int i = 0; i < startNo - 1; i++) {
            first = first.next;
            help = help.next;
        }

        while (true){
            if (help == first){
                break;
            }
            for (int i = 0; i <countNum - 1; i++) {
                first = first.next;
                help = help.next;
            }
            System.out.printf("出圈的小孩子是%d \n",first.getNo());
            first = first.next;
            help.next = first;
        }
        System.out.printf("最后留在圈中的小孩子是%d \n",first.getNo());


    }



}