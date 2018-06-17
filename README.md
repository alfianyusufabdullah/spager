# Fast ViewPager Library

[![](https://jitpack.io/v/alfianyusufabdullah/spager.svg)](https://jitpack.io/#alfianyusufabdullah/spager)

## Add Dependencies

1. Add it in your root **build.gradle** at the end of repositories:
```gradle
repositories {
 ...
  maven { url 'https://jitpack.io' }
}
```
2. on module app **build.gradle** 
```gradle
implementation 'com.github.alfianyusufabdullah:spager:1.1.0'
```
## TODO
* Use AppCompat & Design Library
* Jangan lupa baca Bismillah

## How To Use

first add this code on your layout

```xml
<com.alfianyusufabdullah.SPager
   android:id="@+id/mainPage"
   android:layout_width="match_parent"
   android:layout_height="match_parent" />
```

### * Java
and add this on your Activity/Fragment
```java
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
 
  SPager sPager = findViewById(...);
  sPager.initFragmentManager(getSupportFragmentManager());
  sPager.addPages("One" , new PageOne());
  sPager.addPages("Two" , new PageTwo());
  sPager.addPages("Three" , new PageThree());
  sPager.build();
 
}
```

if you wanna add tablayout just add this

```java
sPager.addTabLayout(tabLayout);
```

and finally code like this 

```java
@Override
protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
  
  TabLayout tabLayout = findViewById(R.id.mainTab);
 
  SPager sPager = findViewById(...);
  sPager.initFragmentManager(getSupportFragmentManager());
  sPager.addPages("One" , new FragmentOne());
  sPager.addPages("Two" , new FragmentTwo());
  sPager.addPages("Three" , new FragmentThree());
  sPager.addTabLayout(tabLayout);
  sPager.build();
 
}
```

### * Kotlin

add this on your Activity
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
 super.onCreate(savedInstanceState)
 setContentView(R.layout.activity_main)
 
  initViewPager(R.id.mainPage) {
   addPages("One", PageOne())
   addPages("Two", PageTwo())
   addPages("Three", PageThree())
  }
}
```
or on your fragment
```kotlin
override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
 super.onViewCreated(view, savedInstanceState)

 ((context as AppCompatActivity)).initViewPager(R.id.mainPage){
   addPages("One", PageOne())
   addPages("Two", PageTwo())
   addPages("Three", PageThree())
  }
}
```
if you wanna add tablayout just do like this
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
 super.onCreate(savedInstanceState)
 setContentView(R.layout.activity_main)
 
  tabLayout = findViewById(R.id.mainTabLayout)
 
  initViewPager(R.id.mainPage , tablayout) {
   addPages("One", PageOne())
   addPages("Two", PageTwo())
   addPages("Three", PageThree())
  }
}
```

## Preview
<img src="https://github.com/alfianyusufabdullah/spager/raw/master/sample/screenshoot/ss1.png" width="250"> <img src="https://github.com/alfianyusufabdullah/spager/raw/master/sample/screenshoot/ss2.png" width="250"> <img src="https://github.com/alfianyusufabdullah/spager/raw/master/sample/screenshoot/ss3.png" width="250">

## License

    Copyright 2017 Alfian Yusuf Abdullah

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
