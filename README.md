# core-java

##### Autoboxing and unboxing:

converting a primitive type to a class type is called autoboxing.
vice versa is unboxing.


##### How to create Immutable class in Java?


Following are the requirements:
• Class must be declared as final (So that child classes can’t be created)
• Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
• A parameterized constructor
• Getter method for all the variables in it
• No setters(To not have option to change the value of the instance variable)



#####Immutable:
Immutable objects are very useful in multithreaded applications 
because they can be shared between threads without synchronization.


###### oAuth:

bcrypt is a password hashing function 

##### core java and data structures

this project summarizes  over the various data structure algorithms


Arrays:
continuous block of memory
every element occupies same amount of space.
the time to retreive an element is same for all elements if we know th index.

good for:
random access
inserting items at end

not good for
inserting at start
deletion of items.




Abstract Data Types
Abstract Data type (ADT) is a type (or class) for objects whose behavior is defined by a set of value and a set of operations.
The definition of ADT only mentions what operations are to be performed but not how these operations will be implemented. It does not specify how data will be organized in memory and what algorithms will be used for implementing the operations. It is called “abstract” because it gives an implementation independent view. The process of providing only the essentials and hiding the details is known as abstraction.
The user of data type need not know that data type is implemented, for example, we have been using int, float, char data types only with the knowledge with values that can take and operations that can be performed on them without any idea of how these types are implemented. So a user only needs to know what a data type can do but not how it will do it. We can think of ADT as a black box which hides the inner structure and design of the data type. Now we’ll define three ADTs namely List ADT, Stack ADT, Queue ADT.

Now we’ll define three ADTs namely List ADT, Stack ADT, Queue ADT.
https://www.geeksforgeeks.org/abstract-data-types/

Concurrency in JAva:
https://winterbe.com/posts/2015/04/30/java8-concurrency-tutorial-synchronized-locks-examples/


#####Vectors:
1.Thread safe arraylist  is vector.its syncronized.

###### ARRAY VS ARRAYLIST

Difference between Array and ArrayList are following:

Implementation of array is simple fixed sized array but Implementation of ArrayList is dynamic sized array.
Array can contain both primitives and objects but ArrayList can contain only object elements
You can’t use generics along with array but ArrayList allows us to use generics to ensure type safety.
You can use length variable to calculate length of an array but size() method to calculate size of ArrayList.
Array use assignment operator to store elements but ArrayList use add() to insert elements.

######LinkedList
items knows which items comes next
add /remove items from the front will have same time complexity as there is no iteration for it.


DoubleLinkedList:
Head or tail
complexity is O(1)

transient datatype (https://www.geeksforgeeks.org/transient-keyword-java/)
transient is a variables modifier used in serialization.
At the time of serialization, if we don’t want to save value of a particular variable in a file, then we use transient keyword. When JVM comes across
transient keyword, it ignores original value of the variable and save default value of that variable data type.
transient and static : Since static fields are not part of state of the object, there is no use/impact of using transient keyword with static variables. However there is no compilation error.
transient and final : final variables are directly serialized by their values, so there is no use/impact of declaring final variable as transient.
There is no compile-time error though.

Cicular linked list
lastnode points to the 1st.
aarray backed  be costant or linear
double linked list is ideal constant time


Stack:
Abstract datatype
LIFO
time complexity: Linkedlist O(1) if array O(N)
if u know size or memory is tight ,array is best
LikedList is ideal.
Deque<Integer> stack=new ArrayDeque<Integer>(); consider deque implementation against stack class as it provides more features
one example is linkedlist which implements the Deque interface.


Queue:
Abstract datatype
FIFO
JDK provides queue interface
Array blocking queue --capacity once created remains the same.
Concuurent Linked queue--non blocking thread safe
Linkedlist can be used for implementing the queue(inpmenets deque)
Supports insertation and removal at both ends.

Java has a arraydeque--which is resizable and no capacity restriction

LINKEDLIST  is ideal for implementing stack and queue.


Hashtable(dictionary,maps):
Abstract datatype like stack and queue
Key ,value pairs
optimized for retrival
associative array is a type of hashtable

Collision when 2 keys have same values and this can be handles programatically
loadfactor  =size/capacity


collision is resolved through probing( meaning fidning the next possible postion based ont he haspkey value if already occupied.)

LinearProbing:Storing the values in the array based on key ,if occupied key+1 and start from 0 again.

Chaining -> using the linkedlist

JDK hashtable
 hashtabel interface is MAP<K,V>  no collisions hence no duplicates over keys
  has HashMap concerte class  inherited
  its not syncronised   use collections.syncronisedmap or multi threads
  hashmap.putifabsent method will insert key only if not avaialable
  hashmap is a sub implementation of LinkedHashMap(hastable and linkedlist implementation)
  hashtable doesnt allow nulls wherehas hashmap allow nulls.it is syncronised whereas hashmap is not syncronised(use concuurent haspmap or collections,syncronisemap.).

Bucket sort:
put the numbers based on their buckets
ensure the left bucket is less than the right bucket list
sort each bucket using insertion sort( more performance when items are less)

while using the iterator don't use the remove u will get concurrent issue error.

Binary trees:
to keep the binary trees balanced we do see algos right AVL trees and red black trees.

types of search:
level (0,1,2)
pre-order (visit root of every subtree)
post-order (visit theroot of every subtree last)
inorder (visit left child,roo and right child) by default it si ordered.

JDK support
treemap<k,v> based on red black tree implementation for tree balancing.
not syncronized. so use collections.mapmmethod syncronized.


treeset :cannot contain duplicates its an abstract datatype


Heap:
A special type of binary tree.
process of converting a binary treee to heap is called heapify
types max heap and min heap
max heap :>  the parent is greater than the child.the min healp is otherwise.

while inserting/deleting use the rightmost leafnode to replace the deleted value and traverse upwards to heapify(max heap).



Advantages of binary heap over a BST:

average time insertion into a binary heap is O(1), for BST is O(log(n)). This is the killer feature of heaps.

There are also other heaps which reach O(1) amortized (stronger) like the Fibonacci Heap, and even worst case, like the Brodal queue, although they may not be practical because of non-asymptotic performance: https://stackoverflow.com/questions/30782636/are-fibonacci-heaps-or-brodal-queues-used-in-practice-anywhere

binary heaps can be efficiently implemented on top of either dynamic arrays or pointer-based trees, BST only pointer-based trees. So for the heap we can choose the more space efficient array implementation, if we can afford occasional resize latencies.

binary heap creation is O(n) worst case, O(n log(n)) for BST.

Advantage of BST over binary heap

search for arbitrary elements is O(log(n)). This is the killer feature of BSTs.

For heap, it is O(n) in general, except for the largest element which is O(1).

"False" advantage of heap over BST

heap is O(1) to find max, BST O(log(n)).

This is a common misconception, because it is trivial to modify a BST to keep track of the largest element, and update it whenever that element could be changed: on insertion of a larger one swap, on removal find the second largest. https://stackoverflow.com/questions/7878622/can-we-use-binary-search-tree-to-simulate-heap-operation (mentioned by Yeo).

Actually, this is a limitation of heaps compared to BSTs: the only efficient search is that for the largest element.


Priority queue :(a specfic usecase to Heap)

its an abstract datatype

priorityblockingqueue for syncronized


Set:
Doesnot allow duplicates(implements interface Set.Also an abstract datatype


Some principles of equals() method of Object class : If some other object is equal to a given object, then it follows these rules:


#####Shallow comparison: 
The default implementation of equals method is defined in Java.lang.Object class which simply checks 
if two Object references (say x and y) refer to the same Object. i.e. 
It checks if x == y. Since Object class has no data members that define its state, it is also known as shallow comparison.
#####Deep Comparison: 
Suppose a class provides its own implementation of equals() method in order to compare the Objects of 
that class w.r.t state of the Objects. That means data members (i.e. fields) of Objects are to be compared with one another. Such Comparison based on data members is known as deep comparison.


Reflexive : for any reference value a, a.equals(a) should return true.
Symmetric : for any reference values a and b, if a.equals(b) should return true then b.equals(a) must return true.
Transitive : for any reference values a, b, and c, if a.equals(b) returns true and b.equals(c) returns true, then a.equals(c) should return true.
Consistent : for any reference values a and b, multiple invocations of a.equals(b) consistently return true or consistently return false,
 provided no information used in equals comparisons on the object is modified.
 
 #######equals:
 equals(Object obj): a method provided by java.lang.Object that indicates whether some other object passed as an argument is "equal to" the current instance. The default implementation provided by the JDK is based on memory location — 
 two objects are equal if and only if they are stored in the same memory address.
 
 ######The general contract of hashCode is:
 HashSet stores its elements in memory buckets. Each bucket is linked to a particular hash code. 
 When calling students.add(alex1), Java stores alex1 inside a bucket and links it to the value of alex1.hashcode()
 
 
 During the execution of the application, if hashCode() is invoked more than once on the same Object then it must consistently return the same Integer value, provided no information used in equals(Object) comparison on the Object is modified. It is not necessary that this Integer value to be remained same 
 from one execution of the application to another execution of the same application.
 If two Objects are equal, according to the the equals(Object) method, then hashCode() method 
 must produce the same Integer on each of the two Objects.
 If two Objects are unequal, according to the the equals(Object) method, 
 It is not necessary the Integer value produced by hashCode() method on each of the two Objects will be distinct. 
 It can be same but producing the distinct Integer on each of the two Objects is better for improving the performance of hashing based Collections like HashMap, HashTable…etc.


###### LIST SET
Another key difference between List and Set is that List is an ordered collection, 
List's contract maintains insertion order or element. Set is an unordered collection, you get no guarantee on which order element
 will be stored. 

Though some of the Set implementation e.g. LinkedHashSet maintains order. Also SortedSet and SortedMap e.g. TreeSet and TreeMap 
maintain a sorting order, imposed by using Comparator or Comparable.
The list allows null elements and you can have many null objects in a List because it also allowed duplicates. 
Set just allow one null element as there is no duplicate permitted while in Map you can have null values and at most one null key. 

Worth noting is that Hashtable doesn't allow null key or values but HashMap allows null values and one null key.  
This is also the main difference between these two popular implementations of Map interface, aka HashMap vs Hashtable. 
