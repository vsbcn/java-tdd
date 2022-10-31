1. Employing TDD, create a method that takes in an integer n and returns an array of all odd integers from 1 to n. Write your tests first!

2. Java has certain words that are considered “Java Keywords”. Keywords are reserved and cannot be used as variable names. Employing TDD, create a method that takes in a String and returns true if the String contains any Java Keywords. For example, break is a Java keyword. The String "Don't break my heart" should return true. The String "I love to breakdance" should return false. You will need to use Google to find a list of all Java Keywords.

3. Create a Player class for a video game. Track the player’s stats (health, strength, lives, etc). Create 3 subclasses Warrior, Elf, Wizard. Provide at least one specialized behavior for each.

4. Employing TDD, create a method that decrements the lives of a player. The method should reduce the number of lives by one and restore the player’s health to its original state.

5. Employing TDD, create a method that allows one player to attack another. When a player attacks another, the attacked player’s health should decrease by the attacking player’s strength. For example, if a playerA has strength = 5 and a playerB has health = 20, then when the playerA attacks the playerB, the playerB's new health will be 15. Hint: the attack method will take a Player object as an argument.
