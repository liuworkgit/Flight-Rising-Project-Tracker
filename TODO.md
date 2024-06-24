IDEA FOR ITEM/PROJ FILTER
- use itr patt (quote from refactor guru)

All iterators must implement the same interface. 
This makes the client code compatible with any collection type or any 
traversal algorithm as long as there’s a proper iterator. 
If you need a special way to traverse a collection, you just create a
new iterator class, without having to change the collection or the client.