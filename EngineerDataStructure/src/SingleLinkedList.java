	class Node{//단방향
		int data;
		Node next = null;
		Node(int d){
			this.data=d;
		}
	
		void append(int d) {
			Node end = new Node(d);//노드생성
			Node n= this;//지금의 노드
			while(n.next!=null) {//끝까지감
				n=n.next;
			}
			n.next=end;
		}
		
		void delete(int d) {
			Node n = this;
			while(n.next!=null) {
				if(n.next.data==d) {
					n.next=n.next.next;
				}
				else {
					n=n.next;
				}
			}
		}
		
		void retrieve() {
			Node n=this;
			while(n.next!=null) {
				System.out.print(n.data+"->");
				n=n.next;
			}
			System.out.println(n.data);
		}
		}



public class SingleLinkedList {

	public static void main(String[] args) {
		Node head=new Node(1);
		head.append(2);
		head.append(3);
		head.append(4);
		head.retrieve();
		head.delete(2);
		head.retrieve();

	}

}
