# core-java
core java and data structures

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



