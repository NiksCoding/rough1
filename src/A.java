import java.util.LinkedList;

public class A {


    public static class MyHashMap<K, V> {

        private static final int INITIAL_CAPACITY = 16; // Initial capacity of the array
        private LinkedList<Entry<K, V>>[] buckets; // Array to store linked lists of key-value pairs

        public MyHashMap() {
            buckets = new LinkedList[INITIAL_CAPACITY];
            for (int i = 0; i < INITIAL_CAPACITY; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        public void put(K key, V value) {
            int bucketIndex = getBucketIndex(key);
            LinkedList<Entry<K, V>> bucket = buckets[bucketIndex];

            for (Entry<K, V> entry : bucket) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    return;
                }
            }

            bucket.add(new Entry<>(key, value));
        }

        public V get(K key) {
            int bucketIndex = getBucketIndex(key);
            LinkedList<Entry<K, V>> bucket = buckets[bucketIndex];

            for (Entry<K, V> entry : bucket) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }

            return null; // Key not found
        }

        public void remove(K key) {
            int bucketIndex = getBucketIndex(key);
            LinkedList<Entry<K, V>> bucket = buckets[bucketIndex];

            Entry<K, V> toRemove = null;
            for (Entry<K, V> entry : bucket) {
                if (entry.key.equals(key)) {
                    toRemove = entry;
                    break;
                }
            }

            if (toRemove != null) {
                bucket.remove(toRemove);
            }
        }

        private int getBucketIndex(K key) {
            int hashCode = key.hashCode();
            return hashCode % INITIAL_CAPACITY;
        }

        private static class Entry<K, V> {
            K key;
            V value;

            Entry(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        public static void main(String[] args) {
            MyHashMap<String, Integer> hashMap = new MyHashMap<>();
            hashMap.put("one", 1);
            hashMap.put("two", 2);

            System.out.println(hashMap.get("one")); // Output: 1
            System.out.println(hashMap.get("two")); // Output: 2
            System.out.println(hashMap.get("three")); // Output: null

            hashMap.remove("one");
            System.out.println(hashMap.get("one")); // Output: null
        }
    }
}

