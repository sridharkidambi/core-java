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


Vectors:
1.Thread safe arraylist  is vector.its syncronized.

LinkedList
items knows which items comes next
add /remove itesm from the front will have same time complexity as there is no iteration for it.


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






