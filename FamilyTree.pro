parent(jay, mitchell).
parent(mitchell, lily).
male(jay).
male(mitchell).
female(lily).
parent(jay, claire).
parent(gloria, joe).
parent(jay, manny).
parent(jay, joe).
parent(gloria, manny).
parent(cameron, lily).
parent(claire, haley).
parent(claire, alex).
parent(claire, luke).
parent(phil, haley).
parent(phil, alex).
parent(phil, luke).
female(gloria).
male(joe).
male(manny).
male(cameron).
female(claire).
male(phil).
female(alex).
female(haley).
male(luke).

grandfather(Person1, Person2) :-
	male(Person1),
	parent(Person1, X),
	parent(X, Person2).

grandmother(Person1, Person2) :-
	female(Person1),
	parent(Person1, X),
	parent(X, Person2).