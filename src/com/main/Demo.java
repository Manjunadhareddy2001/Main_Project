package com.main;
import java.util.*;

public class Demo {

public static void main(String args[])
{
List<Object> list = new ArrayList<>();

list.add(0,"dj");
list.add(1,"og");
list.add(2,"pg");
list.add(3,"ab");


ListIterator<Object> li=list.listIterator();

while(li.hasNext()) {
	System.out.println(li.next());
}
while(li.hasPrevious()){
System.out.println(li.previous());
    }
}
}
