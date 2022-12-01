1. Create a new abstract Hero class with the following attributes:
   1. Name: String
   2. Age: number
   3. Nickname: String
   4. isGood: yes or no
2. Make the fields invisible from other classes.
3. Create constructor that throws an IllegalArgument exception if age > 1000 or is null.
4. Make heroes sortable by their age and their name.
5. Implement the important Object methods. toString videoFormat: "Name: name, Age: age, Nickname: nickname, isGood".
6. In the toString method handle if the nickname is null(Write none if it is)
7. Create subclasses for the Hero class(Support, Tank, Damage)
8. In the subclasses create a constructor that sets all the fields in the base Hero class.
9. The subclasses should have a role specific field(Support: healing, Tank: Shield, Damage: dps)
10. Read in hero values from a CSV.