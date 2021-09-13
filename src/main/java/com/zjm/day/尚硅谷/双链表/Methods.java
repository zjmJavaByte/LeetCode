package com.zjm.day.尚硅谷.双链表;

/**
 * @Author zjm
 * @Description:
 * @Date: Created in 12:26 2021/9/10
 * @Modified By:
 */
public class Methods {

    Node head = new Node(0, "");

    /**
     * 添加
     *
     * @param node
     */
    public void add(Node node) {
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
        node.pre = cur;
    }

    /**
     * 修改
     *
     * @param node
     */
    public void update(Node node) {
        Node cur = head;
        while (cur.next != null) {
            if (cur.next.no == node.no) {
                cur.next.name = node.name;
                break;
            }
            cur = cur.next;
        }
    }


    /**
     * 删除
     *
     * @param node
     */
    public void del(Node node) {
        Node cur = head;
        while (cur.next != null) {
            if (cur.next.no == node.no) {
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
    public void show() {
        Node cur = head;
        while (cur.next != null) {
            System.out.println(cur.next);
            cur = cur.next;
        }
    }


    /**
     * 节点数量
     */
    public int count() {
        Node cur = head;
        int count = 0;
        while (cur.next != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }


    /**
     * 链表是否为空
     */
    public boolean isEmpty() {
        if (head.next == null) {
            System.out.println("链表为空");
            return true;
        }
        return false;
    }

    /**
     * 顺序添加
     *
     * @param node
     */
    public void addOrder(Node node) {
        Node cur = head;
        while (cur.next != null) {
            if (cur.next.no >= node.no) {
                cur.next.pre = node;
                node.next = cur.next;
                cur.next = node;
                node.pre = cur;
                break;
            }
            cur = cur.next;
        }
        if (cur.next == null) {
            cur.next = node;
            node.pre = cur;
        }
    }



    /*------------------------面试题--------------------------*/

    /**
     * 求链表中有效节点的个数
     */
    public int countNode() {
        Node temp;
        if ((temp = head.next) == null) {
            System.out.println("链表为空");
            return 0;
        }
        int count = 1;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


    /**
     * 反转链表
     */
    public void reversalLink() {
        Node temp;
        if ((temp = head.next) == null) {
            System.out.println("链表为空");
            return;
        }
        Node reversalNode = new Node(1, "");
        Node node;
        while (temp != null) {
            //首先将temp下一个节点保存，然后操作temp节点
            node = temp.next;
            if (reversalNode.next == null) {
                temp.next = null;
                reversalNode.next = temp;
                temp.pre = reversalNode;
            } else {
                temp.next = reversalNode.next;
                reversalNode.next.pre = temp;
                reversalNode.next = temp;
                temp.pre = reversalNode;
            }
            //将temp移动到下一个节点
            temp = node;
        }
        reversalNode.next.pre = head;
        head.next = reversalNode.next;
    }

    /**
     * 找到最后一个节点
     *
     * @return
     */
    public Node findLastNode() {
        Node temp = head.next;
        while (temp != null) {
            if (temp.next == null) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    /**
     * 查找倒数第k个节点
     *
     * @param k
     * @return
     */
    public Node findNodeByK(int k) {
        int i = countNode();
        if (k > i) {
            return null;
        }
        int num = i - k;
        Node temp = head;
        while (num != 0) {
            num--;
            temp = temp.next;
        }
        return temp.next;
    }


    /**
     * 从尾到头打印单链表 【百度，要求方式 1：反向遍历 。 方式 2：Stack 栈】
     */
    public void printRev() {
        Node lastNode = findLastNode();
        while (lastNode.pre != null) {
            System.out.println(lastNode);
            lastNode = lastNode.pre;
        }
    }

    /**
     * 合并两个“有序”的链表，合并之后的链表依然有序
     *
     * @param node1
     * @param node2
     */
    public static void mergeLink(Node node1, Node node2) {
        Node node = new Node(0, "");
        Node temp = node;
        while (node1.next != null && node2.next != null) {
            if (node1.next.no < node2.next.no) {
                temp.next = node1.next;
                node1.next.pre = temp;
                if (node1.next.next != null){
                    node1.next.next.pre = node1;
                }
                node1.next = node1.next.next;
            } else {
                temp.next = node2.next;
                node2.next.pre = temp;
                if (node2.next.next != null){
                    node2.next.next.pre = node2;
                }
                node2.next = node2.next.next;
            }
            temp = temp.next;
        }
        if (node1.next != null) {
            temp.next = node1.next;
            node1.next.pre = temp;
        }
        if (node2.next != null) {
            temp.next = node2.next;
            node2.next.pre = temp;
        }
        while (node.next != null) {
            System.out.println(node.next);
            node = node.next;
        }
    }

}
