package dataStructure;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LinkedList<T>
{

	Node<T> head = null;	
	Node<T> tail = null;
	
	int count=-1;
	
	public void add(T data)
	{
		Node<T> newNode= new Node<T>(data, null);
		if(head==null)
		{
			head = newNode;
			//tail=head;
		}
		else
		{
			
			Node<T> temp=head;
			
			while(temp.next != null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
		}
		count++;
	}
	
	
	public void insert(T data, int i)
	{
		if(i>count+1)
		{
			return;
		}
		else if(i==0)
		{
			Node<T> temp= new Node<T>(data, head);
			head = temp;
			count++;
		}
		else
		{
			Node<T> temp = head;
			int count2=0;
			while(count2++<i-1)
			{
				temp = temp.next;
			}
			
			Node<T> newNode = new Node<T>(data, temp.next);
			temp.next=newNode;
			count++;
		}
		
	}
	
	public int isEmpty()
	{
		if(head==null)
		{
			return-1;		
		}
		return 1;
	}
	
	public int size()
	{
		return count;
	}
	
	public int remove(T ele)
	{
		if(isEmpty()== -1)
		{
			return -1;
		}
		else if(head.data == ele)
		{
			head = head.next;
			count--;
		}
		else
		{
			Node<T> temp=head;
			
			while(temp.next.data.toString().compareTo(ele.toString())!=0 && temp.next.next != null)
			{
				temp =temp.next;
			}
			if(temp.next.data.toString().compareTo(ele.toString())==0)
			{
				Node temp2 = temp.next.next;
				temp.next.next=null;
				temp.next=temp2;
				count--;
			}
			else
			{
				return-1;
			}
		}
		return 1;
	}
	
	public int writeList(String fileName) throws IOException
	{
		BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
		
		Node<T> temp = head;
		while(temp.next!=null)
		{
			
			out.write(temp.data.toString()+" ");
			temp=temp.next;
		}
		out.write(temp.data.toString());
		out.close();
		return -1;
	}
	
	public int search(T ele)
	{
		
		int count2=1;
		if(isEmpty()== -1)
		{
			return -1;
		}
		else if(head.next==null)
		{
			return -1 ;
		}
		else if(head.data==ele)
		{
			return 0;
		}
		else
		{
			Node<T> temp=head;
			display();
			while(temp.next != null)
			{
				if(temp.data.toString().compareTo(ele.toString())==0)
				{
					return count2;
				}
				temp =temp.next;
				count2++;
			}
			if(temp.data.toString().compareTo(ele.toString())==0)
			{
				return count2;
			}
		}
		return -1;
				
	}
	
	public T pop()
	{
		
		Node<T> temp =head;
		
		while(temp.next != null)
		{
			temp=temp.next;
		}
		return temp.data;
		
	}
	
	public void display()
	{
		Node<T> temp=head;
		
		if(head==null)
		{
			
			System.out.print(" Null ");
			return;
		}
		while(temp.next != null)
		{
			System.out.print(" "+temp.data+"-->>");
			temp=temp.next;
		}
		System.out.print(" "+temp.data);
	}
	
	public static void main(String[] args) {
		
		LinkedList<Integer> queue= new LinkedList<Integer>();
		
		//queue.add(55);
		queue.insert(50, 0);
		queue.insert(45, 0);
		queue.insert(32, 0);
		queue.display();
	}
	
	
}
