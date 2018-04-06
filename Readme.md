

![MacDown logo](https://logos-download.com/wp-content/uploads/2016/10/Kotlin_logo_wordmark.png)


# Say Hello to Kotlin !


Since May 2017 **Android** adding support for the **Kotlin** programming language. Kotlin is a brilliantly designed, mature language. It has already been adopted by several major developers — Expedia, Flipboard, Pinterest, Square, and others — for their production apps. Kotlin also plays well with the Java programming language; the effortless interoperation between the two languages has been a large part of Kotlin's appeal. [More informations about Kotlin](https://kotlinlang.org/).


## About the application
This application is a simple Android application with 2 calculator : Java and Kotlin. The objective is to learn how to develop in Kotlin and test how to integrate Kotlin code inside existing Java Android Application.

## Major features

### Null safety

Kotlin eliminates most sources of null references by making all types non-nullable by default — meaning that the compiler won’t let you use a non-initialized, non-nullable variable. If you need a variable to hold a null value, you have to declare the type as nullable, adding a question mark after the type.
Here is the code:

```
var nonNullable: String = "My string" // needs to be initialized 
var nullable: String?
```

### Higher-order functions and lambdas

One of Kotlin’s main features is higher-order functions. If you’re familiar with JavaScript (or C# and many others), you probably already know all about these functions. A higher-order function takes functions as parameters, or returns a function. One major use case for this is callback functions. We can create a function that makes a network call with two callbacks: one for success and another for error. In Kotlin, those would be two parameter functions, whereas in Java we would have to follow the pattern of having an interface, and pass an instance that implements that interface— which requires much more code. Functions can be stored in variables for later use, passed around, or created inside another function. If a function is not declared, but passed immediately as an expression, we call it a lambda, or an anonymous function. It is also called a “function literal.” Java 8 added support for lambdas, but if you’re developing for Android, you’re stuck with Java 7. This is one big reason why Kotlin is a great alternative to Java on Android.

Here is a comparison of how we would write a callback in Kotlin vs. Java.

In Kotlin:

```
fun networkCall(onSuccess: (ResultType) -> Unit,  
onError: (Throwable) -> Unit) { 
	try { 
		// … create and execute network request onSuccess(myResult) 
	} 
	catch(e: Throwable) { 
		onError(e) 
	} 
}
```

In Java:

```
public interface Callback { 
	void onSuccess(ResultType result); 
	void onError(Exception exception); 
} 
public void networkCall(Callback callback) { 
	try { 
		// … create and execute network request callback.onSuccess(myResult); 
	} catch(e: Throwable) { 
		callback.onError(e); 
	} 
}
```

#### References
[ARCTOUCH](https://arctouch.com/blog/kotlin-vs-java/)
[Developper Android](https://developer.android.com/kotlin/index.html)






