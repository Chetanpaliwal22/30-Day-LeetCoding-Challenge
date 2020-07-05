public class Codec {
Map<String, String> hashedStrings = new HashMap<String, String>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int hashedVal = longUrl.hashCode();
        String url = "http://tinyurl.com/"+ hashedVal;
        hashedStrings.put(url,longUrl);
        return url;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return hashedStrings.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
