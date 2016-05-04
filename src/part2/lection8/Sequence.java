package part2.lection8;

/*
 * Для виборки кожного об'єкту в послідовності передбачений інтерфейс Selector.
 * Він може перевірити чи досягнутий кінець end()
 * звернутися до поточного об'єкту current()
 * і перейти до наступного об'єкту next()
 * Так як Selector це інтерфейс, інші класи можуть його реалізовувати по своєму, а передача його в параметрі методу
 * підвищує універсальність коду.
 */
interface Selector {
	boolean end();

	Object current();

	void next();
}

class Pat {
	String name;

	Pat(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Тваринка з ім'ям " + name;
	}
}

/*
 * Клас "обгортка" для масиву з елементами Object, що має фіксований розмір. Для
 * додавання елементу в кінець використовується метод add()
 */
public class Sequence {
	private Object[] items;
	private int next = 0;

	public Sequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}

	/*
	 * Закритий клас, що надає функціональність інтерфейсу Зверніть увагу на
	 * методи внутрішнього класу. Вони працюють з закритими (private) полями
	 * зовнішнього класу.
	 */
	private class SequenceSelector implements Selector {
		private int i = 0;

		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if (i < items.length)
				i++;
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {

		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}

		sequence = new Sequence(5);
		sequence.add(new Pat("Gavchik"));
		sequence.add(new Pat("Murka"));
		sequence.add(new Pat("Gavryusha"));
		sequence.add(new Pat("Kriska"));
		sequence.add(new Pat("Shusha"));

		selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + "\n");
			selector.next();
		}
	}
}
