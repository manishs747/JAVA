package genrics;

public class OrderedPair<K, V> {

	private K key;
	private V value;

	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public static void main(String[] args) {

		OrderedPair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		OrderedPair<String, String> p2 = new OrderedPair<String, String>("hello", "world");


		// TODO Auto-generated method stub

	}

}
