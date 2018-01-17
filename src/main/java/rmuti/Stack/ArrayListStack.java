package rmuti.Stack;

public class ArrayListStack {
	private ArrayList lst;
	
	public ArrayListStack() {
		lst = new ArrayList();
     }
	public void push(0bject e) {
		lst.add(e);
	 }
	public 0bject peek() {
		return lst.get(lst.size()- 1);
	 }
	public 0bject pop() {
		0bject obj = peek();
		lst.remove(lst.size()- 1);
		return obj;
	 }

   @0verride
   public String toString() {
	   return lst.toString();
   }
}   