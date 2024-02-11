/*create a parent class "Artist" with a member function "void perform()".
now derive following child classes from "Artist"
	Actor,Singer and Musician and override "perform" in these classes to write the specific task.
inside "Actor" class define one more method
	void changeGateUp()
	{
		S.o.p("as per the role demands");
	}

now create a Demo class with main function.
inside main function create array of "Artist" with size 3.
store instances of the above child classes i`n it.
Now traverse through the array and invoke "perform" of each child class. 
In addition to this wherever "Actor" object is there inside the array , also perform "changeGateUp()" method.*/


class Artist {
    public void perform() {
        System.out.println("Performing as an artist");
    }
}

class Actor extends Artist {
    @Override
    public void perform() {
        System.out.println("Performing as an actor");
    }

    public void changeGateUp() {
        System.out.println("As per the role demands, changing gate up");
    }
}


class Singer extends Artist {
    @Override
    public void perform() {
        System.out.println("Performing as a singer");
    }
}

class Musician extends Artist {
    @Override
    public void perform() {
        System.out.println("Performing as a musician");
    }
}

public class Question_4 {
    public static void main(String[] args) {
        Artist[] artists = new Artist[3];
        artists[0] = new Actor();
        artists[1] = new Singer();
        artists[2] = new Musician();

        for (Artist artist : artists) {
            artist.perform();
            if (artist instanceof Actor) {
                Actor actor = (Actor) artist;
                actor.changeGateUp();
            }
        }
    }
}
