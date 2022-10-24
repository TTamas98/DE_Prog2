1. Create a new abstract Hero class with the following attributes:
   1. Name: String
   2. Age: number
   3. Nickname: String
   4. isGood: yes or no
2. Make the fields invisible from other classes.
3. Implement the important Object methods. toString format: "Name: name, Age: age, Nickname: nickname, isGood".
4. In the toString method handle if the nickname is null(Write none if it is)
5. Create subclasses for the Hero class(Support, Tank, Damage)
6. In the subclasses create a constructor that sets all the fields in the base Hero class.
7. The subclasses should have a role specific field(Support: healing, Tank: Shield, Damage: dps)
8. Read in hero values from a CSV.