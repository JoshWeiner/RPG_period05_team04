# RPG_period05_team04

### Character Class
The Character class includes methods and fields and other members that are common in the Protagonist class and Monster class.

### Monster class
The Monster class extends the Character class. When the constructor of this class is invoked, it initalizes the Hp, the strength, the defense and the attackRating of the monster to its values and returns these values in a toString().

### Protagonist class
The Protagonist class extends the Character class. When the constructor of this class is invoked, it initalizes the Hp, the strength, the defense and the attackRating of the monster to its values and returns these values in a toString(). It has a method called specialize() and normalize() that changes the value of the Protagonist's defense  and attackRating.


### DoctorEggman Class
The DoctorEggman Class extends the Monster class. It has a constructor that changes the values of Hp, strength, defense and attackRating to values different in the Monster class. It has a toString that returns these values.


### KimJongUn Class
The KimJongUn Class extends the Monster class. It has a constructor that changes the values of Hp, strength, defense and attackRating to values different in the Monster class. It has a toString that returns these values.

### LordFarquaad Class
The LordFarquaad Class extends the Monster class. It has a constructor that changes the values of Hp, strength, defense and attackRating to values different in the Monster class. It has a toString that returns these values.

### Human Class
The Human class extends the Protagonist class. It has a field called pronoun which is a String type. It has a constructor that takes two Strings as parameters and changes the value of the name from the Protagonist class to the name in the parameter. It has a toString() that returns the pronoun and the name.

### Panda Class
The Panda class extends the Protagonist class. It has a field called kungFuSkill and routundness which are int types. It has a constructor that takes a String and two ints as parameters and changes the value of the name from the Protagonist class to the name in the parameter. It has a method that has a parameter, Monster, which is of Monster type. This method calculates the damageDone and returns the damageDone. It has a toString() that returns the name and it's kungFukSkill.

### StuyStudent Class
The StuyStudent class extends the Protagonist class. It has a field called lensThickness which are int types. It has a constructor that takes a String and an int as parameters and changes the value of the name from the Protagonist class to the name in the parameter. It has a toString() that returns the name.

### YoRPG Class
This class initalizes and creates the game.



