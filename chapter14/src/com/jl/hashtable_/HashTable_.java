package com.jl.hashtable_;

import java.util.Hashtable;

@SuppressWarnings("all")
public class HashTable_ {

	public static void main(String[] args) {
		Hashtable table = new Hashtable();

		table.put("john", 100); //ok
//		table.put(null, 200);

		//Exception in thread "main" java.lang.NullPointerException
		//	at java.util.Hashtable.put(Hashtable.java:465)
		//	at com.jl.hashtable_.HashTable_.main(HashTable_.java:11)
//		table.put("john", null);

		//Exception in thread "main" java.lang.NullPointerException
		//	at java.util.Hashtable.put(Hashtable.java:460)
		//	at com.jl.hashtable_.HashTable_.main(HashTable_.java:15)
		table.put("lucy", 100); //ok
		table.put("link", 100); //ok
		table.put("link1", 88);
		table.put("link2", 88);
		table.put("link3", 88);
		table.put("link4", 88);
		table.put("link5", 88);
		table.put("link6", 88);
		table.put("link7", 88);
		table.put("link8", 88);


		System.out.println(table);
//		简单说明底层：
//		1. 底层有数组 Hashtable$Entry[] 初始化大小为 11
//		2. 临界值 threshold 8 = 11*0.75
//		3. 扩容：按照自己的扩容机制进行即可
//		4. 执行 方法 addEntry(haash,key,value,index);


//		Hashtable类的继承与接口的实现
//		public class Hashtable<K,V>
//    extends Dictionary<K,V>
//    implements Map<K,V>, Cloneable, java.io.Serializable


	}
}
