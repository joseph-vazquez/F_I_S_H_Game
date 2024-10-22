//Joseph Vazquez

import java.util.Random;
import java.util.Scanner;

public class F_I_S_H {
    public static void main(String[] args) {

        // This is the main but it acts a script caller
        System.out.println("\n");
        System.out.println(introCard());
        System.out.println("\n");
        introCheck();
        System.out.println("\n");
        mainMenuCheck();
        type_100(startText());
        gamePlay();
        type_100(credits());
    }

    // Type speed really fast
    public static void type_5(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            pause((int) (Math.random() * 5));
        }
    }

    // Type speed kinda slow
    public static void type_100(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            pause((int) (Math.random() * 100));
        }
    }

    // Type speed pretty slow
    public static void type_300(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            pause((int) (Math.random() * 300));
        }
    }

    // Pause in-between characters
    // Creadit for this goes to csula Instructor: Keenan Knaur (GitHub)
    public static void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
        }
    }

    // This prints out the intro card
    public static String introCard() {
        String introCard = " ~ ~ FISH ~ ~ \n \n " +
                "* Federal. \n " +
                "* Intergalactic. \n " +
                "* Society. \n " +
                "* Of. \n " +
                "* Harvesting. \n \n \n " +
                "- Press 1 to play \n" +
                " - Press 2 to exit \n";
        return introCard;
    }

    // this checks what the user typed in in the introCard
    public static void introCheck() {
        Scanner input = new Scanner(System.in);
        inputPretty();
        int check = input.nextInt();
        System.out.println();
        if (check == 1) {
            System.out.print(mainMenu());
        } else if (check == 2) {
            System.out.print("Maybe another time :( ");
            System.exit(0);
        } else {
            System.out.print("Please only type in \"1\" if you want to play \n");
            System.out.print("\nPlease only type in \"2\" if you want to exit \n");
            introCheck();
        }
    }

    // this prints out the main menu
    public static String mainMenu() {
        String mainMenu = "\n\n" +
                "Hello and welcome to F.I.S.H, \n" +
                "This is a game about fishing!\n\n" +
                "Press 1 to start your adventure\n" +
                "Press 2 for help/ controls\n" +
                "Press 3 to quit\n\n" +
                "Press 9 to play a custom endless mode\n";
        return mainMenu;
    }

    // This does is the main hub for the checking and setting up the player to the
    // other menus
    public static void mainMenuCheck() {
        Scanner input = new Scanner(System.in);
        inputPretty();
        int check2 = input.nextInt();
        if (check2 == 1) {
            System.out.println("Let's Start Your Adventure!");
        } else if (check2 == 2) {
            System.out.print(help());
            System.out.print(mainMenu());
            mainMenuCheck();
        } else if (check2 == 3) {
            System.out.print("AWWW man... Maybe another time :( ");
            System.exit(0);
        } else if (check2 == 9) {
            endless();
        } else {
            System.out.println("Please press one number from the menu: \n");
            mainMenuCheck();
        }
    }

    // this just prints out the help menu
    public static String help() {
        String help = "\n\n" +
                "~~~~~~~~~~~~~~ HELP MENU ~~~~~~~~~~~~~~ \n\n" +
                "The program will ask you for your rod power -\n\n" +
                "There are 3 power levels of your fishing rod: \n" +
                "0: Little power - Bobber is near boat\n" +
                "1: Medium power - Bobber is pretty far\n" +
                "2: RAAAH POWER - You can no longer see the bobber, you just know it's somewhere in the ocean\n" +
                "\n\n" +
                "Now this menu will go back to the main menu \n \n" +
                "~~~~~~~~~~~~~~ HELP MENU ~~~~~~~~~~~~~~ \n";
        return help;
    }

    // this is the intro for the "story"
    public static String startText() {
        String startText = " \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n " +
                " \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "Hello young angler, \n" +
                "You are on your small row boat in the middle of an ocean. \n" +
                "Which ocean? We don't know and your google maps doesn't know either. \n" +
                "However, don't let this small detail scare you. \n\n" +
                "Let's start fishing! \n" +
                "You can carry up to 3 different \"aqua\" lifeforms\n\n" +
                "Ready?\n" +
                "Well.... You better be!\n";
        return startText;
    }

    // this is the where the buck of the gamePlay happens, this is where the user
    // gets the name and info about the "fish"
    public static void gamePlay() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            Random rand = new Random();
            System.out.println("\n What power level do you want?: \n* 0\n* 1\n* 2\n ");
            inputPretty();
            int fishRow = input.nextInt();
            if (fishRow == 0 || fishRow == 1 || fishRow == 2) {
                String[][] FishArt = { { "         >()0>" +
                        "       /`\\\n" +
                        "          \\o/       / \n" +
                        "     _____ |  _____/ \n" +
                        "     \\_         _/   \n" +
                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                        "         _\\_   \n" +
                                "       \\/  o\\  \n" +
                                "       //\\___= \n" +
                                "          ''' \n" +
                                "                     /`\\\n" +
                                "          \\o/       / \n" +
                                "     _____ |  _____/ \n" +
                                "     \\_         _/   \n" +
                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                        " \\``/ \n" +
                                "/o `)) \n" +
                                "/_/\\_ss)) \n" +
                                "   |_ss))  /| \n" +
                                "    |__ss))_| \n" +
                                "   |__sss))_| \n" +
                                "   |___ss))\\| \n" +
                                "    |_ss))   \n" +
                                "     )_s))  \n" +
                                "(`(  /_s)) \n" +
                                "(_\\/_s)) \n" +
                                " (\\/)) \n" +
                                "                   /`\\\n" +
                                "          \\o/       / \n" +
                                "     _____ |  _____/ \n" +
                                "     \\_         _/   \n" +
                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                        "     /\"*._          _ \n" +
                                "  .-*'`    `*-.._.-'/ \n" +
                                "< * ))     ,       ( \n" +
                                "  `*-._`._(__.--*\"`.\\ \n" +
                                "                     /`\\\n" +
                                "          \\o/       / \n" +
                                "     _____ |  _____/ \n" +
                                "     \\_         _/   \n" +
                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                        "/`\'''`8-.___\n" +
                                "\\   ._      ) \n" +
                                " '' ''''  ''' \n" +
                                "                     /`\\\n" +
                                "          \\o/       / \n" +
                                "     _____ |  _____/ \n" +
                                "     \\_         _/   \n" +
                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n"
                },

                        { "          ^   \n" +
                                "       /     \\  \n" +
                                "       |     |    \n " +
                                "      |     |     \n" +
                                "       | 0   |   \n" +
                                "       // ||\\\\   \n" +
                                "      (( //  ||   \n" +
                                "       \\\\))  \\\\   \n" +
                                "       //||   ))   \n" +
                                "       ))    //   \n" +
                                "      //     ((   \n" +
                                "                     /`\\\n" +
                                "          \\o/       / \n" +
                                "     _____ |  _____/ \n" +
                                "     \\_         _/   \n" +
                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                "   ><))))))))))'>    /`\\\n" +
                                        "          \\o/       / \n" +
                                        "     _____ |  _____/ \n" +
                                        "     \\_         _/   \n" +
                                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                "                                           =...  \n" +
                                        "                                               *:.. \n " +
                                        "                                               *:=. \n " +
                                        "                                               =-+.  \n" +
                                        "                    #=---------=**-           +:-.. \n" +
                                        "                  -*--=------=--------........:-::  \n" +
                                        "                +---------   :*---:-----:::--:-:  \n" +
                                        "                --==---=        :==---------::  \n" +
                                        "              :+------             :**=:-+#  \n" +
                                        "               +--=--- \n" +
                                        ".-==-.         +=----.  \n" +
                                        "=+==*+=      *----:  \n" +
                                        "--==#%=     :*=--+--  \n" +
                                        "--#======--------+  \n" +
                                        " +.*:====---=---*:  \n" +
                                        "       -#*+*#+:  \n" +
                                        "                     /`\\\n" +
                                        "          \\o/       / \n" +
                                        "     _____ |  _____/ \n" +
                                        "     \\_         _/   \n" +
                                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                "                             -#-#:      \n" +
                                        "                       @+%+*%%*+==+*#%#-. \n" +
                                        "                      =@#*-:**%=::::*#**+# \n" +
                                        "                    ##:::::%-:=::::::=*:.-%: \n" +
                                        "                #*+%**##*-::::::::::::::::::#- \n" +
                                        "               #@=:=#:::::::::::::::::::::.%#@= \n" +
                                        "          #=::-#*#::::-::::::::::::::::::::::-%+ \n" +
                                        "          #=:::::-::+#*%=:::::::::::::::::::::*##@: \n" +
                                        "          *#:::::::#+::+@=::::%%::::::::+@+::+*-@: \n" +
                                        "          +#:::::::+*:::::-:::-@@-:-+:=-:*@#::+#:+# \n" +
                                        "          #-::-*@=:-#@@@@%+:::::::::=#=:::::::*#%#: \n" +
                                        "           +*+-.:@=::::::::::::::::::::::::::-# \n" +
                                        "                #+##-:::::::::-:..........:-:#- \n" +
                                        "                    *#:......-%.+.......**+%%: \n" +
                                        "                      =#+:...:#+.........+%- \n" +
                                        "                        *-#@*=:.....:=#@+ \n" +
                                        "                         -*-....::=#-# \n" +
                                        "                     /`\\\n" +
                                        "          \\o/       / \n" +
                                        "     _____ |  _____/ \n" +
                                        "     \\_         _/   \n" +
                                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                "          :+#%##%##%%%%%%*:\n" +
                                        "         =##%#%#*#%##****#%%%-\n" +
                                        "       +###*##%#%%+:......-*%%+\n" +
                                        "      +#***%###%*:--=+*.-#*-=#%*\n" +
                                        "    +%*#%####%*:=...:=:*%%%-=#%=\n" +
                                        "    :%###%%%###:--....+-=**%%:#%*\n" +
                                        "    =#####%%%%+..:-:.-:=:-##+:+%*:\n" +
                                        "    ++#*%#%*##=------*=-+-:...+%#:\n" +
                                        "   :+*#*#####*--....+*=+=+#*#+*%*:\n" +
                                        "    +%#=######-:..:-:-=:--#+***#*\n" +
                                        "    =*#**##%##+:-=:--..+-#*+%*#%=\n" +
                                        "     #*#+##*#%#-..=:...---%#++%*\n" +
                                        "     :*#%*#%##%#-:-..-*%+.:-=%*\n" +
                                        "       +#%##%**##+-#++*%*.:*#*\n" +
                                        "        :+%%####%%#*----=#%#-\n" +
                                        "           :*##%%%%%%%#%%*:  \n" +
                                        "                     /`\\\n" +
                                        "          \\o/       / \n" +
                                        "     _____ |  _____/ \n" +
                                        "     \\_         _/   \n" +
                                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n"
                        },
                        { "    >())))))))\\/))))))))))0> \n" +
                                "\n" +
                                "          \\o/       / \n" +
                                "     _____ |  _____/ \n" +
                                "     \\_         _/   \n" +
                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                "                             -#*: \n" +
                                        "  -                          %#%+ \n" +
                                        "  -@#*                       =%*#%+ \n" +
                                        "    @%##:                   :%##*###*: \n" +
                                        "     #%#**             :*#%*===+++=--=*#- \n" +
                                        "      :%*=+=-#*=+*++#@##@@@@@@@@@@@@@@@@@@%+- \n" +
                                        "      :%*-+###*##@#@#@#@%%##**+*=+-*=-==-+++@@%=- \n" +
                                        "     *@#++:.+*=.:=                 -:.-:.-::-++--+*########*+=- \n" +
                                        "    #@+++         :##%*=       *%%*:-:*-=.:+=: \n" +
                                        "   %#%=            ##%:        #@*+#+ \n" +
                                        "                              =@*#%= \n" +
                                        "                             **-#=' \n " +
                                        "                    /`\\\n" +
                                        "          \\o/       / \n" +
                                        "     _____ |  _____/ \n" +
                                        "     \\_         _/   \n" +
                                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                "               ,  \n" +
                                        "             .' ;  \n" +
                                        "      . - ' ` . '      \n" +
                                        "  , '  . - ' - . ' \\    \n" +
                                        " ;   /          ' - '  \n" +
                                        "   |   \\               , - ,  \n" +
                                        "  \\    ' - . __       )_ ` ' . _  \n" +
                                        "    ' .           ` ` `            ` ` ' - - . _  \n" +
                                        "    . - '  ,                                        ` ' -  .  \n" +
                                        " ' - ' ` - . _                           ( (     o       )  \n" +
                                        "                 ` ' - - . . . . ( ` -  , __ . . - - '  \n" +
                                        "                              ' - ' `    \n" +
                                        "                     \n",
                                "                     =+          =+***= \n" +
                                        "                    :-#*+::::-=*##%%%+  \n" +
                                        "                    ::+%#########%%%+  \n" +
                                        "               +------#########%%##   \n" +
                                        "                =##*########%%###%#*  \n" +
                                        "                 =*%@########%%#%%#*  \n" +
                                        "                   *%####%%######%#*  \n" +
                                        "                   =##**##***######*  \n" +
                                        "                   +##*****##%%##***====\\ \n" +
                                        "                   *####%%%%####*++      \\========  \n" +
                                        "                   +##%%##**+                     \\======\n" +
                                        "                   +#%%#*  \n" +
                                        "                    +%*  \n" +
                                        "                     /`\\\n" +
                                        "          \\o/       / \n" +
                                        "     _____ |  _____/ \n" +
                                        "     \\_         _/   \n" +
                                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                "  #******+=+#@                           #+=+******# \n" +
                                        "    %#+++++***==#                    #==***+++++*%  \n" +
                                        "      #=====+++*+=*                #++*++======*  \n" +
                                        "       *=======+*++#  @        @  %++*+=======+@  \n" +
                                        "      @+=====++++*+++-:@ @%#@ @--=++*+++++=====%  \n" +
                                        "      *=+**+++=+*+++-=%+--:::-+%=-=++*+=+++***++  \n" +
                                        "     #**++===+**+#  %+==-:::--==+%  %+**+===++**#  \n" +
                                        "    %%%*+===***+%  #==+========+==#  @*+**===+*#%%  \n" +
                                        "        %==*+*+#   *==============+@  %+*+*==# \n" +
                                        "         **+=*+   %*==+========+==+#   *+++#+  \n" +
                                        "         **+=*+@%====+*=+=++=+=*+====# **=+**  \n" +
                                        "         %  %+*#%++*====O====O====*++##*+#  %@  \n" +
                                        "             @++*+**+*#+======+#**+*+*++%  \n" +
                                        "        @*==--=*+++#+*-=#*#**#+:*+**+++*=--=*@   \n" +
                                        "       *===+===-+**#=+*+======+*+=#***========+@  \n" +
                                        "      #=*#  %+===**+**++==--===+**+**+==+##@##==#   \n" +
                                        "      #*     *+++=+=====+=--===+===+===+*#==# %+*   \n" +
                                        "         *+ #*+==+======*====*====+==+++%%===@ @%   \n" +
                                        "         +=*@@**==+====+======++++===++*====+@   \n" +
                                        "     #=---++=+**+===+=====+========++***=++===+%  \n" +
                                        "    +=======+*++*+=======*+*++=====*+++*+=======*   \n" +
                                        "    +========+++*#+++++*++%++*+**+*+++====+======@  \n" +
                                        "    *+======+=====++++==+# *+===========+**+====*  \n" +
                                        "     %*+++##+++======+++%   #++======+++#+===++*  \n" +
                                        "             %*++++++*%       #*++++*%                \n" +
                                        "                     /`\\\n" +
                                        "          \\o/       / \n" +
                                        "     _____ |  _____/ \n" +
                                        "     \\_         _/   \n" +
                                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n"
                        } };

                String[][] FishNames = { { "Anchovy: ", "Goldfish: ", "Seahorse: ", "Toadfish: ", "Old shoe: " },
                        { "Squid: ", "Bass: ", "Eel: ", "Pufferfish: ", "Car tire: " },
                        { "Tuna: ", "Swordfish: ", "Great White Shark: ", "Manta Ray: ", "Cthulhu: " } };

                String FishInfo[][] = { {
                        "\nMany people like anchovies on pizza but they can also concentrate an acid, making them poisonous for humans to consume as a whole.\n",
                        "\nGoldfish can randomly turn carnivorous and are an invasive species if released into the wild.\n",
                        "\nBecause of their body shape, seahorses are rather inept swimmers and can easily die of exhaustion when caught in storm-roiled seas.\n",
                        "\nToadfish are named for their slimy skin which is related to frogs.\n",
                        "\nSize 12 old shoe, its wet and soggy as if it's been underwater for a while, how did it get here?\n" },
                        { "\nSquid have three hearts. Two branchial hearts feed the gills, each surrounding the larger systemic heart that pumps blood around the body.\n",
                                "\nDuring the spawn male bass will nudge females to help stimulate the release of eggs.\n ",
                                "\nEels eat shrimps, snails, fishes, mussels, and worms, and they generally live alone.\n ",
                                "\nPufferfish are ambush predators which detect their prey using pin-sharp vision.\n ",
                                "\nA car tire that looks ripped and torn, how did you get that onto the boat?\n " },
                        { "\nTuna can maintain a body temperature higher than that of the surrounding water, thanks to a network of blood vessels in its body.\n ",
                                "\nSwordfish have a unique organ near their eyes that warm their brains and eyes, allowing them to hunt in colder waters.\n ",
                                "\nShark teeth can move within the jaw, and they use this flexibility to understand what it is they're biting.\n ",
                                "\nThey are harmless to humans and do not have a spine on their tail for defense.\n ",
                                "" } };

                int fishColumn = rand.nextInt(5);

                if (fishColumn == 4 && fishRow == 2) {
                    System.out.println(FishArt[fishRow][fishColumn]);
                    Cthulhu();
                } else {
                    System.out.println(FishArt[fishRow][fishColumn]);
                    System.out.println(FishNames[fishRow][fishColumn]);
                    System.out.println(FishInfo[fishRow][fishColumn]);
                }
            }
            // This is the rest of "story"
            else {
                type_100("Please type in a vaid power level next time\n");
                type_100("Like wow you missed pretty bad...... like really really bad.....\n\n");
            }
        }
        type_100("\n\nWell young angler that boat of yours look full of fun!\n");
        type_100("\nI really do hope you enjoyed your time here in the middle of nowhere.\n\n\n\n");
        type_300("Uhhhh someone is gonna get you right?\n");
        type_300("uhhhhhhh       ...........\n\n\n");
        type_100("nahh Im sure you're fine!    :) \n");
        type_100("Catch! you later!");

    }

    // This is the funny Cthulhu catch
    public static void Cthulhu() {
        type_100("Cthulhu!");
        type_300("       a     what? \n");
        type_5("     A Cthulhu……. .......    wait what?̀ ̷̧̨̧̝̤͉͎͓͔̹͉̺̻̠̜͚̭̞̳̠͈͖̪̪̙̜̳̼̼̯̞̜̤̼͈͈̜̝́̎͜͜ͅo̵̧̘͎̱̣͚̬͇͙̫̭̯͉̅̿̊̑̐̽̏̀̅̐̿̾͂̓̋̅̉̔̈̈́͠ĥ̴̡̧̧̧̧̛̛̛̰͙̤̭͚̖̼͉̠̟̦̩͚̟͖̯̖̘̗̻̟̯̲̤̬̦̣̻̝̹̙͖̠̿̾̿̑͑̈̂̔̈́̏̍͌͛̒̄̀̀̋̿̈́̀͌̕̕͜͠͠͠ͅͅ ̶̛̮̳͉̖̬͍̦̻̭͑̌̐̓̏̈̿͛̃̈́̑̅́̿̄̿͌̑̓̀͋̅͒̌̆͂̌̂̄̀̌͒̓̀̍̑̃̑̄̓̍̕̚͘͘͠͝͝͠ń̸̢̢̢̛̗̱̩̰͙̼̦͔͚̯̍̆͐͐̃͂̾̏͂̇̓͗̉͑̒̉̍̋̄̐̑̌̅̄͜ó̴̡̨̠̳̝̗̹̮̉̂̓̎͑̍̄̓̄͗̈̆́̽͊̈́̂͌̉̔̃̄͂̓̽̄̾̔͂̀́̅̐́͛̾̚̕̕͠͠͠͝,̴̡̢̰͓̯̣̪͚͍͙͖̳͓͉̳͚̣̙̝̮͉͕̻͎̘̮͔̈̋̿̽̆̈́̇̍̈́͝ ̵̫͖̱̻͙͓̬̈́̉̈͛̄̂͆͐̑͗̿̉̕̕͠Í̸̡̛͚̺̘̟̯̬̰̳̤̭̻̙̘͙̖͚̖̺̰͓̬̗̪̰̺̯̰̟̭͛͆̏̏̆̀̋̉̀͒̔̆̌͘̕͠͝ ̵̛̳̯̺͓̳̤̘͍̦̼̦̞̟̜͚͙̮̈́͊́͊̅̋̆̅͒́̾̾́̅̎̑̅̄̄̀͑̅͋̓̔̂͊͐̊̕͜ş̷̨̢̛͈͕̳̤̥̳̭͍̣̹̞̠͎̩̺̭̩̘̫̳̙̯̲̰̭̀͂̾h̶̢̢͎̱̦̤̫͔͎̠̘̞̪͚̬͕͍̠͉̫̏͆͂͜ͅö̵̢̠̻̘̯̜͔̳̖̖̫̗̞̮̰̣͚̗̜̼̺͓͉̲̟̺͖͖̤̳͈̯̥̰̹̻͔̪̝̜͕̮́̓͑͋̑̊͛̀̈́̊͂̌̊͛͜͠ư̴̢̭̰̯̮̥̦̼̫̠͓̰̳̞̣͈̰̼̜̙̫͈̟̺͌ͅl̷̡̤̖̲̱̪̪̣͇̘͇̖͈̟̫͚̭̐̒̎̆͛̋͑̆̆̄̐̓̆͌̿͘̚͜͝d̶̨̡͔̫̻̦̝̤̩͔̦̭̯̘̝̫͉͙̭̝̣̫̲͕͖̤͇͍̯̻͔̱̿̍̾̊̈̃́͛͊̽̓͐́̏̅̔̉́̈́̾̒͐̒́̀͒̾͑͜͝͝ͅṅ̶̨̛̪̪̝̙͔̪̬̹̯̲̘̫̙͔̥̯̠̗͓̺͙͚̹̜̤͛̀̂̊͆̓̋͒̈́͑̃̿͗͊̈̽͊̍̏̃̍̎͜͜͝ͅ'̵̲̼̱̫̲̯̫̫̟͔̲̠̰̻̰͈̳̗̝̝̻͚̼̖̿͊͊́̃̎̍́̑̓͋̋͆̍͛͛̾̀̏̔̄̂̀̀͆͒̌̚̕̚̚͘͝͝ţ̷̨̧̨̛̠͔̹͙̜̙͎̮̜̹̜̩̗̱͎̹̥͚̱̣̭̱͇̹̲͕̃͗̽͆͐̎̿͒̓͂̀̌͛̀̅̀͛̅͆͑̔́͒̋́̎͑̄̎̃̊̀̀͗̆̎͘͘̚͝͝͝͠ͅͅ ̵̨̛̫̦̭͔̣͚͙̟̥̹̬̼̼̞̮͈͎̞̟̯͖̜̗̾̂̉̑̃̅͋͊͗͛̀͐̈́̋̈́̾̊̾͐̈̈̏͛̋̈̋̇̐̂̔͒̎̑͜͜͝͝͝͝h̶̛̛̞̉́͌̂͐͌̀̈̏̔̈́̌́̂̄̈͂͌̎̈́̀̐͋̀͌́̂̃͋̅̀̏̉̓̊̓̒͒̄͐͛̈̚̚a̷̫̳̙͇̜͍̲̯̤̋̈́͛͛̋͑̈́͊̈̊̽̌̒͛̈́̽̊͑̒̅̄̐͐͋͂͑̅̂͌̀͑͊̇̚͠͠͝͝v̴̨̡͕͔̫̗̩͉͔̲̬̮̻̰̬̮͕̯̤̲̂͛͑̈̄̄̍̈́̊͊͛͊̌́́̋͌̓́͌́̐̒̏͋͌̎̌͗̅̔̚͝ḛ̵̡̛̘̦̝͈̺̥̤͉̠͈̼̠̣͙̣̮̘͗͐̐̌͆̌̈̀̽̉̿̐̓̎̌̎̍̇̾͒́̂̀̒̃͊̉̆͂̋͋̉̅̍̽̐̽̔́̉̈͠͠ ̸̡̨̢̢̢̢̨̛̛̘̺̙̪̣͙͔̱͎̮̺͙̞̝̳̻̫̥̥̖͕̭͙͙͙͖͇̟̮͙̳̱͒͗͑́̿͑̌̍̈̈́̅̔̉͒̍͊̇̓͆͋̀͛̾̍͂̉̐́̕͘̕͝d̷̤̫̜̘̬̭̭͎̫̳̮̖̙͈͓͖̹͉͕̝̠̱̘̞̳̠̙̪̻̞̅̒̐́̍̈́̃́̽̄̓̋̀̐̑̽͑̿̈́̆̔̌͆̿̋̇͑̉̆̒͘͘͘̕̕͘͜͠͝ͅǫ̵̨̨̙̰̟̬͔̪͇͇̞͇̤̪͔͇͔̙̪͉͕͈̬͚͔͓͍̼͎͇͉̜̠̗̈́̒͛̾̅̀͗̓̈́̌̀́̈́̍̔̈́͌̇͐̐̍͗̄͛̀̾͗̓̔̈́̐̅͋͐̆͐̕͘͜͠͝͝͝n̴̛̳̺̺̝̗͍̹̍͋̾͛͂͑̐̐͂͗̓͛̀͗̒͂͐̄͐̋͂̓̽͑͛̃͑͋͗̐̅̃̂͐̑̋̆͘̚̚͘͠͠͝͠ȩ̸̢̧̟̱̰̱̬̺͖͎̝̣̺̭̬̣̯̦̝̦̺̣̪͇̯̱͕̜̦̞̲͕̟̪̫̫͈̙̹̥̻̳͍͊̊͂̌̃̃̒͊͛̈́͑̏͒̈̾̔̔́͋̈́̅̐̐̆̋́̉́͂̋̀̽̈́̿͌̔̉̂̚̕͘̚͜͜͠ ̴̨̢̨̮̼̘͖̺͙̝̻̯̝̲̠͕͔̝͙̹͔̘̮̺̩̖͎̝͕̭̘̦̠͙̑̄̓͛̈́̏̌̉͗̈̾͊͋̀̈́̀̃͜t̵̡̛̛͓̥͙͉̦̜̠͕̟̩͕̣̯̩̭̩͍̟̥̰̜͉̙̪̗̒̊͛̑͆̔͌͆̈́̏͊̓̌́͂̉͌͌̌̇͌͒̈̉̀̋̀̒̚͠͠͝ḧ̸̨̨̧̡̺͈͎̪͇̗̫͈̦̫̲͚͙̦̮̭̜̰̪̯̱̤̹͖̜̘͔̬̼͙̪̠̙̹̼͕͔̠̭͕͕͇́̀̿̃̀̈́̒͐́́̽̒͌͋̈́̈͐͋̒̌͋̈́̾̔̒̈́̉̇͂̏͒̆͒̄̽͘͘͘͘͜͝͝ͅá̸̢̡̨̛͈̭̼̹̪͕̩̠̺͔͎̞̲͈̖̺͕̟͔͇̼͇͚̭̟͇̦̬̘̩̠̼̹̘̻́͑̂͒͂͂̀͂̋̀̃͂̔͐͗̑͋̓̉͋͆͒̃͑̍̀̎̓̏͐͂̀̎̍͜͜͠͠͠͝ţ̴̡̺̝̣͖̹̟̝̦̩̖̤̺̗͙̩̳̈̄̄͜.̷̡̻̫͎̗̝̣̥̃͌͛̿̉̐̅̉̒̀̈́͗͝͝.̸̢̛͉͔͎̟̘̙̙̤͈̔͆̉̒͆̽̈̏̇͆͛̄̒̌̒̅̈́̀̅̉͋͆̊̃̏͆̆͊̃͆̊̓̄̎͋̈́͛̕̚̕̚̕̚͝ͅ.̷̢̡̢̛͇̲̝̠͈̥͔̮̣̰̰̺̝͔̰̙͎͙̞͔̙̗͐̎̿̂͛̈͒͛͗̽̄̌̈́̊̾̊̀̀̉̓̌̄̾̊͐̇̉̔́͛̈́̀̊̈̔̇͆͗̂̈͑̿͘̕̚̚͝͠͠ͅ \n");

        type_100("\n\nuhhhhh cool?                  \n");
        type_300("              \n");
    }

    // This is the credits
    public static String credits() {
        String credits = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n " +
                " \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "\n\n\n\n\n\n\n\n~~~~~~~~~~~~  CREDITS  ~~~~~~~~~~~~\n\n\n\n\n" +
                "Joseph Vazquez: Code Master\n\n\n\n" +
                "Joseph Vazquez: Art Master\n\n\n\n\n\n" +
                "~~~~\tThank You For Playing\t~~~~\n\n\n";
        return credits;
    }

    // This is like the story mode but the users has to choose how many times they
    // want to play
    public static void endless() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Fish do you feel like you can carry?: ");
        inputPretty();
        int rounds = input.nextInt();
        for (int i = 0; i < rounds; i++) {

            Random rand = new Random();
            System.out.println("\n What power level do you want?: \n* 0\n* 1\n* 2\n ");
            inputPretty();
            int fishRow = input.nextInt();
            if (fishRow == 0 || fishRow == 1 || fishRow == 2) {
                String[][] FishArt = { { "         >()0>" +
                        "       /`\\\n" +
                        "          \\o/       / \n" +
                        "     _____ |  _____/ \n" +
                        "     \\_         _/   \n" +
                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                        "         _\\_   \n" +
                                "       \\/  o\\  \n" +
                                "       //\\___= \n" +
                                "          ''' \n" +
                                "                     /`\\\n" +
                                "          \\o/       / \n" +
                                "     _____ |  _____/ \n" +
                                "     \\_         _/   \n" +
                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                        " \\``/ \n" +
                                "/o `)) \n" +
                                "/_/\\_ss)) \n" +
                                "   |_ss))  /| \n" +
                                "    |__ss))_| \n" +
                                "   |__sss))_| \n" +
                                "   |___ss))\\| \n" +
                                "    |_ss))   \n" +
                                "     )_s))  \n" +
                                "(`(  /_s)) \n" +
                                "(_\\/_s)) \n" +
                                " (\\/)) \n" +
                                "                   /`\\\n" +
                                "          \\o/       / \n" +
                                "     _____ |  _____/ \n" +
                                "     \\_         _/   \n" +
                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                        "     /\"*._          _ \n" +
                                "  .-*'`    `*-.._.-'/ \n" +
                                "< * ))     ,       ( \n" +
                                "  `*-._`._(__.--*\"`.\\ \n" +
                                "                     /`\\\n" +
                                "          \\o/       / \n" +
                                "     _____ |  _____/ \n" +
                                "     \\_         _/   \n" +
                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                        "/`\'''`8-.___\n" +
                                "\\   ._      ) \n" +
                                " '' ''''  ''' \n" +
                                "                     /`\\\n" +
                                "          \\o/       / \n" +
                                "     _____ |  _____/ \n" +
                                "     \\_         _/   \n" +
                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n"
                },

                        { "          ^   \n" +
                                "       /     \\  \n" +
                                "       |     |    \n " +
                                "      |     |     \n" +
                                "       | 0   |   \n" +
                                "       // ||\\\\   \n" +
                                "      (( //  ||   \n" +
                                "       \\\\))  \\\\   \n" +
                                "       //||   ))   \n" +
                                "       ))    //   \n" +
                                "      //     ((   \n" +
                                "                     /`\\\n" +
                                "          \\o/       / \n" +
                                "     _____ |  _____/ \n" +
                                "     \\_         _/   \n" +
                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                "   ><))))))))))'>    /`\\\n" +
                                        "          \\o/       / \n" +
                                        "     _____ |  _____/ \n" +
                                        "     \\_         _/   \n" +
                                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                "                                           =...  \n" +
                                        "                                               *:.. \n " +
                                        "                                               *:=. \n " +
                                        "                                               =-+.  \n" +
                                        "                    #=---------=**-           +:-.. \n" +
                                        "                  -*--=------=--------........:-::  \n" +
                                        "                +---------   :*---:-----:::--:-:  \n" +
                                        "                --==---=        :==---------::  \n" +
                                        "              :+------             :**=:-+#  \n" +
                                        "               +--=--- \n" +
                                        ".-==-.         +=----.  \n" +
                                        "=+==*+=      *----:  \n" +
                                        "--==#%=     :*=--+--  \n" +
                                        "--#======--------+  \n" +
                                        " +.*:====---=---*:  \n" +
                                        "       -#*+*#+:  \n" +
                                        "                     /`\\\n" +
                                        "          \\o/       / \n" +
                                        "     _____ |  _____/ \n" +
                                        "     \\_         _/   \n" +
                                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                "                             -#-#:      \n" +
                                        "                       @+%+*%%*+==+*#%#-. \n" +
                                        "                      =@#*-:**%=::::*#**+# \n" +
                                        "                    ##:::::%-:=::::::=*:.-%: \n" +
                                        "                #*+%**##*-::::::::::::::::::#- \n" +
                                        "               #@=:=#:::::::::::::::::::::.%#@= \n" +
                                        "          #=::-#*#::::-::::::::::::::::::::::-%+ \n" +
                                        "          #=:::::-::+#*%=:::::::::::::::::::::*##@: \n" +
                                        "          *#:::::::#+::+@=::::%%::::::::+@+::+*-@: \n" +
                                        "          +#:::::::+*:::::-:::-@@-:-+:=-:*@#::+#:+# \n" +
                                        "          #-::-*@=:-#@@@@%+:::::::::=#=:::::::*#%#: \n" +
                                        "           +*+-.:@=::::::::::::::::::::::::::-# \n" +
                                        "                #+##-:::::::::-:..........:-:#- \n" +
                                        "                    *#:......-%.+.......**+%%: \n" +
                                        "                      =#+:...:#+.........+%- \n" +
                                        "                        *-#@*=:.....:=#@+ \n" +
                                        "                         -*-....::=#-# \n" +
                                        "                     /`\\\n" +
                                        "          \\o/       / \n" +
                                        "     _____ |  _____/ \n" +
                                        "     \\_         _/   \n" +
                                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                "          :+#%##%##%%%%%%*:\n" +
                                        "         =##%#%#*#%##****#%%%-\n" +
                                        "       +###*##%#%%+:......-*%%+\n" +
                                        "      +#***%###%*:--=+*.-#*-=#%*\n" +
                                        "    +%*#%####%*:=...:=:*%%%-=#%=\n" +
                                        "    :%###%%%###:--....+-=**%%:#%*\n" +
                                        "    =#####%%%%+..:-:.-:=:-##+:+%*:\n" +
                                        "    ++#*%#%*##=------*=-+-:...+%#:\n" +
                                        "   :+*#*#####*--....+*=+=+#*#+*%*:\n" +
                                        "    +%#=######-:..:-:-=:--#+***#*\n" +
                                        "    =*#**##%##+:-=:--..+-#*+%*#%=\n" +
                                        "     #*#+##*#%#-..=:...---%#++%*\n" +
                                        "     :*#%*#%##%#-:-..-*%+.:-=%*\n" +
                                        "       +#%##%**##+-#++*%*.:*#*\n" +
                                        "        :+%%####%%#*----=#%#-\n" +
                                        "           :*##%%%%%%%#%%*:  \n" +
                                        "                     /`\\\n" +
                                        "          \\o/       / \n" +
                                        "     _____ |  _____/ \n" +
                                        "     \\_         _/   \n" +
                                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n"
                        },
                        { "    >())))))))\\/))))))))))0> \n" +
                                "\n" +
                                "          \\o/       / \n" +
                                "     _____ |  _____/ \n" +
                                "     \\_         _/   \n" +
                                "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                "                             -#*: \n" +
                                        "  -                          %#%+ \n" +
                                        "  -@#*                       =%*#%+ \n" +
                                        "    @%##:                   :%##*###*: \n" +
                                        "     #%#**             :*#%*===+++=--=*#- \n" +
                                        "      :%*=+=-#*=+*++#@##@@@@@@@@@@@@@@@@@@%+- \n" +
                                        "      :%*-+###*##@#@#@#@%%##**+*=+-*=-==-+++@@%=- \n" +
                                        "     *@#++:.+*=.:=                 -:.-:.-::-++--+*########*+=- \n" +
                                        "    #@+++         :##%*=       *%%*:-:*-=.:+=: \n" +
                                        "   %#%=            ##%:        #@*+#+ \n" +
                                        "                              =@*#%= \n" +
                                        "                             **-#=' \n " +
                                        "                    /`\\\n" +
                                        "          \\o/       / \n" +
                                        "     _____ |  _____/ \n" +
                                        "     \\_         _/   \n" +
                                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                "               ,  \n" +
                                        "             .' ;  \n" +
                                        "      . - ' ` . '      \n" +
                                        "  , '  . - ' - . ' \\    \n" +
                                        " ;   /          ' - '  \n" +
                                        "   |   \\               , - ,  \n" +
                                        "  \\    ' - . __       )_ ` ' . _  \n" +
                                        "    ' .           ` ` `            ` ` ' - - . _  \n" +
                                        "    . - '  ,                                        ` ' -  .  \n" +
                                        " ' - ' ` - . _                           ( (     o       )  \n" +
                                        "                 ` ' - - . . . . ( ` -  , __ . . - - '  \n" +
                                        "                              ' - ' `    \n" +
                                        "                     \n",
                                "                     =+          =+***= \n" +
                                        "                    :-#*+::::-=*##%%%+  \n" +
                                        "                    ::+%#########%%%+  \n" +
                                        "               +------#########%%##   \n" +
                                        "                =##*########%%###%#*  \n" +
                                        "                 =*%@########%%#%%#*  \n" +
                                        "                   *%####%%######%#*  \n" +
                                        "                   =##**##***######*  \n" +
                                        "                   +##*****##%%##***====\\ \n" +
                                        "                   *####%%%%####*++      \\========  \n" +
                                        "                   +##%%##**+                     \\======\n" +
                                        "                   +#%%#*  \n" +
                                        "                    +%*  \n" +
                                        "                     /`\\\n" +
                                        "          \\o/       / \n" +
                                        "     _____ |  _____/ \n" +
                                        "     \\_         _/   \n" +
                                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n",
                                "  #******+=+#@                           #+=+******# \n" +
                                        "    %#+++++***==#                    #==***+++++*%  \n" +
                                        "      #=====+++*+=*                #++*++======*  \n" +
                                        "       *=======+*++#  @        @  %++*+=======+@  \n" +
                                        "      @+=====++++*+++-:@ @%#@ @--=++*+++++=====%  \n" +
                                        "      *=+**+++=+*+++-=%+--:::-+%=-=++*+=+++***++  \n" +
                                        "     #**++===+**+#  %+==-:::--==+%  %+**+===++**#  \n" +
                                        "    %%%*+===***+%  #==+========+==#  @*+**===+*#%%  \n" +
                                        "        %==*+*+#   *==============+@  %+*+*==# \n" +
                                        "         **+=*+   %*==+========+==+#   *+++#+  \n" +
                                        "         **+=*+@%====+*=+=++=+=*+====# **=+**  \n" +
                                        "         %  %+*#%++*====O====O====*++##*+#  %@  \n" +
                                        "             @++*+**+*#+======+#**+*+*++%  \n" +
                                        "        @*==--=*+++#+*-=#*#**#+:*+**+++*=--=*@   \n" +
                                        "       *===+===-+**#=+*+======+*+=#***========+@  \n" +
                                        "      #=*#  %+===**+**++==--===+**+**+==+##@##==#   \n" +
                                        "      #*     *+++=+=====+=--===+===+===+*#==# %+*   \n" +
                                        "         *+ #*+==+======*====*====+==+++%%===@ @%   \n" +
                                        "         +=*@@**==+====+======++++===++*====+@   \n" +
                                        "     #=---++=+**+===+=====+========++***=++===+%  \n" +
                                        "    +=======+*++*+=======*+*++=====*+++*+=======*   \n" +
                                        "    +========+++*#+++++*++%++*+**+*+++====+======@  \n" +
                                        "    *+======+=====++++==+# *+===========+**+====*  \n" +
                                        "     %*+++##+++======+++%   #++======+++#+===++*  \n" +
                                        "             %*++++++*%       #*++++*%                \n" +
                                        "                     /`\\\n" +
                                        "          \\o/       / \n" +
                                        "     _____ |  _____/ \n" +
                                        "     \\_         _/   \n" +
                                        "~~~~~~~\\_______/~~~~~~~~~~~~~\n"
                        } };

                String[][] FishNames = { { "Anchovy: ", "Goldfish: ", "Seahorse: ", "Toadfish: ", "Old shoe: " },
                        { "Squid: ", "Bass: ", "Eel: ", "Pufferfish: ", "Car tire: " },
                        { "Tuna: ", "Swordfish: ", "Great White Shark: ", "Manta Ray: ", "Cthulhu: " } };

                String FishInfo[][] = { {
                        "\nMany people like anchovies on pizza but they can also concentrate an acid, making them poisonous for humans to consume as a whole.\n",
                        "\nGoldfish can randomly turn carnivorous and are an invasive species if released into the wild.\n",
                        "\nBecause of their body shape, seahorses are rather inept swimmers and can easily die of exhaustion when caught in storm-roiled seas.\n",
                        "\nToadfish are named for their slimy skin which is related to frogs.\n",
                        "\nSize 12 old shoe, its wet and soggy as if it's been underwater for a while, how did it get here?\n" },
                        { "\nSquid have three hearts. Two branchial hearts feed the gills, each surrounding the larger systemic heart that pumps blood around the body.\n",
                                "\nDuring the spawn male bass will nudge females to help stimulate the release of eggs.\n ",
                                "\nEels eat shrimps, snails, fishes, mussels, and worms, and they generally live alone.\n ",
                                "\nPufferfish are ambush predators which detect their prey using pin-sharp vision.\n ",
                                "\nA car tire that looks ripped and torn, how did you get that onto the boat?\n " },
                        { "\nTuna can maintain a body temperature higher than that of the surrounding water, thanks to a network of blood vessels in its body.\n ",
                                "\nSwordfish have a unique organ near their eyes that warm their brains and eyes, allowing them to hunt in colder waters.\n ",
                                "\nShark teeth can move within the jaw, and they use this flexibility to understand what it is they're biting.\n ",
                                "\nThey are harmless to humans and do not have a spine on their tail for defense.\n ",
                                "" } };

                int fishColumn = rand.nextInt(5);
                if (fishColumn == 4 && fishRow == 2) {
                    System.out.println(FishArt[fishRow][fishColumn]);
                    Cthulhu();
                } else {
                    System.out.println(FishArt[fishRow][fishColumn]);
                    System.out.println(FishNames[fishRow][fishColumn]);
                    System.out.println(FishInfo[fishRow][fishColumn]);
                }
            }
            // this is if the users misses
            else {
                type_100("\nPlease type in a vaid power level next time\n");
                type_100("Like wow you missed pretty bad...... like really really bad.....\n\n");
            }
        }

        // This is the endless mode ending
        type_100("\nWell young angler, \nyour \"endless\" rounds are up\n\n");
        type_100(
                "Just like normal story model I really do hope you had fun here seeing all the fishes that you missed\n");
        type_100("Catch! you later!");
        type_100(credits());
        System.exit(0);
    }

    // This method is only to make the users input to look pretty and it lets the
    // user know that its their input
    public static void inputPretty() {
        System.out.print("> ");
    }

    // From the team-
    // This has been Fun, I hope you like my game!
}
