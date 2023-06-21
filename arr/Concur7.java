com.arr
import java.util.*;

public class Concur7{

int addAll(List list) {

Iterator it = list.iterator();

int total = 0;

while(it.hasNext()) {

int i = ((Integer)it.next()).intValue();

total =+ i;

}

return total;

}

public static void main(String[] args) {

// TODO Auto-generated method stub

List <Integer> mylist = new ArrayList<Integer>();

mylist.add(2);

mylist.add(3);

Concur7 adder = new Concur7();

int total = adder.addAll(mylist);

System.out.println(total);

}

}

