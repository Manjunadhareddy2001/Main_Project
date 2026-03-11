package com.main;
import java.util.*;

public class Demo {

public static void main(String args[])
{
List<Integer> list = new ArrayList<>();

list.add(10);
list.add(20);
list.add(30);

ListIterator<Integer> it = list.listIterator();

while(it.hasNext())
{
System.out.println(it.next());
}

while(it.hasPrevious())
{
System.out.println(it.previous());
}
}
}