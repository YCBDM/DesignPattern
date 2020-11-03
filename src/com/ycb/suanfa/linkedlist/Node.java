package com.ycb.suanfa.linkedlist;

/**
 * @author Interesting
 * @version 1.0
 * @date 2020/9/8 7:43
 *
 * 单向链表节点类
 */
public class Node {

        private int Data;// 数据域
        private Node Next;// 指针域

        public Node(int Data) {
            // super();
            this.Data = Data;
        }

        public int getData() {
            return Data;
        }

        public void setData(int Data) {
            this.Data = Data;
        }

        public Node getNext() {
            return Next;
        }

        public void setNext(Node Next) {
            this.Next = Next;
        }
}
