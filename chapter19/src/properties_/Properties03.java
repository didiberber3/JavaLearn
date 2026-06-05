package properties_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws IOException {
//        创建properties文件，修改文件内容
        Properties properties = new Properties();

//        创建
//        如果该文件没有 这个key,那么set就是创建
//        如果该文件有 这个key, 那么set就是修改


        /*
        * Properties 的父类是Hashtable ,所以底层就是Hashtable 核心方法 put
        *
        *   public synchronized V put(K key, V value) {
        // Make sure the value is not null
        if (value == null) {
            throw new NullPointerException();
        }

        // Makes sure the key is not already in the hashtable.
        Entry<?,?> tab[] = table;
        int hash = key.hashCode();
        int index = (hash & 0x7FFFFFFF) % tab.length;
        @SuppressWarnings("unchecked")
        Entry<K,V> entry = (Entry<K,V>)tab[index];
        for(; entry != null ; entry = entry.next) {
            if ((entry.hash == hash) && entry.key.equals(key)) {
                V old = entry.value;
                entry.value = value; //如果存在就替换
                return old;
            }
        }

        addEntry(hash, key, value, index); //如果是新的key 就addEntry
        return null;
    }
        * */
        properties.setProperty("charset", "utf-8");
        properties.setProperty("user", "jason");
        properties.setProperty("password", "admin");

//        将kv存储到文件中
        properties.store(new FileOutputStream("src\\mysql2.propreties"),"hello world");
        System.out.println("成功保存");

    }
}
