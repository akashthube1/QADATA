package com.collections;
import java.util.*;

public class BookDetailsArrayList_List {

	public static void main(String[] args) {
		
	  List<Book> lst = new ArrayList<Book>();
	  Book b1 = new Book("Wings Of Fire","APJ Abdul Kalam",175.00f);
	  Book b2 = new Book("The Monk Who Sold His Ferrari","Robin Sharma",178.00f);
	  Book b3 = new Book("The Time Machine","H.G.Wells",100.00f);
	  lst.add(b1);
	  lst.add(b2);
	  lst.add(b3);
	  
	  for(Book bk:lst)
	  {
		  System.out.println("Book Name : "+bk.bookname+", Author : "+bk.author+", Price : "+bk.price);
	  }
	}
}

class Book
{
	String bookname;
	String author;
	Float price;
	
	Book(String bookname,String author,Float price)
	{
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}
}