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

## methods
- addFirst
- addLast
-

## How LinkedList works internally
- <img src="https://github.com/sibaprasad12/DataStructure-Algorithm-Collections/blob/main/readMe/Images/linkedList1.png" />
- LinkedList data is stored inside a node
- Each node contains the reference to the next element and previous element
- If the frequent operatin is insertion and deletion at the middle, then linkedlist is recomended
- Linked list used Node class internally to store data
- Node have 3 elements
  - Element
  - Node<E> Next
  - Node<E> Previous
- Node class looks like this

```
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
```  

- When we call addFirst(item), it will add item at the first position with the reference of the next element and the
  previous reference as null
- When we call addLast(item), it will add item at the last position with the reference of the previous element and the
  next reference as null
- THis is double linked list

## Doubly linked list  
<img src="hhttps://github.com/sibaprasad12/DataStructure-Algorithm-Collections/blob/main/readMe/Images/doublyLinkedList.png"/>
## Single linked list
- In single linked list,the node contains only value of the node and the reference of the next node
- Same way, the first node contains reference of the next node, the last node contains null as reference of the next
  node
<img src="https://github.com/sibaprasad12/DataStructure-Algorithm-Collections/blob/main/readMe/Images/singlyLinkedList.png"/>
## Circular linked list
<img src="https://github.com/sibaprasad12/DataStructure-Algorithm-Collections/blob/main/readMe/Images/circular.png"/>
