# Material Design Toast
**MD-Toast** is a simple and light Open Source Android library which, proposes Toasts (*popup*) with Material Design render.

## Overview
* **Info**

    ![Info Toast](https://raw.githubusercontent.com/valdesekamdem/MaterialDesign-Toast/master/images/info.png)
* **Success**
    
    ![Success Toast](https://raw.githubusercontent.com/valdesekamdem/MaterialDesign-Toast/master/images/success.png)
* **Warning**

    ![Warning Toast](https://raw.githubusercontent.com/valdesekamdem/MaterialDesign-Toast/master/images/warning.png)
* **Error**
    
    ![Error Toast](https://raw.githubusercontent.com/valdesekamdem/MaterialDesign-Toast/master/images/error.png)


## Demo
You can check the demo [Here](https://appetize.io/app/qvz4eg2e5j1debg99gpdzt6p74)

## Getting Started
Add Gradle dependency in the `build.gradle` file of your application module (**app** in the most cases) :

```java
dependencies {
    compile 'com.valdesekamdem.library:md-toast:0.8.0'
}
```

Make sure to specify the maven repository, where the project is hosted. Do this in `build.gradle` file of the parent project :

```java
repositories {
    ...
    maven {
        url 'https://dl.bintray.com/valdesekamdem/maven/'
    }
}
```

Now you can use **MDToast** as you wish just by calling it as follow : 
```java
MDToast.makeText(Context context, String message, int duration, int type);
```
* **context** : is the context where Toast is called. In most cases it takes value `this` from activities or `getActivity()` from fragments. 
* **message** : The message to display.
* **duration** : the duration of the toast.
    * *MDToast.LENGTH_LONG* : for a long duration.
    * *MDToast.LENGTH_SHORT* : for a short duration.
* **type (*optional*)** : The type of toast to display. 
    * *MDToast.TYPE_INFO* : for info toast
    * *MDToast.TYPE_SUCCESS* : for success toast
    * *MDToast.TYPE_WARNING* : for warning toast
    * *MDToast.TYPE_ERROR* : for error toast

**Important to know** : If you don't specify the toast's type, by default *MDToast.TYPE_INFO* is used.

## Contributing
Want to contribute ? You are welcome ! We are waiting for your pull requests.

## Contributors
* Valdèse Kamdem - valdesekamdem@gmail.com

