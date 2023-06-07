# Android-Fusion-Compose
## Fusion library for Android: Compose module
Fusion: Flexible JSON driven UI rendering

### What is Fusion?
Fusion is a library designed to take JSON data representing UI, and render that data into the described UI.
The JSON data must match the Fusion JSON schema in order to render correctly.
This is part of the Fusion library for Android - there also exists a [Fusion library for iOS](https://github.com/3sidedcube/Fusion), so that Fusion can be used to build cross-platform UI.

### What is the Compose module for?
The Compose module provides implementations for all of the Fusion views using the Jetpack Compose framework.
A demo app is also included, to demonstrate how a Fusion app could be set up.

## Installation
[JitPack](https://jitpack.io/) is used to provide the Fusion artifacts.
In order to utilise the library in a project, update your `settings.gradle` (or root project `build.gradle` on older projects) to include the Jitpack maven repository:
```groovy
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
```
Then, in order to utilise the core Compose module in a project, add the following dependency to your `build.gradle` file:
```groovy
    implementation 'com.github.jr-mitchell.Android-Fusion-Compose:core:{versionCode}'
```
If you wish to utilise all modules in this repo, you can alternatively add the following dependency:
```groovy
    implementation 'com.github.3sidedcube:Android-Fusion-Compose:{versionCode}'
```
As these builds are provided using Jitpack, `{versionCode}` can be replaced with:

- A specific commit, e.g `1a2b3c4d5e`
- A specific branch's latest build, e.g `feature~jitpack-setup-SNAPSHOT`
- A specific pre-release tag, e.g `1.0.0-rc1`
- A specific release tag, e.g `1.0.0`

It is recommended that you use this library at a specific release tag, to ensure that the library is in a stable state.

## Usage
See the demo app to get an impression of the behaviour, or see the Wiki.
In order to run the demo app, you will need to update the constants `DEMO_URL` and `START_SCREEN` in `MainActivity.kt` to point to your JSON data source / API.

## FAQ
### What motivated the name "Fusion"?
Fusion here means to bring together two platforms, iOS and Android, powered by a single server-side API.
For web-server apps, the business logic should sit server-side as much as possible. Fusion aims to be as simple as "server tell me what to draw and I'll draw it".

### Why is this repository on a personal GitHub account rather than the 3SidedCube organisation?
At 3SidedCube, the stability and viability of Jetpack Compose for our projects is still under discussion.
Due to the experimental status of Jetpack Compose, we are not treating it as production ready at this point.
Therefore, this Fusion library is, to some extent, a prototype for a Jetpack Compose library.
It may not be kept as up-to-date as the Fusion libraries under the 3SidedCube organisation, since it is not currently used for production.
If, at some later point in time, we decide that Jetpack Compose is ready for production, the ownership of this repository may be transferred to the 3SidedCube repository.
