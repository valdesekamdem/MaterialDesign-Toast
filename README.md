[![](https://jitpack.io/v/badboy-tian/MaterialDesign-Toast.svg)](https://jitpack.io/#badboy-tian/MaterialDesign-Toast)


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

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

```
implementation 'com.github.badboy-tian:MaterialDesign-Toast:Tag'

```

Now you can use **MDToast** as you wish by following the bellow code:
```java
MDToast mdToast = MDToast.makeText(Context context, String message, int duration, int type);
mdToast.show();
```
* **context** : is the context where Toast is called. In most cases it takes value `this` from activities or `getActivity()` from fragments. 
* **message** : The message to display.
* **duration (*optional*)** : the duration of the toast.
    * *MDToast.LENGTH_LONG* : for a long duration.
    * *MDToast.LENGTH_SHORT* : for a short duration.
* **type (*optional*)** : The type of toast to display. 
    * *MDToast.TYPE_INFO* : for info toast
    * *MDToast.TYPE_SUCCESS* : for success toast
    * *MDToast.TYPE_WARNING* : for warning toast
    * *MDToast.TYPE_ERROR* : for error toast

**Important to know** : If you don't specify the toast's duration and type, by default MDToast will used *MDToast.LENGTH_SHORT* for duration and *MDToast.TYPE_INFO* for type.

######
You can change the parameters during the runtime.

* **mdToast.setIcon(Drawable icon)** :  To set a drawable as the toast icon.

* **mdToast.setIcon(int iconId)**: To provide the icon resource id.

* **mdToast.setText(String message)** : To change the message of the toast.

* **mdToast.setType(int type)** : To change the type of the toast.

###### Note that *MDToast* inherits from *Toast* so you can always handle it as you do with *Toast*

## Contributing
Want to contribute ? You are welcome ! We are waiting for your pull requests.

## Contributors
* Valdèse Kamdem - valdesekamdem@gmail.com

