# PacmanAndroid
A mobile version of the of Pacman game on Android

Authors: Kevin Lee, Jimmy Le

## Running the game
1. Load the project on Android Studio
2. Connect your device to your computer using a usb cable
3. Press "Run" (Shift + F10 on Windows)
4. Choose the device you wish to run it on such as your phone or the Android Studio emulator
5. The game should run on your device

##Screenshots
###Title Screen

![] (http://i.imgur.com/uM2tITF.png)

###How to Play

![](http://i.imgur.com/8koRTPe.png)

###Settings

![](http://i.imgur.com/KTMnEkE.png)

###Starting a new game

![](http://i.imgur.com/tYzTmNB.png)

###Gameplay

![](http://i.imgur.com/7BPCeaK.png)

###Pause Menu

![](http://i.imgur.com/VNNbl3o.png)

###Game Over

![](http://i.imgur.com/yZDJ8Ve.png)









## Current progress (Already Done)
* Title screen
* Three buttons on the screen (New Game, Settings, and How to Play)
* New Game button takes you to a screen with the map layout and pacman
* How to play button leads to the how to play screen
* You can move pacman around by swiping in the direction you wish to go
* Pacman will eat the pellets.
* Pacman dies when he touches the ghost.
* The game can be paused.
* The High Score and the Current Score are displayed at the top of the screen during the game.
* Eating pellets increases the current score.
* If the current score surpasses the high score, the high score updates accordingly.
* There is background music that starts and stops appropriately.

## User Stories (Implementation Tasks/Goals):
1. ~~As a user, I can see the introduction screen when I open the app so that I can know it has sucessfully opened.~~ (100pts)
2. ~~As a user, I can see a play button and a help button and a high score button so that I can click on them.~~ (50pts)
3. ~~As a user, I can click on the help button so that I can know how to play.~~ (50pts)
4. ~~As a user, I can click on the play button so that I can start the actual game.~~ (50pts)
5. ~~As a user, I can see the game board so that I know the game is about to start.~~ (150pts)
6. ~~As a user, I can see my character on the gameboard so that I know where I start.~~ (50pts)
7. ~~As a user, I can move my character so that I see myself move across the game board.~~ (250pts)
  * ~~The character should animate.~~ (50 pts)
  * ~~The character should be able to move up down, left and right.~~(25 pts)
  * ~~The character should move based on user input (swipe gestures).~~ (75 pts)
  * ~~The character stops moving when it reaches a wall.~~ (100 pts)
8. ~~As a user, I can see the pellets on the board so I know where to move.~~ (50pts)
9. ~~As a user, I can see my score to see how well I've played.~~ (50pts)
10. ~~As a user, I can move my character to eat pellets so that I can get points.~~ (150pts)
 * ~~The pellet should dissapear when the character moves over it.~~ (100 pts)
 * ~~The score should increase when the pellets get eaten.~~ (50 pts)
11. ~~As a user, I can pause the game so that I can continue later on.~~ (50pts)
12. ~~As a user, I can unpause/resume the game so that I can continue where I left off.~~ (50pts)
13. ~~As a user, I can see enemy ghosts on the board so that I know where they spawn.~~ (50pts)
14. As a user, I can see enemy ghosts move so that I know where NOT to move. (250pts)
 * ~~The ghosts should animate.~~ (50 pts)
 * The ghosts should move according to unique personalities/behaviors. (200pts)
   * [Ghost AI Movement](http://gameinternals.com/post/2072558330/understanding-pac-man-ghost-behavior)
 * There is more than one ghost in the game. (200pts)
15. ~~As a user, I can keep track of my highest score so I can strive to beat it.~~ (50pts)
16. ~~As a user, I can hear Pacman background music so I can get HYPED.~~ (150pts)
 * ~~The music shoud start when the user opens the app.~~ (25pts)
 * ~~The music should stop when the app is not in focus.~~ (50pts)
 * ~~The music should be shared across all screens so there is no overlap.~~ (75pts)
17. As a user, I can see a mute button so that I have the ability to mute the music. (50pts)
18. As a user, I can click on the mute button to mute the music. (100 pts) 
19. As a user, I can set different difficulties so that I can make it easier or harder for myself. (200pts)
20. As a user, I can change the colors of the game so I can set things to my color preference. (100pts)
21. As a user, I can pause and continue the game using a pause button. (100pts)
22. As a user, I can start a new game after losing the previous game so that I can play again.
23. As a user, I can use the mega-pellet so that I can kill ghosts.
24. As a user, I can respawn the ghosts so that they come back after dying.
25. As a user, I can save settings so that preferences are set.


##W16 Final Remarks##
For future students, If you have no prior experience in android programming then it is highly recommended you at least go through the android tutorial [here](https://github.com/UCSB-CS56-Projects/cs56-android-getting-started). There are a couple of things that you should also be very familiar with which include: [Drawing/Animation](http://developer.android.com/guide/topics/graphics/2d-graphics.html), [Activities](http://developer.android.com/guide/components/activities.html), [Intents](http://developer.android.com/reference/android/content/Intent.html), [Touch Events](http://developer.android.com/reference/android/view/MotionEvent.html), [Bitmaps](http://developer.android.com/training/displaying-bitmaps/index.html), [Supporting multiple screens](http://developer.android.com/guide/practices/screens_support.html).

Next you are encouraged to look through DrawingView.java first as this is where the bulk of the code is including the animation, wall collision, points, etc. It may seem very overwhelming at first, and it is, but smart students like yourselves will understand it in no time. Right now the code is pretty messy especially in the DrawingView.java because we haven't refactored the code out to different classes for specific things like pacman or ghosts. That could possibly be one of the things you guys can do for points. 

Right now the core of the game is mostly done. The things that are currently working are the Main Menu Screen, Help Screen, Music, Pause/Resume, pacman animation using swipes, eating pellets, score system. The things that you guys should probably fix are the ghost AI (it kind of works but it has alot of bugs), making it so that when pacman and the ghosts touch each other pacman dies, centering the map without messing up the wall collisions (this may seem easy and even trivial however, keep in mind that since this is on android, the game will have to support multiple screen sizes and dimensions of a huge variety and this causes complicaitons with the wall collision), and make it so that when you finish eating all the pellets you go to the next level. By the way there should be a java file called BackgroundMusicService.java and note this is NOT the way music was implemented in the program, the way music was implemented in the program is using a static [mediaplayer](http://developer.android.com/guide/topics/media/mediaplayer.html) that could be accessed across all activities of the program. The way BackgroundMusicService implemented music is through [services](http://developer.android.com/guide/components/services.html) which you may choose to do if you like.

New features that you may like to add include settings that allow the user to change the difficulty, color of pacman/ghost, and allow users to choose their own music. Also I highly recommend that you guys add a mute button for the music because the music gets pretty annoying after a while (Note: it will get stuck in your head after you hear it for even a little bit). Perhaps you can also add another game mode and try to make it adhere to Google's [material design standard](https://www.google.com/design/spec/material-design/introduction.html#) if you have time. Well that's about it, I know this is a lot of information especially if you're new to android but trust me, it gets better and it's so much more fun and exciting once you get the hang of it. There is alot of good documentation about most of the things you need to know about android and Google is your friend.

##M16 Final Remarks##
For future students, if you have no prior android programming experience, then it is highly recommended that you go through the android tutorial links above.

To review, the code for each "screen" of the game, which handles the buttons/widgets is located under cs56-android-games-pacman/app/src/main/res/layout/("screen" you want to work on). From there, each widget's methods that are called are located in their corresponding class underthe first, /app/src/main/java/com.example.jimmyle.pacmanandroid./("screen" you want to work on)  For example, the code for the Main layout is located in MainActivity.java. This should provide a basic knowledge foundation on where to look for things in the game.

We fixed one of the issues that the W16 class had which was the refactoring of the DrawingView class into seperate classes that could handle their own behavior. So far we created a BitmapImages class for getting bitmap images of pacman, the ghost and the world objects. We created to character objects Pacman and Ghost which would allow them to be a fully encapsulated class. We added a Movement class for handling the movement of the characters, one thing you could improve would be changing the methods to be static so new ghosts could be added. Also, we have a PlayerDeathException class that throws an exception when a ghost touches a player which could be improved upon if new ghosts are added.

A new feature we added is the ability to select levels through the Settings page. At the handled by the Global variable "levelSelector", which is set in SettingsActivity.java and later called in DrawingView.java, which is the class used to draw the map. If you wish to add new levels, simply create a new multi-dimensional array of bitmaps in LevelGenerator.java and add in the case in LevelGenerator.java's getMap(int level) method.

Another new feature we added is the ability to mute the music from the Settings page. This is handled in SettingsActivity.java.

We refactored DrawingView into smaller classes and objects, but there is still a long way to go before it is a single drawing class. You can take all of the methods that run the game a put them into a game controller in order to have seperate classes and behaviors. 

##F16 Final Remarks##
For future students, if you have no prior android programming experience, then it is highly 
recommended that you go through the android tutorial links above. There are a couple of things 
that you should also be very familiar with which include: Drawing/Animation, Activities, Intents, 
Touch Events, Bitmaps, Supporting multiple screens.

The game's current and completed issues are listed above.
We've added screenshots to show what the game and its menus look like. 
There are some instances that cause the game to crash but otherwise the game runs fine.

The classes are stored in app/src/main/java/com/example/jimmyle/pacmanandroid.

The classes that end in Activity hold the code for the menus. The code for the buttons and related widgets in the menus are stored in the .xml files in app/src/main/res/layout. 
The images are stored in app/src/main/res/drawable. The BitmapImages class loads these images.
The Gameconditions class holds the conditions that are run per instance of the game. 
The Globals class holds the values that exist outside of the game such as high score. 
The Movement class holds the movement behavior the ghosts and pacman. There are four copies of 
ghost movement methods for each ghost. 
The UserInterface class holds the draw methods for the elements of the user class.
There are currently three levels in the game and the code for those levels is stored in the LevelGenerator class.
The DrawingView class instantiates the map, draws the figures, and runs the game. 

Drawing View has been refactored to separate the draw methods, game conditions, and entity movements.
A pause button and a mute button have been added to the game. More ghosts have been added to the game. The difficulty buttons now change color when selected.

Some issues future students can focus on are giving each ghost a unique behavior, adding more levels to expand the scope of the game, adding powerups (http://pacman.wikia.com/wiki/Power-Ups), adding sound effects such as the wakka noise, and adding animations such as the death animation.
## Project History
```
M16 | Kevin Chan, Cole Rogers | W16 | Kevin Lee, Jimmy Le | F16 | Austin Dorotheo, Miclos Lobins | CS56 Conrad | 4PM Section
```
