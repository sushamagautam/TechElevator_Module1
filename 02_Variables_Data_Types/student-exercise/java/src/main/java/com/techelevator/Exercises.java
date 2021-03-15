package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		System.out.println("number of birds remaining is: "+remainingNumberOfBirds);

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int playingRacoons = 3;
		int dinnerRacoons = 2;
		int leftRacoons = playingRacoons - dinnerRacoons;
		System.out.println("Racoons left in the woods: "+leftRacoons);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int lessBees = flowers - bees;
		System.out.println("there are "+lessBees+" bees less than flowers");
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int initial = 1;
		int added = 1;
		int total = initial + added;
		System.out.println(total);
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int fenceOwls = 3;
		int newOwlsJoined = 2;
		int totalOwls = fenceOwls + newOwlsJoined;
		System.out.println(totalOwls);
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaverWorking = 2;
		int beaverSwim = 1;
		int remainingAtHome = beaverWorking - beaverSwim;
		System.out.println(remainingAtHome);
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansTreeLimb = 2;
		int joinedToucan = 1;
		int totalToucans = toucansTreeLimb + joinedToucan;
		System.out.println(totalToucans);
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelInTree = 4;
		int nuts = 2;
		int difference = squirrelInTree - nuts;
		System.out.println(difference);

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		final float quarter = .25f, dime = .1f , nickel = .5f ;
		float hiltWallet = quarter + dime + 2*nickel;
		
		System.out.println("she found $"+hiltWallet);
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int mrsBrier = 18;
		int mrsMacAdams = 20;
		int mrsFlannery = 17;
		int totalMuffins = mrsBrier + mrsMacAdams + mrsFlannery;
		System.out.println("First grade baked total muffins "+totalMuffins);
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		int yoyo = 24;
		int whistle = 14;
		int totalCost = yoyo + whistle;
		System.out.println("Mrs. Hilt spent total cost of $"+ totalCost);
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int krsipie = 5;
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		System.out.println(totalMarshmallows);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int mrsHiltSnow = 29;
		int elementarySchool = 17;
		int snowDifference = mrsHiltSnow - elementarySchool;
		System.out.println(snowDifference);
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int totalMoney = 10;
		int toyTruck = 3, pencil = 2;
		int sheHasLeft = totalMoney - (toyTruck + pencil);
		System.out.println("Mrs. Hilt has $"+sheHasLeft);
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int totalMarbles = 16, lostMarbles = 7;
		int nowHeHas = totalMarbles - lostMarbles;
		System.out.println("Marbles he has left: "+ nowHeHas);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int totalSeashells = 25, currentlyHas = 19;
		int moreSheNeeds = totalSeashells - currentlyHas;
		System.out.println("she needs "+moreSheNeeds);
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloons = 17, red = 8;
		int green = totalBalloons - red;
		System.out.println("green balloons = "+green);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int initialNumber = 38, addedBooks = 10;
		int booksOnShelf = initialNumber + addedBooks;
		System.out.println("books on shelf = "+booksOnShelf);
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegs = 6;
		int eightBeeLegs = 8 * beeLegs;
		System.out.println("eight bees have "+eightBeeLegs +" legs");
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		float iceCream = .99f;
		float twoIceCream = 2 * iceCream;
		System.out.println("two icecreams cost $"+twoIceCream);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalRocks = 125, rocksSheHas = 64;
		int rocksSheNeed = totalRocks - rocksSheHas;
		System.out.println("Number of rocks she needs: "+rocksSheNeed);
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int originalMarble = 38, lostMarble = 15;
		int leftMarble = originalMarble - lostMarble ;
		System.out.println("Marble she has left = "+leftMarble);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalMile = 78, droveMile = 32;
		int leftDistance = totalMile - droveMile;
		System.out.println("they have "+leftDistance +" miles left to drive");
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		
		final int MINUTES_IN_HOUR = 60;
		int shovelTime = 90;
		shovelTime += 45;
		int shovelTimeInHours = shovelTime/MINUTES_IN_HOUR;
		int shovelTimeInMinutes = shovelTime%MINUTES_IN_HOUR;
		System.out.println("Mrs. Hilt Has been shoveling a total of "+shovelTimeInHours + " hours and "+ shovelTimeInMinutes +" minutes");
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int hotDogs = 6;
		double eachHotDog = .50;
		double totalSpentOnDogs = hotDogs * eachHotDog;

		System.out.println("she paid a total of $"+totalSpentOnDogs+" for all hot dogs");
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		float sheHas = .50f , pencilRate = .07f;
		float numberOfPencil = sheHas / pencilRate;
		System.out.println("she can buy "+numberOfPencil+"pencils");
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int butterflies = 33, orangeButterflies = 20;
		int redButterflies = butterflies - orangeButterflies;
		System.out.println(redButterflies+" of them were red");
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		int kateNetWorth = 100;
		int costOfCandy = 54;
		double change = (kateNetWorth-costOfCandy)/100d;
		System.out.println("Kate should get back $"+change);
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int markHasNow = 13;
		int moreTree = 12;
		int totalTrees = markHasNow + moreTree;
		System.out.println("Mark will have total tree number: "+totalTrees);
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int oneDay = 24, daysToSeeGranma = 2;
		int hoursToSeeGranma = oneDay * daysToSeeGranma;
		System.out.println("Joy has "+hoursToSeeGranma+" to see her Grandma");
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int totalCousinNumber = 4, gumForEach = 5;
		int totalGum = totalCousinNumber * gumForEach;
		System.out.println("she needs "+totalGum+" gums");
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		int danHas = 3, candyCost = 1;
		int leftMoney = danHas - candyCost;
		System.out.println("Dan has $"+leftMoney+" left");
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boat = 5, peopleInEachBoat = 3;
		int totalPeople = boat * peopleInEachBoat;
		System.out.println(totalPeople);
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int totalLegos = 380, lostLegos = 57;
		int leftLegos = totalLegos - lostLegos;
		System.out.println("Ellen has "+leftLegos+" left legos");
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int bakedMuffins = 35, totalMuffin = 83;
		int moreMuffinsToBake = totalMuffin - bakedMuffins;
		System.out.println(moreMuffinsToBake);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		double willy = 1400, lucy = 290;
		double differenceCrayon = willy - lucy;
		System.out.println("Willy has "+differenceCrayon+"more crayons than Lucy");
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage = 10, totalPages = 22;
		int totalStickers = stickersOnPage * totalPages;
		System.out.println("I have "+totalStickers+" stickers");
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int cupcakes = 96, children = 8;
		int eachGet = cupcakes / children;
		System.out.println("each will get "+eachGet+" cupcakes");
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int totalGingerbread = 47, eachJar = 6;
		int oneJarContains = totalGingerbread / eachJar;
		System.out.println(oneJarContains);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int totalCroissants = 59, neighbors = 8;
		int leftWithMarian = totalCroissants % neighbors;
		System.out.println("Marian will have "+leftWithMarian+" croissants left");
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int totalCookies = 276, placeOnTray = 12;
		int traySheNeeds = totalCookies / placeOnTray;
		System.out.println("She will need "+traySheNeeds+" trays");
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzels = 480, oneServing = 12;
		int biteSizes = pretzels / oneServing;
		System.out.println("Marian will be able to prepare "+biteSizes+" serving of bitesize pretzels");
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcake = 53, leftAtHome = 2, cupcakeInBox = 3;
		int boxes = (lemonCupcake - leftAtHome) / cupcakeInBox;
		System.out.println(boxes+" boxes were given away");
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotStick = 74, noOfPeople = 12;
		int leftUneaten = carrotStick % noOfPeople;
		System.out.println(leftUneaten+" carrot sticks were left uneaten");
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBears = 98, shelfMax = 7;
		int filledShelves = teddyBears / shelfMax;
		System.out.println(filledShelves+" shelves will be filled");
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int totalPictures = 480, albumContains = 20;
		int albumSheNeeds = totalPictures / albumContains;
		System.out.println("She will need "+albumSheNeeds+" albums");
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int tradingCard = 94, fullBox = 8;
		int filledBox = tradingCard / fullBox;
		int cards = tradingCard % fullBox;
		System.out.println(filledBox+"  boxes were filled and there are "+ cards +" unfilled box");
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int booksTotal = 210, shelves = 10;
		int eachShelfContain = booksTotal / shelves;
		System.out.println("each book shelf will contain "+eachShelfContain+" books");
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int bakedCroissants = 17, guestsNumber = 7;
		int guestsReceive = bakedCroissants / guestsNumber;
		System.out.println("each guest will receive "+guestsReceive+" croissants");
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		float bill = 2.15f, jill = 1.90f;
		float hourlyBill = 168 / bill, hourlyJill = 168 / jill;
		float together = hourlyBill + hourlyJill;
		float fiveRoomsArea = 5 * 168;
		float timeToPaintTogether = fiveRoomsArea / together;
		System.out.println("working together, it will take "+timeToPaintTogether+" hours to paint");
		int manyRoomsArea = 623 * 168;
		float timeToPaintRooms = manyRoomsArea / together;
		float daysToPaint = timeToPaintRooms / 8;
		System.out.println("it would take the pair "+daysToPaint+" days to paint 623 rooms");
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
	
		String middleName = "D." ;
		String lastName = "Gautam";
		String firstName = "Sushama";
		String fullName = lastName + ',' + ' ' + firstName + ' ' + middleName;
		System.out.println(fullName);
		
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
		int totalDistance = 800, travelled = 537;
		float completed = (travelled * 100)/totalDistance ;
		System.out.println(completed+"% of trip has been completed");
		

	}

}
