# LibrarySystem

Project Description:

  A short project which represents a basic library system where items contained in the library system can be
  added, removed, updated, or checked out/in by people contained in the library system. People in the system
  can also be removed, added, or updated. Checking out/in items reduces their availability attribute, so that
  items cannot be checked out if none are available in the system. This also adds the item to a Person's list
  of current items held. The library contains a sample of items found in a typical library: Book, DVD, and 
  Magazine. More item classes could be added without changing the existing code. 

Possible improvements:
 - include a librarian (as an interface) who can apply the methods.
 - further restrictions on methods (e.g. unable to remove Person from system if they are holding items)

Contents:
 - Readable (interface)
 - Library (class)
 - Person (class)
 - Item (abstract class) _parent_
 - DVD (class) _child_
 - Book (class) _child_
 - Magazine (class) _child_
 - Runner (class)
