## Methods

So what exactly are methods? Methods are chunks of code that run after they are "called". Methods help to reuse code and perform a certain process. 

### Method Declaration
accessSpecifier [static] returnType methodName (parameters)

This is a standard method declaration for the purposes of this java curriculum.

accessSpecifier - The accessSpecifier is not actually required to create a method, but what it does is it helps for something we will later learn called encapsulation. Some accessSpecifiers include public, private, and protected. For most of this course, all methods that we will write will be public methods.

static -  What it means for a method to be static is that it belongs to the class, and not an object of the class. We will discuss objects and classes in future videos, but for now, what it means is that any method that we call from the main method without an object must be static.

returnType - If a method will return a value, we need to specify the data type of the value that is returned. If not, the method has a **void** return type. Methods with a non-void return type require a return statement, which is the last line of code in the method.

methodName - Follow camel-case, be accurate and descriptive with what method should do.

parameters - Parameters are data that we can pass into the method when we call it, and we do so by listing out the types of data in the method declaration. More than one parameter requires commas in between each declaration. The parameters can only be used inside the method.

### Calling a Method

methodName() - calls the method.

For void methods, we can directly do:

	methodName();

since there is nothing being returned.

For methods with a returnType, we need to store the return value with a variable if we want to do something with the return value. The direct method call can also be used for corresponding processes (printing out the returned value of a method).

	String name = getName();
	System.out.println(name);
	System.out.println(getName());

For methods with parameters, we need to call the methods by passing in data inside the parentheses, and the data must match the parameters in the method declaration, both the data type and the same order.

	int product = multiply(3, 4);
	int three = 3;
	int four = 4;
	int product = multiply(three, four);

### Overloading
Java allows us to have multiple methods with the same name, as long as either the type or number of parameters is different. Like the example used in the lesson, we can have more than one method with the methodName being **multiply** because either the number of parameters or the type of each parameter is different.

	multiply(3, 4);
	multiply(3.0, 4.0);
	multiply(3, 4, 5);

This can help for cases where either the type or number of parameters is not specifically known, and could be different depending on the situation.

#### More Resources:

Note that the format of the code and/or method declarations may slightly differ from what is taught in the video.

- [explanation of methods - Programiz](https://www.programiz.com/java-programming/methods)
- [explanation of methods - W3Schools](https://www.w3schools.com/java/java_class_methods.asp)



Website: https://www.codingsanta.org

Contact for questions, concerns, errors: coding.santa2020@gmail.com
