//This is a playlist of my favorite music ♪♪


import java.util.ArrayList;
 
class Playlist {
 
  public static void main(String[] args) {
    
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    desertIslandPlaylist.add("Stuck In The Middle - Tai Verdes");
    desertIslandPlaylist.add("Vatten - Laleh");
    desertIslandPlaylist.add("Hotel California - The Eagles");
    desertIslandPlaylist.add("Take It Easy - The Eagles");
    desertIslandPlaylist.add("Det Kommer Bli Bra - Laleh");
    desertIslandPlaylist.add("Fan De Ti - Sidecars");

       //Delete one of the songs
       
       desertIslandPlaylist.remove("Stuck In The Middle - Tai Verdes");

       //Change the order of two songs, I will change "Take It Easy" for "Vatten".

       int indexA = desertIslandPlaylist.indexOf("Vatten - Laleh");
int indexB = desertIslandPlaylist.indexOf("Take It Easy - The Eagles");

        String tempA = "Vatten - Laleh";

        desertIslandPlaylist.set(indexA,"Take It Easy - The Eagles");

        desertIslandPlaylist.set(indexB, tempA);

       //Print my favorite songs
       
       System.out.println(desertIslandPlaylist);

       //Know how many songs are my favorites
       
       System.out.println(desertIslandPlaylist.size());
       
  }
 
}
