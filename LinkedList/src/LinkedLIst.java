import java.util.LinkedList;

public class LinkedLIst {
	static LinkedList list;
	public static void main(String[] args){
		list = new LinkedList();
		list.add(0, 0);
		list.add(1, 0);
		list.add(2, 1);
		list.add(3, 2);
		doubles();
	}
	private static void doubles() {
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
