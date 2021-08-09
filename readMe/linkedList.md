## LINKEDLIST
- Underlying data structure is Doubly Linked List
- Insertion Order preserved
- Duplicate element allowed
- Heterogeneous data can be stored
- Null Insertion is Possible
- It implements Serializable and Cloneable Interface but not RandomAccess Interface
- It is the best choice if our frequent operation is Insertion or Deletion in the middle
- It is worst Choice if our frequent operation is Retrieval Operation
- Extends Abstractlist class and Implements a Doubly Linked List
- Maintain Insertion Order
- It is usually used for Stack(LIFO) and Queue(FIFO)
- Not a thread safe

## methods
- addFirst
- addLast
- 

## How LinkedList works internally
- LinkedList data is stored inside a node
- Each node contains the reference to the next element and previous element
- If the frequent operatin is insertion and deletion at the middle, then linkedlist is recomended
- Linked list used Node class internally to store data
- Node have 3 elements
    - Element
    - Node<E> Next
    - Node<E> Previous
- 
