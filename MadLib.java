import java.util.Scanner;

public class MadLib{
    public static void main(String[] args){
        //Getting the code ready to listen for keyboard input.
        Scanner keyboardInput = new Scanner(System.in);
        
        String finalTemplate = "";
        
        /**
         * I want to change "I" in the sentence below.
         * I can use substring to get a new string and replace word by word.
         *  */  
        String sentence0 = "SpongeBob: We made it!";
        String sentence1 = "King Neptune: My crown. My beautiful crown!";
        String sentence2 = "Plankton: Oh yes spongebob well done";
        String sentence3 = "SpongeBob: Sorry to rain on your parade Plankton";
        String sentence4 = "Plankton: Oh dont worry about me. My parade shall be quite dry under my umbrella!";
        String sentence5 = "All: Umbrella?";
        String sentence6 = "Patrick: SpongeBob, what happened?";
        String sentence7 = "SpongeBob: Plankton Cheated.";
        String sentence8 = "Plankton: Cheated? Hold on there baldy. Oh grow up. What did you think that this was some game of kickball on the playground? You never had a chance to defeat me fool. And you know why?";
        String sentence9 = "SpongeBob: Because you cheated?";
        String sentence10 = "Plankton: No not because I cheated. Because I'm an evil genius. And you're just a kid. A stupid kid.";
        String sentence11 = "SpongeBob: I guess you're right Plankton. I am just a kid.";
        String sentence12 = "Plankton: Of course i'm right. Okay Neptune, time to kill";
        String sentence13 = "SpongeBob: And you know, i've been through a lot in the past six days, five minutes, 27 and a half seconds. And if i've learned anything during that time, it's that you are who you are.";
        String sentence14 = "Plankton: That's right. Okay Neptune...";
        String sentence15 = "SpongeBob: And no amount of mermaid magic, or managerial promotion, or some other third thing, can make me more than whay i truly am inside, A kid.";
        String sentence16 = "Plankton: That's great. now get back against the wall.";
        String sentence17 = "SpongeBob: But thats ok. because i did what everyone said a kid couldnt do. I made it to shell city, and i beat the cyclops, and i rode the hasselhoff, and i brought the crown back.";
        String sentence18 = "Plankton: All right, we get the point";
        String sentence19 = "SpongeBob: So, yeah, I'm a kid. And I'm also a goofball, and a wing nut, and a knucklehead McSpazatron!";
        String sentence20 = "Plankton: What's going on here?";
        String sentence21 = "Spongebob: But most of all I'm...";
        String sentence22 = "Plankton: Okay settle down. Take it easy.";
        String sentence23 = "SpongeBob: I'm... I'M A GOOFY GOOBER!";
        String sentence24 = "Plankton: What the scallop?!";
        
        /**
         * Sentence after I:
         * Make sure you include the whitespace in the substring
         *  */ 
        String replacement0 = sentence0.substring(6);
        String replacement1 = sentence1.substring(0, 17);
        String replacement2 = sentence1.substring(22, 37);
        String replacement3 = sentence2.substring(0, 17);
        String replacement18 = sentence2.substring(22);
        String replacement4 = sentence3.substring(6);
        String replacement5 = sentence4.substring(0, 59);
        String replacement6 = sentence4.substring(62);
        String replacement7 = sentence5.substring(0);
        String replacement8 = sentence6.substring(0, 9);
        String replacement9 = sentence6.substring(16);
        String replacement10 = sentence7.substring(4, 20);
        String replacement11 = sentence8.substring(0, 10);
        String replacement12 = sentence8.substring(17);
        String replacement13 = sentence9.substring(0, 23);
        String replacement14 = sentence9.substring(30);
        String replacement15 = sentence10.substring(0, 27);
        String replacement16 = sentence10.substring(35, 51);
        String replacement17 = sentence10.substring(55, 82);
        String replacement19 = sentence10.substring(85, 96);
        String replacement20 = sentence10.substring(99);
        
        
        System.out.println("Please enter a first name:");
        String myInput0 = keyboardInput.nextLine();
        
        System.out.println("Please enter an object:");
        String myInput1 = keyboardInput.nextLine();

        System.out.println("Please enter an adjective");
        String myInput2 = keyboardInput.nextLine();

        System.out.println("Please enter a past tense verb");
        String myInput3 = keyboardInput.nextLine();

        System.out.println("Please enter a 2nd adjective");
        String myInput4 = keyboardInput.nextLine();
        
        System.out.println("Please enter an farm animal");
        String myInput5 = keyboardInput.nextLine();

       
        /**
         * Concatenating my keyboard input and the rest of my sentence +
         * Concatenating it all into my finalTemplate Variable that I will output
         * at the end to show my altered quote
         */
        
         finalTemplate += myInput0 + replacement0 + "\n" + replacement1 + myInput1 + replacement2 + myInput1 + "\n" + replacement3 + myInput0 + replacement18 + "\n"  + myInput0 + replacement4 + "\n" + replacement5 + myInput2 + replacement6 + "\n" + replacement7 + "\n" + replacement8 + myInput0 + replacement9 + "\n" + myInput0 + replacement10 + myInput3 + "\n" + replacement11 + myInput3 + replacement12 + "\n" + replacement13 + myInput3 + replacement14 + "\n" + replacement15 + myInput3 + replacement16 + myInput4 + replacement17 + myInput5 + replacement19 + myInput5 + replacement20;

        //Outputting my altered quote
        System.out.print(finalTemplate);
        keyboardInput.close();
    }

}