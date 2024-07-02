# FUNCTIONALITY OF ALL MODULES
ITEM
- mark as obtained (either by button or enter price. if price =/= cost, ask. can toggle off)
- change dets
- get dets
- make new item (is default unless user wants other vals)
- delete item

PROJECT
- see completion status
- see all items needed (fetch from manager?)
- see total spent/needed in t/g
- filter items by name, cost and priority
- find a certain item (from mngr)

projmngr (i.e. app itself)
- filter projs by cost, common piece
- find a certain proj by name
- add new proj with dets
- delete proj
- edit proj dets
- mark proj done (popup if unmarked items)
- see proj auto done after obt last item
- see total cost ever/need (get from projs total, which is from item total)

mngr
- filter by field
- mark obt
- add
- delete
- edit
- find by name

# PROGRESS
## MNGR
TODO - Children have specific data structs and iterators
manager simply provides the functionality
if abs class, mng imps fxn, then type item/proj as obj so
can use anywhere?

# IDEAS
## CENTRAL DB TO STORE ITEMS
- store items in central db
- when add new items, fetch names from db as suggestions
- this reduces time to type stuff out/redundancy

## OPTION TO TAG PROJS/ITEMS
## ABLE TO DUPE ITEMS/PROJS
- issue with hashmap
## ITEM/PROJ FILTER
https://refactoring.guru/design-patterns/iterator
- use itr patt (quote from refactor guru)

All iterators must implement the same interface. 
This makes the client code compatible with any collection type or any 
traversal algorithm as long as there’s a proper iterator. 
If you need a special way to traverse a collection, you just create a
new iterator class, without having to change the collection or the client.