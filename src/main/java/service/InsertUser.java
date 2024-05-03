package service;

import dao.Dao;
import model.User;

public class InsertUser {
    public static void InserirUser (User u){
        String query = String.format("insert into tb_gituser (name, public_repos, following, followers) values ('%s',%s,%s,%s)",u.getName(),u.getPublic_repos(),u.getFollowing(),u.getFollowers());
        Dao.InsertUpdateDeleteCommand(query);
    }
}