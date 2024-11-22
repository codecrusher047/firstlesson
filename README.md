

# The Cup Program 
🇨🇭 The Idea for this tutorial was born in a little Café in St. Ursanne JU, Switzerland, while talking about objects and classes in October 2024. 

🇰🇪 The software itself is proudly made in Nairobi, Kenya.

## Ideas and Goals

The idea is to develop a simple application that models a Café with Cups - as an introduction to object oriented programming with the programming language Java.   

It is focusses on the idea of using a language - «Java» - that makes programming having similar concepts like in real life with a real language to describ things - with the key differences between objects that «live», and classes that classify objects of the same type. It shows how objets have properties and behaviors - and how they can interact with each other. Properties are the state of the object, like size and content of a cup, and behaviors are the actions that the object can perform, like filling and emptying a cup. And how they behave in those cases. Behaviors are implemented as methods in the class.   

Furthermore, it introduces the concept of testing: instead of running a programm again and again by hand, it introduces some classes that simulate or «train» the objects an make assertions if the behave as expected. Those are called automated tests that can be run automatically and help to find bugs in the program.   

Then, it introduces the concept of collaboration: how to work together on a project around the globe: It introduces the version control system «git» and the platform «github».

The Cafe application is running purely in the console. It does not have any graphical user interface.  

In a later stage, it introduces the build system maven and the framework Quarkus - which is a framework to run a Web application on the local machine.  

# Lessons 

## lesson 1 - Install Stack 

Install VSCode and the Java Extension Packs - and the Java Development Kit (JDK) installed by  VSCode. 


We Implement the Classes: 
- `Cup`
- `Cafe` with cups 

Properties and Behaviors.  
The ´Cafe´ class has a `main` method that is called by the Operating System when running the program, and creates two `Cup` object and uses it. 

```java 
public class Cafe {
    public static void main(String[] args) {
        Cup evesCup = new Cup();
        evesCup.size = 200;
        //... and so on
```

Note:`String` is a class that represents a sequence, thus sring, of characters: is is basically a Text. The `toString()` method is therefore describing the behaviour how an object should transform itself to a textual representation, «to String».



## lesson 2 - methods / behavior

We enhance the `Cup` class with some more propoerties and behaviors: 

- `Cup` with `size` and `content` properties
- `Cup` with `fill` method. 
- We note that we cann fill more into a cup that the size of the cup.
- We try to correct the bug with introducing of `if and else` statement that checks if the cup is already full.

Show the Debuger - a way to stop the program at a certain point, step through and inspect the state of the program.

### homework

- find the bug with overfilling the cup.
- create an account on github.com and send me your username.

## lesson 3 - collaboration on GitHub 

- Introductions to git and github 
- markdown 

Install git on your machine and configure it with your email and name in the Terminal View: 

```shell 
git config --global user.email "your@mail.com"
git config --global user.name "Eve Adongo" 
```

Then, in VSCode open the Version Control View and publish the repository to github. 
Files that need to be published first are on «the stage» and will be commited to the local repository. Then, they can be pushed to the remote repository on github. 

### homework

- add a `public void empty()` method to the `Cup` class.


## lesson 4 - testing

- Introductions to automated tests 
- `CupTest` with tests for `fill` and `empty` methods.


## lesson 5 - lists and iteration

- `Cafe` with `List` of `Cup` objects
- Café can count the cups. 
- Before we actually programmed it, we programmed the test. 
- Rename Refactor `Cafe` to `CafeHouse` as it was confusing us. 


- calculate the total size of the cups in the cafe etc. 


## lesson 6 - inheritance

- Introduction to inheritance
- abstraction of `Cup`: Gefäss. 


## lesson 7 - interfaces and polymorphism

- Introduction to interfaces
- `Drinkable` interface and a Man that can drin. 


## lesson 8 - exceptions

- Introduction to exceptions


## lesson 9 - build system

- Introductions to maven


## lesson 10 - Quarkus

- hello world REST 
- hello world with Qute  



# 📒 References and Notes 

- [VSCode](https://code.visualstudio.com/) The very smart Text Editor that can do Java (and much more)  
- [git for Windows](https://git-scm.com/download/win) The Version Control System and Collaboration Protocol
- [GitHub Platform](https://github.com) - The Worldwide  Collaboration Platform based on git
- [maven](https://maven.apache.org/) - Build System that knows everything about the project - a Project Object Model (POM) and can automate the build process etc. 
- [Quarkus](https://quarkus.io/) - A very modern Framework to run a Web application based on Java. 

