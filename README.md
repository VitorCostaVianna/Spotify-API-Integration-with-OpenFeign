# Spotify API Integration with Spring OpenFeign  

This project demonstrates a simple integration with the Spotify API using Spring Boot and OpenFeign. It allows you to fetch a list of new album releases featured in Spotify, such as those displayed on the “Browse” tab of the Spotify player, using OAuth 2.0 authentication guided by Spotify's official flow.  

## Features  
- **Fetch New Releases**: Retrieves a list of new album releases from Spotify.  
- **Declarative HTTP Client**: Uses **OpenFeign**  for seamless communication with the Spotify API.  
- **OAuth 2.0 Authentication**: Ensures secure and authorized access to Spotify's API.  

## Prerequisites  

Before using the Spotify API, follow these steps to set up your application:  

1. Visit [Spotify Developer Dashboard](https://developer.spotify.com/).  
2. Log in with your Spotify account or create a new one.  
3. Navigate to your profile dashboard.  
4. Create a new app by clicking **"Create an App"**.  
   - Use `http://localhost:8080` as the redirect URI during app creation.  
5. Once the app is created, go to the app's settings and take note of the following basic information:  
   - **Client ID**  
   - **Client Secret**  
   - **Redirect URI**  

With your app ready, you can explore the [Spotify Web API Documentation](https://developer.spotify.com/documentation/web-api/) to discover and use the endpoints that best suit your needs. Start by experimenting with features like fetching playlists, searching for tracks, or accessing user data!  

## How use the Spring Cloud OpenFeign
 
- **Enable Feign Clients** : 
In your Spring Boot application class, add the **@EnableFeignClients** annotation to enable Feign support

- **Define Feign Client Interface**
Create a Feign client interface for communicating with the Spotify API. Here’s an example to fetch new album releases:

```java
@FeignClient(name = "albumSpotifyClient", url = "https://api.spotify.com")
public interface AlbumSpotifyClient {

    @GetMapping(value = "/v1/browse/new-releases")
    AlbumResponse getNewReleases(@RequestHeader("Authorization") String authorization);
}
```

### Explanation of Annotations

- **`@FeignClient`**: 
    This annotation defines the client with the `name` (for identification) and the `url` (base URL for the API).
  
- **`@GetMapping`**: 
    This annotation is used to perform a GET request for fetching the new releases from the Spotify API.

- **`@RequestHeader`**: 
    This annotation is used to pass the `Authorization` header for OAuth2 authentication, allowing your app to securely access the Spotify API.

Here is where you can find more informations about the spring cloud OpenFeign :
-  [Spring Cloud OpenFeign Documentation](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/).

## Getting Started:
 #### Run Locally

Clone the project

```bash
git clone https://link-to-project
```

Go to the project directory

```bash
cd my-project
```

Install dependencies

```bash
npm install
```

Start the server

```bash
npm run start
```
- Configure your Spotify API credentials, including the client ID, client secret, and redirect URI, as per Spotify's OAuth2 flow.
- Run the application to fetch and display the newest albums released on Spotify.

### Future Enhancements:
- Add more endpoints to explore other features of the Spotify API.
- Build a user-friendly frontend to showcase the data.

**This project is perfect for learning how to integrate third-party APIs with Spring Boot, OpenFeign, and OAuth2 authentication.**

## License

[MIT](https://choosealicense.com/licenses/mit/)
