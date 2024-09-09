import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DVDCollection dvdCollection1 = new DVDCollection("KhanaBadosh" , 2020 , "Jhokay");
        DVDCollection dvdCollection2 = new DVDCollection("Millinoir" , 2020 , "Honey Singh");
        DVDCollection dvdCollection3 = new DVDCollection("RockStar" , 2015, "Mithoon");
        DVDCollection dvdCollection4 = new DVDCollection("RockStart Without Guitar",2024, "Umair");

        DVDCollection[] dvdCollections = new DVDCollection[4];
        dvdCollections[0] = dvdCollection1;
        dvdCollections[1] = dvdCollection2;
        dvdCollections[2] = dvdCollection3;
        dvdCollections[3] = dvdCollection4;

        String directorName = scanner.next();
        scanner.nextLine();
        DVDCollection[] albumsResultByDirectorName = albumsByDirectorNames(dvdCollections,directorName);
        System.out.println(Arrays.toString(albumsResultByDirectorName));

        Integer releaseYear = scanner.nextInt();
        scanner.nextLine();
        DVDCollection[] albumsResultsByReleaseYear = albumsByReleaseYear(dvdCollections,releaseYear);
        System.out.println(Arrays.toString(albumsResultsByReleaseYear));


        String albumsName = scanner.nextLine();
        DVDCollection[] resultsByAlbumsName = albumsByName(dvdCollections, albumsName);
        System.out.println(Arrays.toString(resultsByAlbumsName));





    }

    private static DVDCollection[] albumsByName(DVDCollection[] dvdCollections, String albumsName) {

        System.out.println("Search Albums by Name");

        // Remove spaces and convert the search string to lowercase
        String newName = albumsName.trim().replaceAll("\\s+", " ").toLowerCase();

        // List to store matching albums
        List<DVDCollection> list = new ArrayList<>();

        // Iterate through DVD collections
        for (DVDCollection dvdCollection : dvdCollections) {
            // Remove spaces and convert the collection name to lowercase
            String normalizedCollectionName = dvdCollection.getName().trim().replaceAll("\\s+", " ").toLowerCase();

            // If the names match, add the album to the list
            if (normalizedCollectionName.equalsIgnoreCase(newName)) {
                list.add(dvdCollection);
            }
        }

        if(list.isEmpty())
        {
            System.out.println("Album Not Found");
            return new DVDCollection[]{};
        }


        // Convert the list to an array and return
        return list.toArray(new DVDCollection[0]);
    }

    private static DVDCollection[] albumsByReleaseYear(DVDCollection[] dvdCollection, Integer releaseYear) {
        System.out.println("Search Albums by release Year");

        List<DVDCollection> list = new ArrayList<>();


        for(DVDCollection dvdCollection1: dvdCollection)
        {
            if(dvdCollection1.getReleaseYear() >= releaseYear)
            {
                list.add(dvdCollection1);
            }
        }

        return list.toArray(new DVDCollection[0]);
    }

    private static DVDCollection[] albumsByDirectorNames(DVDCollection[] dvdCollections,String directorName) {
        System.out.println("Search albums by directors names");

        // Used the list because it's dynamically increases the size
        List<DVDCollection> dvdCollectionList = new ArrayList<>();
        for(DVDCollection list: dvdCollections)
        {
            if(list.getDirector().equalsIgnoreCase(directorName))
            {
                dvdCollectionList.add(list);
            }
        }
        return dvdCollectionList.toArray(new DVDCollection[0]);
    }
}
