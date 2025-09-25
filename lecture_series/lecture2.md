## Work flow
1. Sprint
	1. items to be worked on
2. Scrum
	1. Review of work
3. Sprint review
	1. review of software

---

## Nested Classes

#### What?
- Encapsulation (protects code as hidden information, good for back end vs front end (what you want a user to see))
- Inheritance (properties of a class without changing class)
- Polymorphism 

OOP programming allows for re-use of code and information

Issues with encapsulation:
> OOP should usually be specialised
> problem if you have 2 'tightly coupled classes' that require sharing of members

>2 Types
>>Static and Inner

Static does not have access to instance members `satic class StaticNestedClass {`
Inner class does `class InnerClass {`

#### Why?
== Closely linked classes could be totally encapsulated, so nesting works better ==
Inner class will also produce 2 compile files


#### Implementation:
`this` keyword used in inner class : `Outerclass.this`
`final` keyword prevents extensibility to inner classes
anonymous classes are declared without a class name (*very convoluted*) 
`enum` class