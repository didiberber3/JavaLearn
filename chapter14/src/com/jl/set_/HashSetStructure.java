package com.jl.set_;

public class HashSetStructure {

	public static void main(String[] args) {

//		hashset的底层就是hashmap

//		1. 创建一个数组
//		数组的类型是Node[]
//		有些人直接把Node[]数组称为表

		Node[] nodes = new Node[17];
		System.out.println(nodes);

//		创建节点
		Node node = new Node("john", null);

		//在索引为2的地方放进一个node
		nodes[2] = node;
		System.out.println("nodes=" + nodes);

		Node node1 = new Node("jacky", null);
		// 在2的node下面在放一个node1
		node.next = node1;//将jacky节点挂载到john后面

		Node node2 = new Node("rose", null);
		node1.next = node2;

		Node node3 = new Node("lucy", null);
		nodes[3] = node3;

		System.out.println("nodes=" + nodes);


	}
}

class Node {//节点,存储数据,可以指向下一个节点,从而行程链表
	Object item; //存放数据
	Node next; //指向下一个节点

	public Node(Object item, Node next) {
		this.item = item;
		this.next = next;
	}
}