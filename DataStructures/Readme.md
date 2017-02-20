This is an introduction to generics. Generics, or parameterized types, allow any data type to be used along with any data type.
This can be considered to be similar to templates in C++.
In Java, we use a placeholder <Item> notation after the class declaration. The main reason to use Generics is because
we do not know how the software written is going to be used and generics make the code, well, more generic in nature
by not allowing only a particular type of object to be passed as parameter. If , for some reason, there are some objects
which should not be allowed to be operated upon, use the IllegalArgumentException to handle those cases.
Generics array:
Java does not allow the creation of generic arrays. Thus something like a = new Item[num] would be treated as illegal.
To overcome this, we use type conversion for the same effect, namely: a = (Item[]) new Object[num] which creates an
array of references of type Object and then type casts it to Item[].

Autoboxing: Autoboxing allows the use generics with primitive data types. Automatically casting a primitive type to a
wrapper type is called as Autoboxing
eg: Stack<Integer> stack = new Stack<Integer>();
     int i = stack.pop(); //Integer -> int

Iterable collections: For most of the applications, we need to iterate over the items held in the collections.
eg: Queue<Transaction> queue = new Queue<Transaction>();
    for(Transaction t : collection) {
        //execute a block of code
    }
This essentially translates into the statement: foreach Transaction object t in collection, execute the block of code.
The client code does not need to know about the implementation or the details of the collection which is being used.
Thus, the same iteration could be used for Bag or a Queue.
To make a class iterable, we need to implement the Iterable<Item> interface.

Bag: A bag is a collection of items where removing the items is not supported. It provides the client with a way to
hold the items where the order of items is not really important. These can contain duplicate data and the order of
processing should remain immaterial to the client. This is a part of Apache.commons.collections package and can be accessed
here for more info about the API: https://commons.apache.org/proper/commons-collections/javadocs/api-2.1.1/org/apache/commons/collections/Bag.html
