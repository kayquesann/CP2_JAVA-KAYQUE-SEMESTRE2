package program;

import model.User;
import service.ApiUserGithub;
import service.InsertUser;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\programa\\CP2_JAVA_KAYQUE\\login.txt";
        ApiUserGithub apiUserGithub = new ApiUserGithub();


        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String username = br.readLine();

            while(username != null){
                User user = apiUserGithub.getUser(username);

                String name = user.getName();
                int public_repos = user.getPublic_repos();
                int following = user.getFollowing();
                int followers = user.getFollowers();
                User a = new User(name,public_repos,following,followers);
                InsertUser.InserirUser(a);
                username = br.readLine();
            }
        }catch (IOException e){
            System.out.println("Erro!" + e.getMessage());
        }
    }
}