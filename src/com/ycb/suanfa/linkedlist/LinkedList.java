package com.ycb.suanfa.linkedlist;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/8 7:45
 */
public class LinkedList {

    /**
     * 方法1：递归，在反转当前节点之前先反转后续节点
     */
    public static Node Reverse1(Node head) {
        // head看作是前一结点，head.getNext()是当前结点，reHead是反转后新链表的头结点
        if (head == null || head.getNext() == null) {
            return head;// 若为空链或者当前结点在尾结点，则直接还回
        }
        Node reHead = Reverse1(head.getNext());// 先反转后续节点head.getNext()
        head.getNext().setNext(head);// 将当前结点的指针域指向前一结点
        head.setNext(null);// 前一结点的指针域令为null;
        return reHead;// 反转后新链表的头结点
    }


    /**
     * 遍历，将当前节点的下一个节点缓存后更改当前节点指针
     */
    public static Node Reverse2(Node head) {
        if (head == null)
            return head;
        Node pre = head;// 上一结点
        Node cur = head.getNext();// 当前结点
        Node tmp;// 临时结点，用于保存当前结点的指针域（即下一结点）
        while (cur != null) {// 当前结点为null，说明位于尾结点
            tmp = cur.getNext();
            cur.setNext(pre);   //反转指针域的指向

            //指针往下移动
            pre = cur;
            cur = tmp;
        }
        // 最后将原链表的头节点的指针域置为null，还回新链表的头结点，即原链表的尾结点
        head.setNext(null);

        return pre;
    }


    /**
     * 删除某一个节点，并返回其值
     * 思路：先找到删除的节点，将指向被删除元素的指针，指向被删除元素的下一个节点；
     *         preNode.next = delNode.next;
     *      再将被删除元素的指针置为空；
     *          delNode.next = null;
     * */
    public int removeNode(Node Head,int index){
        if (Head == null){
            throw new IllegalArgumentException("remove failed,Illegal index");
        }

        //获取虚拟头结点
        Node prev = Head;
        for (int i = 0; i < index; i++) {
            //获取到删除元素之前节点
            prev = prev.getNext();
        }

        Node retNode = prev.getNext();  //被删除的元素
        prev = retNode.getNext();
        int N = retNode.getData();
        return N;
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        // 打印反转前的链表
        Node h = head;
        while (null != h) {
            System.out.print(h.getData() + " ");
            h = h.getNext();
        }
        // 调用反转方法
        head = Reverse2(head);

        System.out.println("\n**************************");
        // 打印反转后的结果
        while (null != head) {
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
    }

}

