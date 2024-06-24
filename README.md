# FR Project Tracker
A Java application which tracks the pieces and progress of dragon projects on *Flight Rising.*

This project uses JDK 22 and the JUnit testing library version 5.9.0.

## What is Flight Rising?
[*Flight Rising*](https://www1.flightrising.com/) - often shortened to just "FR" - is an online 
petsim where users can collect, breed, train and dress a variety of unique dragon breeds.

## What are projects?
On FR, there are lots of ways to alter a dragon's appearance, ranging from giving them clothes 
and changing the patterns on their scales (known as "genes") to outright changing their breed 
and giving them "skins" (specially designed cosmetics that layer like flat PNGs onto the dragon).

Many users like to take a plain-looking dragon and change their appearance using the above 
methods. These "projects" can be very expensive to make, requiring large amounts of in-game 
currency and time. As well, having a lot of projects can make managing finances and obtaining 
the necessary finishing pieces difficult.

**This project aims to create a simple, intuitive and organized way to track one's FR projects.**

-----
# User Stories
With this application, users should be able to do the following to all their projects:
- filter projects by their total cost from most to least expensive (and vice 
  versa), as well as by a certain common piece.
- add a new project with the option to input a name, breed type, link to dragon on-site and its 
  final appearance.
- delete a project.
- rename a project.
- mark a project as "done" manually.
- see a project become "done" automatically upon marking off the last piece needed.
- edit a project's details (name, breed type, etc. See above).
- see the total amount of treasure and gems that they've spent over all their projects
- see the total amount of treasure and gems that they'll need for all their projects, ignoring 
  the ones that don't have costs listed for their pieces.

For a single project, users should be able to:
- see the completion status of a project based on the number of pieces obtained.
- see the total amount of treasure and gems spent on a single project.
- see the total amount of treasure and gems needed based on user-inputted costs for individual 
  pieces.
- add a new piece with the option to input a name, type, cost, priority, and link to its 
  database entry on-site.
- delete a piece.
- edit a piece's details.
- mark a piece as "obtained."
- filter a project's pieces by name, cost and priority.
- see all the pieces needed for a single project.

# Future Goals
In the future, I'd like to do the following:
- increase the filtering options for projects and pieces.
- implement a GUI.
- transform this application into an executable, so that other FR players can download and use 
  it on their local machines.