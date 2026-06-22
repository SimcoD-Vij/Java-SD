public class Strings {
    public static void main(String[] args) {
        String str = "Ryt49ryt";
        String str1 = "rYT49RYT";
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.lastIndexOf("yt"));// this ignore case and case insensitive and it will work for
                                                  // substring , not just for a single character
        System.out.println("apple".compareTo("banana"));
        String str2 = "   ";
        System.out.println(str2.isEmpty());
        System.out.println(str2.isBlank());
        System.out.println(str2.strip().isEmpty());

        String str3 = "2443";
        
    }

}
