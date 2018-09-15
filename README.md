# Fast ViewPager Library

[![](https://jitpack.io/v/alfianyusufabdullah/spager.svg)](https://jitpack.io/#alfianyusufabdullah/spager) [![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-SPager-green.svg?style=flat )]( https://android-arsenal.com/details/1/7006 )

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
implementation 'com.github.alfianyusufabdullah:spager:1.2.0'
```
## TODO
* Use AppCompat & Design Library
* Jangan lupa baca Bismillah

## Layout

first add this code on your layout
```xml
<com.alfianyusufabdullah.SPager
   android:id="@+id/mainPage"
   android:layout_width="match_parent"
   android:layout_height="match_parent" />
```

## Java Code
add this on your Activity/Fragment
```java
  SPager sPager = findViewById(...);
  
  sPager.initFragmentManager(getSupportFragmentManager());
  sPager.addPages("One" , new PageOne());
  sPager.addPages("Two" , new PageTwo());
  sPager.addPages("Three" , new PageThree());
  sPager.build();
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

## Kotlin Code

in kotlin you just add this on your Activity or Fragment
```kotlin
import kotlinx.android.synthetic.main.activity_main.*
    
mainToolbar.title = "SPager"
mainPage.init {
    addPages("One" , PageOne())
    addPages("Two" , PageTwo())
    addPages("Three" , PageThree())
}
```
and if you wanna add TabLayout just like this
```kotlin
import kotlinx.android.synthetic.main.activity_main.*
    
mainToolbar.title = "SPager"
mainPage.init(mainTabLayout) {
    addPages("One" , PageOne())
    addPages("Two" , PageTwo())
    addPages("Three" , PageThree())
}
```

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
