# Build a simple Rock, Paper, Scissors game using Java

**Welcome** to the future of coding with GitHub Copilot! In this tutorial, we're going to harness the power of GitHub Copilot to build a simple yet engaging Rock, Paper, Scissors game using Java in IntelliJ IDEA. 

**GitHub Copilot** is your AI coding companion, suggesting entire lines of code as you type, making the development process not only efficient but also an exploration of cutting-edge technology. Whether you're a seasoned developer or just starting your coding journey, this guide will take you on a hands-on experience to create a classic game, highlighting the seamless collaboration between human and AI. 

So, let's leverage the capabilities of GitHub Copilot, fire up IntelliJ, and embark on this exciting journey of coding innovation. Let's dive in!

## Prerequisites

- [Installed IntellI IDEA](https://www.jetbrains.com/idea/download/)
- [GitHub Copilot Extension for IntellJ](https://plugins.jetbrains.com/plugin/17718-github-copilot)

[See this documentation on how to install Copilot extension for IntelliJ](/CopilotExtnsion4IntelliJ)

## Steps

### Step 1: Create a new class named `RockPaperScissors`

Start by opening up IntelliJ and creating a new class named `RockPaperScissors`. Create a class by going to **File** > **New** > **Java Class**. 

![open a new class named](images/new-class-step-one.png)

### Step 2: View `RockPaperScissors`

A new class named `RockPaperScissors` will be created and will look like this:

![name the class](images/name-class-step-two.png)

### Step 3: Add in comments

Add in comments to the class to describe what the class does. This will create context copilot will use to generate code suggestions. The comments should look like this:

```java
// create a rock paper scissors game
// 1. ask user to input rock paper or scissors
// 2. have the computer select a random choice
// 3. compare the two choices and send out the results
// 4. ask the user if they want to play again
```

![add in copilot comments](images/add-in-copilot-comments-step-three.png)

### Step 4: Ask user for input

Write out the step 1 comment into the class and press enter. GitHub Copilot should start suggesting code which you can decide to reject or accept. 

**_Shortcut Tip:_** If GH copilot has not started suggesting code you can trigger it by pressing: 

- `Option (⌥)+ \` for mac
- `Alt + \` for windows
- `Alt + \` for linux

![ask user for input](images/ask-user-for-input-step-four.png)

### Step 5: Add in computer input

Add in the step two comment and press enter. More code suggestions should appear. Accept the suggestions by pressing `Tab` or `Enter`. 

**_Shortcut Tip:_** If you don't like the first suggestion GitHub Copilot gives you, you can have it show you the next inline suggestion by pressing:

- `Option (⌥) or Alt+]` for Mac
- `Alt + ]` for Windows
- `Alt + ]` for Linux

![add in computer input](images/computer-input-step-five.png)

### Step 6: Add in logic via GitHub Copilot UI multi suggestion pannel

Add in the step three comment and press enter. GitHub Copilot should start suggesting code which you can decide to reject or accept.

![demonstrate multi solution pannel](images/demonstrate-multi-solutions-step-six.png)

### Step 6 (part 2): Add in logic via GitHub Copilot Inline suggestions

Another way to look through suggestions is to go to the "GitHub Copilot" tab on the right side of the screen. This will show you all the suggestions GitHub Copilot has for you.

![inline suggestions](images/inline-suggestion-step-six-2.png)

### Step 7: Ask user to play again

Add in the step four comment and press enter. GitHub Copilot will generate code to ask users if they want to play again.

**_Shortcut Tip:_** If you only want to add in part of the suggestion, you can use the following shortcut to accept word by word instead of the full suggestion:

- `Command (⌘) + arrow right` for Mac
- `Ctrl + arrow right` for Windows
- `Ctrl + arrow right` for Linux

![ask user to play again](images/ask-user-play-again-step-seven.png)

### Step 8: Run the game

Run the game by pressing the green play button in the top right corner of the screen. Start playing!

![run the game](images/run-the-game.png)
