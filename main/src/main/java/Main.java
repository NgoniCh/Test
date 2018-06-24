public class Main {

    public static void main(String[] args) {
        
        CheckChangesOnGithub checkChangesOnGithub = new CheckChangesOnGithub();
        
        // Replace this token with your actual token
        String token = "4543bf423vrh46e343fw3bd9d54d7342c4dda97575ff6";
    
        String url = "https://github.com/NicholasChoga/NgoniChoga.github.io";
    
        // HttpClient Method to get Private Github content with Basic OAuth token
        checkChangesOnGithub.getGithubContentUsingHttpClient(token, url);
    
        // URLConnection Method to get Private Github content with Basic OAuth token
        checkChangesOnGithub.getGithubContentUsingURLConnection(token, url);
    }
}
